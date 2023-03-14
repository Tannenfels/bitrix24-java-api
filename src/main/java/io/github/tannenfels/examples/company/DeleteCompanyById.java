package io.github.tannenfels.examples.company;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;

/**
 * DeleteCompanyById.
 *
 * @author javastream
 */
public class DeleteCompanyById {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        client.companyService().delete(4);
    }
}