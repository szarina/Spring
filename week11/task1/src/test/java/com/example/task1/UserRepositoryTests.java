package com.example.task1;


import static org.assertj.core.api.Assertions.assertThat;

import com.example.task1.product.Product;
import com.example.task1.product.ProductRepository;
import com.example.task1.user.User;
import com.example.task1.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired private UserRepository repo;
    @Autowired private ProductRepository prepo;

    @Test
    public void testCreateUser() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("nam2020");

        User newUser = new User("nam@codejava.net", password);
        User savedUser = repo.save(newUser);

        Product newProduct = new Product("apple",300);
        Product savedProduct = prepo.save(newProduct);

        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
}