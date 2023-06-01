package io.github.tannenfels.examples.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Lead;
import io.github.tannenfels.examples.Example;

import java.util.List;

/**
 * GetLeadsList.
 *
 * @author javastream
 */
public class GetLeadsList extends Example {

    public static void main(String[] args) {
        Client client = boot();

        List<Lead> leads = client.leadService().getAll();
        System.out.println(leads);
    }
}