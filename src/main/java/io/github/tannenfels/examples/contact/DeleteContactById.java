package io.github.tannenfels.examples.contact;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;

/**
 * DeleteContactById.
 *
 * @author javastream
 */
public class DeleteContactById {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        client.contactService().delete(72);
    }
}