package com.malex;

import com.malex.model.Product;
import com.malex.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;
import java.util.Random;

/**
 * Config Test environment
 *
 * @author malex
 */
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring.xml")
@EnableTransactionManagement
public class ConfigTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ProductService ps;

    @Test
    @Rollback(value = false)
    public void test() {
        System.out.println(">>>> Test <<<<<");

        Product product = new Product();
        product.setName("Name"+ new Random().nextInt(100));
        ps.add(product);

        System.out.println(">>>> END: Test <<<<<");

    }
}
