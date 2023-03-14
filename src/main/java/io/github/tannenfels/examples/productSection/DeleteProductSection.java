package io.github.tannenfels.examples.productSection;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;

/**
 * DeleteProductSection.
 *
 * @author javastream
 */
public class DeleteProductSection {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        client.productSectionService().delete(2);
    }
}