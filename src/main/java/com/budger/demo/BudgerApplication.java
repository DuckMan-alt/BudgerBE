package com.budger.demo;

import com.budger.demo.Entity.Account;
import com.budger.demo.Repository.AccountRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BudgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AccountRepo accountRepo){
        return args -> {
            Account dasha = new Account(
                    "dashul'ka",
                    "dudko@gmail.com",
                    27022002,
                    2
            );
            accountRepo.save(dasha);
        };
    }
}
