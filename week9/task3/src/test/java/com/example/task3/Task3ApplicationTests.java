package com.example.task3;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Task3Application.class)
class Task3ApplicationTests {


	@Test
	public void whenSpringContextIsBootstrapped_thenNoExceptions() {
	}

}
