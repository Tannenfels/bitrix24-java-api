package io.github.tannenfels.examples.contact;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Contact;
import io.github.tannenfels.entity.types.TypeIdContact;

/**
 * CreateNewContact.
 *
 * @author javastream
 */
public class CreateNewContact {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Contact contact = new Contact("Robert", "Klein");

        contact.setTypeId(TypeIdContact.CLIENT.getCode());
        contact.setAddress("USA, Delaware");
        contact.setComments("best contact");
        contact.setCompanyId("2");

        client.contactService().add(contact);
    }
}