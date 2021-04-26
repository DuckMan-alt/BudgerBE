package com.budger.demo;

import com.budger.demo.Entity.Account;
import com.budger.demo.Entity.PersonalInfo;
import com.budger.demo.Entity.UserRole;
import com.budger.demo.Repository.AccountRepo;
import com.budger.demo.Repository.PersonalInfoRepo;
import com.budger.demo.Repository.UserRoleRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BudgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AccountRepo accountRepo, UserRoleRepo userRoleRepo,PersonalInfoRepo personalInfoRepo){
        return args -> {
            UserRole admin = new UserRole("admin");
            userRoleRepo.save(admin);
            Account dima = new Account(
                    "M_Duck",
                    "mikhno@icloud.com",
                    12345678
            );
            dima.setAccount_role(admin);
            accountRepo.save(dima);

            System.out.println(accountRepo.findById(1L).toString());

            PersonalInfo dimaInfo = new PersonalInfo("Dmitry","Mikhno",new Date(100,6,4));
            dimaInfo.setAccount(dima);
            personalInfoRepo.save(dimaInfo);

            System.out.println(accountRepo.findById(1L).toString());

            System.out.println(personalInfoRepo.findById(1).toString());

            accountRepo.deleteAll();
            System.out.println(personalInfoRepo.count());
            System.out.println(userRoleRepo.count());
        };
    }

}
