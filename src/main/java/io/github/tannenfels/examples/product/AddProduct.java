package io.github.tannenfels.examples.product;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Product;

/**
 * AddProduct.
 *
 * @author javastream
 */
public class AddProduct {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Product product = new Product();
        product.setName("MainRouter");

        client.productService().add(product);
    }
}