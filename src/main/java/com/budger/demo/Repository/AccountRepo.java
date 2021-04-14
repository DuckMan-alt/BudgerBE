package com.budger.demo.Repository;

import com.budger.demo.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,Long> {
}
