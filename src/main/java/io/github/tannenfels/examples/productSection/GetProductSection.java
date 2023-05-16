package io.github.tannenfels.examples.productSection;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.ProductSection;
import io.github.tannenfels.examples.Example;

/**
 * GetProductSection.
 *
 * @author javastream
 */
public class GetProductSection extends Example {

    public static void main(String[] args) {
        Client client = boot();

        ProductSection productSection = client.productSectionService().get(2);
    }
}