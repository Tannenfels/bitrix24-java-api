package io.github.tannenfels.examples.contact;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;

/**
 * DeleteCompanyFromExistingContactById.
 *
 * @author javastream
 */
public class DeleteCompanyFromExistingContactById {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        client.contactService().deleteCompanyFromExistingContactById(74, 2);
    }
}
