package io.github.tannenfels.examples.contact;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Contact;

/**
 * AddCompanyIntoExistingContactById.
 *
 * @author javastream
 */
public class AddCompanyIntoExistingContactById {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Contact contact = client.contactService().get(74);
        contact.setCompanyId("2");

        client.contactService().addCompanyIntoExistingContactById(74, 2);
    }
}