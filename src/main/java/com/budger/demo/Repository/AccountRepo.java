package com.budger.demo.Repository;

import com.budger.demo.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AccountRepo extends JpaRepository<Account,Long> {

    //@Query("SELECT ac FROM Account ac where ac.email = ?1")
    Account findAccountByEmail(String email);

    List<Account> findAccountByUsernameEqualsAndPasswordEquals(
            String username,Integer password);
}
