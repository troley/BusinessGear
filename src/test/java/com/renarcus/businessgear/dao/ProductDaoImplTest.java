package com.renarcus.businessgear.dao;

import com.renarcus.businessgear.dao.product.ProductDao;
import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.service.product.ProductServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
/**
 * Created by Troley on 11-4-2017
 */
@ContextConfiguration(locations = "classpath:application-servlet-test.xml")
public class ProductDaoImplTest {

    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ProductDao productDao;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(productService).build();
    }

    @Test
    public void getProductById() throws Exception {

        Product newProduct = productService.getItemById(1);

        assertEquals(1, newProduct.getId());
    }
}
