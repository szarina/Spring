package com.example.task2;

import com.example.task2.wsdl.NumberToDollarsResponse;
import com.example.task2.wsdl.NumberToWordsResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.math.BigInteger;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		SpringApplication.run(Task2Application.class, args);
	}

	@Bean
	CommandLineRunner lookup(SoapClient soapClient) {
		return args -> {
			BigInteger num = BigInteger.valueOf(123);
			BigDecimal num2 = BigDecimal.valueOf(123.4);


			if (args.length > 0) {
				num = BigInteger.valueOf(Long.parseLong(args[0]));
				num2 = BigDecimal.valueOf(Long.parseLong(args[1]));

			}

			NumberToWordsResponse response = soapClient.numberToWords(num);
			System.err.println(response.getNumberToWordsResult());
			NumberToDollarsResponse response1 = soapClient.numberToDollars(num2);
			System.err.println(response1.getNumberToDollarsResult());

		};
	}

}
