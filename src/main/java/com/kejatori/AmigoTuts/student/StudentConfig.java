package com.kejatori.AmigoTuts.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student kevin = new Student("Kevin James Rivera", "riverakevinjames@gmail.com", LocalDate.of(1999, Month.FEBRUARY, 13));
            Student claridel = new Student("Claridel Pagcu", "claridel.pagcu@gmail.com", LocalDate.of(2000, Month.FEBRUARY, 12));
            studentRepository.saveAll(List.of(kevin, claridel));
        };
    }
}
