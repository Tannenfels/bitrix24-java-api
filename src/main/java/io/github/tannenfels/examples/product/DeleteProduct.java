package io.github.tannenfels.examples.product;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.examples.Example;

/**
 * DeleteProduct.
 *
 * @author javastream
 */
public class DeleteProduct extends Example {

    public static void main(String[] args) {
        Client client = boot();

        int productId = AddProduct.handle().getId();

        client.productService().delete(productId);
    }
}