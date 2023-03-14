package io.github.tannenfels.examples.company;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Company;

/**
 * GetCompanyById.
 *
 * @author javastream
 */
public class GetCompanyById {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Company company = client.companyService().get(2);
        System.out.println("ID = " + company.getId());
    }
}