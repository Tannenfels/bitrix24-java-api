package io.github.tannenfels.examples.productSection;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.ProductSection;

/**
 * GetProductSection.
 *
 * @author javastream
 */
public class GetProductSection {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        ProductSection productSection = client.productSectionService().get(2);
    }
}