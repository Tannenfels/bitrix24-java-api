package io.github.tannenfels.examples.productSection;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.ProductSection;
import io.github.tannenfels.examples.Example;

/**
 * AddNewProductSection.
 *
 * @author javastream
 */
public class AddNewProductSection extends Example{

    public static void main(String[] args) {
        Client client = boot();

        ProductSection productSection = new ProductSection();
        productSection.setSectionId(12); // Main category

        client.productSectionService().add(productSection);
    }
}