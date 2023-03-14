package io.github.tannenfels.examples.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Lead;

import java.util.List;

/**
 * GetLeadsList.
 *
 * @author javastream
 */
public class GetLeadsList {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        List<Lead> leads = client.leadService().getAll();
        System.out.println(leads);
    }
}