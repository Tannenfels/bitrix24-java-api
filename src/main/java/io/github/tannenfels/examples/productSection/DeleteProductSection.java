package io.github.tannenfels.examples.productSection;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.examples.Example;

/**
 * DeleteProductSection.
 *
 * @author javastream
 */
public class DeleteProductSection extends Example {

    public static void main(String[] args) {
        Client client = boot();

        client.productSectionService().delete(2);
    }
}