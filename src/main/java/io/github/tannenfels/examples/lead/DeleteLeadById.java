package io.github.tannenfels.examples.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.examples.Example;

/**
 * DeleteLeadById.
 *
 * @author javastream
 */
public class DeleteLeadById extends Example {

    public static void main(String[] args) {
        Client client = boot();

        int leadId = AddNewLead.handle().getId();

        client.leadService().delete(leadId);
    }
}