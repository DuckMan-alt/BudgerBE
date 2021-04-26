package com.budger.demo.Repository;

import com.budger.demo.Entity.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonalInfoRepo extends JpaRepository<PersonalInfo,Integer> {
    @Query(value = "Select id from account where email = ?1", nativeQuery = true)
    String addIdByEmail(String email);
}
