package com.myspringboot.onlinestoreinformation.repository;

import com.myspringboot.onlinestoreinformation.entity.StoreInformation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface StoreInformationRepository extends CrudRepository<StoreInformation,Integer> {
List<StoreInformation> findByStoreName(String name);
List<StoreInformation> findByStorePhoneNumber(String phoneNumber);
List<StoreInformation> findByStoreDetail(String storeDetail);

}
