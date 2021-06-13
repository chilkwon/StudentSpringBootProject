package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
            Student michael = new Student(
                    "michale",
                    "chilhoank@yahoo.ca",
                    LocalDate.of(2000, JANUARY,5)
            );
            Student yun = new Student(
                    "yun",
                    "yun@yahoo.ca",
                    LocalDate.of(2004, JANUARY,5)

            );

            repository.saveAll(
                    List.of(michael,yun)
            );
        };
    }
}

