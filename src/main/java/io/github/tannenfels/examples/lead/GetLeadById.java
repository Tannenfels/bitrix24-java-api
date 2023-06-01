package io.github.tannenfels.examples.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Lead;
import io.github.tannenfels.examples.Example;

/**
 * GetLeadById.
 *
 * @author javastream
 */
public class GetLeadById extends Example {

    public static void main(String[] args) {
        Client client = boot();

        Lead lead = client.leadService().get(2);
        System.out.println(lead);
    }
}