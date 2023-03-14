package io.github.tannenfels.examples.contact;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Contact;

/**
 * GetContactById.
 *
 * @author javastream
 */
public class GetContactById {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Contact contact = client.contactService().get(74);
    }
}