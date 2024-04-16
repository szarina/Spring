package com.example.task22;

import com.example.task22.user.Role;
import com.example.task22.user.User;
import com.example.task22.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Task22Application {


	public static void main(String[] args) {
		SpringApplication.run(Task22Application.class, args);



	}

}
