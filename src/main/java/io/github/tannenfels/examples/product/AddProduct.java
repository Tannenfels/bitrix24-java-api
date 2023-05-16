package io.github.tannenfels.examples.product;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Product;
import io.github.tannenfels.examples.Example;

/**
 * AddProduct.
 *
 * @author javastream
 */
public class AddProduct extends Example {

    public static void main(String[] args) {
        Client client = boot();

        Product product = new Product();
        product.setName("MainRouter");

        client.productService().add(product);
    }
}