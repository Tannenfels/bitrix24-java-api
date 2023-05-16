package io.github.tannenfels.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.entity.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ProductServiceTest.
 *
 * @author javastream
 */
public class ProductServiceTest {

    private final Client client = new Client(
            Configs.token,
            Configs.account,
            Configs.restId
    );

    @DisplayName("ProductService.getProductById()")
    @Test
    void testGetProductById() {
        Product product = client.productService().get(2);

        assertEquals(2, product.getId());
    }
}
