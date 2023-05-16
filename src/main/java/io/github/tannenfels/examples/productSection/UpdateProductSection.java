package io.github.tannenfels.examples.productSection;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.ProductSection;
import io.github.tannenfels.examples.Example;

/**
 * UpdateProductSection.
 *
 * @author javastream
 */
public class UpdateProductSection extends Example {

    public static void main(String[] args) {
        Client client = boot();

        ProductSection productSection = client.productSectionService().get(2);
        productSection.setName("VIP");

        client.productSectionService().update(productSection);
    }
}