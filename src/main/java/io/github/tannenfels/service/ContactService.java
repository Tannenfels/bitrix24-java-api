package io.github.tannenfels.service;

import com.google.gson.Gson;
import io.github.tannenfels.entity.Contact;
import io.github.tannenfels.uriParamsCreator.UriParamsCreator;
import io.github.tannenfels.utils.PushRunner;
import io.github.tannenfels.utils.contact.ParamContactUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

/**
 * ContactService.
 *
 * @author javastream
 */
public class ContactService {

    private Logger logger = LoggerFactory.getLogger(ContactService.class);

    private final static String ADD_METHOD = "crm.contact.add";
    private final static String DELETE_METHOD = "crm.contact.delete";
    private final static String GET_METHOD = "crm.contact.get";
    private final static String UPDATE_METHOD = "crm.contact.update";
    private final static String DELETE_FROM_COMPANY_METHOD = "crm.contact.company.delete";

    public void add(Contact contact) {
        logger.info("Request: Add a new contact: {}", contact.getName());
        try {
            UriParamsCreator params = new ParamContactUtils().addMethod(contact);
            JSONObject result = PushRunner.post(params, ADD_METHOD);
            assert result != null;
            Integer contactId = Integer.parseInt(result.get("result").toString());

            contact.setId(contactId);
        } catch (UnsupportedEncodingException e) {
            logger.error("An error occurred while adding new contact", e);
        }

    }

    public void delete(Integer idContact) {
        logger.info("Request: Delete the contact by id: {}", idContact);
        UriParamsCreator params = new ParamContactUtils().deleteMethod(idContact);
        PushRunner.post(params, DELETE_METHOD);
    }

    public Contact get(Integer idContact) {
        logger.info("Request: Get the contact by id: {}", idContact);
        UriParamsCreator params = new ParamContactUtils().getMethod(idContact);
        JSONObject jsonMain = PushRunner.get(params, GET_METHOD);
        JSONObject jsonResult = jsonMain.getJSONObject("result");
        Gson gson = new Gson();
        return gson.fromJson(jsonResult.toString(), Contact.class);
    }

    public Contact get(Contact contact) {
        return this.get(contact.getId());
    }

    public void update(Contact contact) {
        logger.info("Request: Update the contact by id: {}, name: {}", contact.getId(), contact.getName());
        try {
            UriParamsCreator params = new ParamContactUtils().updateMethod(contact);
            PushRunner.post(params, UPDATE_METHOD);
        } catch (UnsupportedEncodingException e) {
            logger.error("An error occurred while updating contact {}", contact.getId(), e);
        }
    }

    public void addCompanyIntoExistingContactById(Integer idContact, Integer idCompany) {
        UriParamsCreator params = new ParamContactUtils().getParamsForContactCompanyAdd(idContact, idCompany);
        PushRunner.post(params, "uriParams");
    }

    public void deleteCompanyFromExistingContactById(Integer idContact, Integer idCompany) {
        UriParamsCreator params = new ParamContactUtils().getParamsForContactCompanyDelete(idContact, idCompany);
        PushRunner.post(params, DELETE_FROM_COMPANY_METHOD);
    }
}
