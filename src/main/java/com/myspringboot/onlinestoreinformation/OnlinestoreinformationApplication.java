package com.myspringboot.onlinestoreinformation;

import com.myspringboot.onlinestoreinformation.entity.StoreInformation;
import com.myspringboot.onlinestoreinformation.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinestoreinformationApplication implements CommandLineRunner {

	@Autowired
	StoreInformationRepository storeInformationRepository;
	public static void main(String[] args) {
		SpringApplication.run(OnlinestoreinformationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		StoreInformation storeInformationOne = new StoreInformation("GCP","Store details","12345");
		storeInformationRepository.save(storeInformationOne);
		storeInformationRepository.findByStoreName("GCP").forEach(val -> System.out.println(val));
	}
}
