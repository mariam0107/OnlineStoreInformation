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
		StoreInformation storeInformationOne = new StoreInformation("GCP","Store details 1","12345");
		StoreInformation storeInformationTwo = new StoreInformation("Amazon","Store details 2","54321");
		StoreInformation storeInformationThree = new StoreInformation("Flipkart","Store details 3","678910");
		StoreInformation storeInformationFour = new StoreInformation("Myntra","Store details 3","019876");
		storeInformationRepository.save(storeInformationOne);
		storeInformationRepository.save(storeInformationTwo);
		storeInformationRepository.save(storeInformationThree);
		storeInformationRepository.save(storeInformationFour);
		storeInformationRepository.findByStoreName("GCP").forEach(val -> System.out.println(val));
		storeInformationRepository.findByStoreDetail("Store details 3").forEach(val -> System.out.println(val));
		storeInformationRepository.findByStorePhoneNumber("678910").forEach(val -> System.out.println(val));
		storeInformationRepository.findByStorePhoneNumber("678910").forEach(val -> System.out.println(val));
		storeInformationRepository.findById(3).ifPresent(val -> System.out.println(val));
		System.out.println(storeInformationRepository.count());
		storeInformationRepository.deleteById(3);
		System.out.println(storeInformationRepository.count());
	}
}
