package io.github.tannenfels.examples.company;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Company;

import java.util.List;

/**
 * GetListCompany.
 *
 * @author javastream
 */
public class GetListCompany {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        List<Company> companies = client.companyService().getAll();
        System.out.println(companies);
    }
}
