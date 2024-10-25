package com.example.app4;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.app4.repository.UserRepository;

@SpringBootApplication
@RequiredArgsConstructor
public class App4Application {
	private final UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(App4Application.class, args);
	}

}
