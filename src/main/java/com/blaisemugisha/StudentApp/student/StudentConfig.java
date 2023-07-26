package com.blaisemugisha.StudentApp.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

             Student blaise= new Student(

                            "Mugisha Blaise",
                            "blaisemugisha1@gmail.com",
                            LocalDate.of(2001, Month.DECEMBER,23)

                    );
            Student bop_daddy= new Student(

                    "Prince Dre",
                    "princedre@gmail.com",
                    LocalDate.of(1999, Month.DECEMBER,23)

            );
            Student olla= new Student(

                    "Musonga Olla",
                    "olla_musonga@gmail.com",
                    LocalDate.of(2010, Month.SEPTEMBER,14)

            );
            Student bebe= new Student(

                    "Joy Mugwaneza",
                    "joy_bebe@gmail.com",
                    LocalDate.of(2001, Month.DECEMBER,22)

            );
            Student aguero= new Student(

                    "Aguero",
                    "mucyo_g@gmail.com",
                    LocalDate.of(2002, Month.DECEMBER,21)

            );
            Student jolivin= new Student(

                    "Jolivin",
                    "jolivin@gmail.com",
                    LocalDate.of(2000, Month.AUGUST,10)

            );
            repository.saveAll(
                    List.of(blaise,olla,bebe,jolivin,aguero,bop_daddy)
            );
        };
    }
}
