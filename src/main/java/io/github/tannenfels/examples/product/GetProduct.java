package io.github.tannenfels.examples.product;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Product;
import io.github.tannenfels.examples.Example;

/**
 * GetProduct.
 *
 * @author javastream
 */
public class GetProduct extends Example {

    public static void main(String[] args) {
        Client client = boot();

        Product product = client.productService().get(4);
    }
}