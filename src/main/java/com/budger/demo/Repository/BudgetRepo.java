package com.budger.demo.Repository;

import com.budger.demo.Entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepo extends JpaRepository<Budget,Long>{

}
