package io.github.tannenfels.examples.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Lead;
import io.github.tannenfels.entity.model.Email;
import io.github.tannenfels.entity.model.Website;
import io.github.tannenfels.entity.types.*;
import io.github.tannenfels.examples.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * UpdateLeadById.
 *
 * @author javastream
 */
public class UpdateLeadById extends Example {

    public static void main(String[] args) {
        Client client = boot();
        
        int leadId = AddNewLead.handle().getId();
        
        Lead lead = client.leadService().get(leadId);

        assert lead != null;
        lead.setName("Albert");
        lead.setLastName("Shtein");
        lead.setAddress("West Olympic Boulevard Apt. 100");
        lead.setComments("Interested in price");
        lead.setStatusId(StatusIdType.PROCESSED.getCode());
        lead.setCurrencyId(CurrencyIdType.EUR.getCode());
        lead.setSourceId(SourceIdType.RECOMMENDATION.getCode());

        // set email
        List<Email> listEmail = new ArrayList<>();
        Email email = Email.builder()
                .value("albert@gmail.com").valueType(EmailType.PRIVATE.getCode()).build();
        listEmail.add(email);
        lead.setEmails(listEmail);
        client.leadService().update(lead);

        // update existing website
        if (lead.getWebsites() != null) {
            Website website = lead.getWebsites().get(0);
            website.setValue("www.albert-best.org");
            website.setValueType(WebsiteType.OTHER.getCode());
            List<Website> websitList = new ArrayList<>();
            websitList.add(website);
            lead.setWebsites(websitList);
        }

        client.leadService().update(lead);
    }
}