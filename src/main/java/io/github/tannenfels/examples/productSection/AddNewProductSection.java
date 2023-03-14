package io.github.tannenfels.examples.productSection;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.ProductSection;

/**
 * AddNewProductSection.
 *
 * @author javastream
 */
public class AddNewProductSection {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        ProductSection productSection = new ProductSection();
        productSection.setSectionId(12); // Main category

        client.productSectionService().add(productSection);
    }
}