package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.controller.ProductCrudController;
import com.renarcus.businessgear.model.Category;
import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.service.category.CategoryService;
import com.renarcus.businessgear.service.product.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Troley on 11-4-2017
 */
public class ProductCrudControllerTest {

    @Mock
    private ProductService productService;

    @Mock
    private CategoryService categoryService;

    @Spy
    private ArrayList<Product> products;

    @InjectMocks
    private ProductCrudController productController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        products = getProducts();
        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    @Test
    public void testAccessCrudMainPage() throws Exception {
        mockMvc.perform(get("/crud/products"))
                .andExpect(status().isOk())
                .andExpect(view().name("crud/product/products"));
        when(productService.getAllItems()).thenReturn(products);
    }

    @Test
    public void testAccessCrudProductCreationPage() throws Exception {
        List<Category> allCategories = categoryService.getAllItems();
        mockMvc.perform(get("/crud/products/create"))
                .andExpect(status().isOk())
                .andExpect(model().attribute(eq("command"), any(Product.class)))
                .andExpect(model().attribute("categories", allCategories))
                .andExpect(view().name("crud/product/create"));
    }

    @Test
    public void testCreateNewProduct() throws Exception {
        mockMvc.perform(post("/crud/products/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
        )
                .andExpect(model().attribute(eq("command"), any(Product.class)))
                .andExpect(redirectedUrl("/crud/products"))
                .andExpect(view().name("redirect:/crud/products"));
    }

    // TODO: more ProductCrudController tests.

    private ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product());
        products.add(new Product());

        return products;
    }
}
