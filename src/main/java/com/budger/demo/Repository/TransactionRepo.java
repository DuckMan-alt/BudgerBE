package com.budger.demo.Repository;

import com.budger.demo.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction,Integer> {
}
