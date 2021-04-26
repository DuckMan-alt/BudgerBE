package com.budger.demo.Repository;

import com.budger.demo.Entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepo extends JpaRepository<Goal,Long> {
}
