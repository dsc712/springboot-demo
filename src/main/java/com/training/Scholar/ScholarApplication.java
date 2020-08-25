package com.training.Scholar;

import com.training.Scholar.data.entity.Scholar;
import com.training.Scholar.data.repository.ScholarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ScholarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScholarApplication.class, args);
	}

	@RestController
	@RequestMapping("/scholars")
	public class ScholarController {
		@Autowired
		private ScholarRepository scholarRepository;

		@GetMapping
		public Iterable<Scholar> getScholars() {
			return this.scholarRepository.findAll();
		}
	}
}
