package io.github.tannenfels.examples.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Lead;

/**
 * GetLeadById.
 *
 * @author javastream
 */
public class GetLeadById {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Lead lead = client.leadService().get(2);
        System.out.println(lead);
    }
}