package io.github.tannenfels.examples.company;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Company;

/**
 * AddNewCompany.
 *
 * @author javastream
 */
public class AddNewCompany {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Company company = new Company();
        company.setAddress("USA, Delaware");
        company.setTitle("This is title");

        client.companyService().add(company);
    }
}