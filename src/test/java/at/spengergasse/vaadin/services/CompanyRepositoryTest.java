package at.spengergasse.vaadin.services;



import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.jdbc.Sql;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;

@Slf4j
@SpringBootTest
@Sql(scripts = "classpath:test-schema.sql")
public class CompanyRepositoryTest {

//    @Autowired CompanyRepository companies;

    @Test
    void testSave() {
//        Company company = new Company("SPG-Enterprises", new ArrayList<>());
//        company.addPerson(new Person("Max", "Mustermann", new Date()));
//        company.addPerson(new Person("Susi", "Sorglos", new Date()));
//        companies.save( company );

//        System.out.println( companies.findAll() );
    }

    @Test
    void findById() {
//        companies.findById(1L)
//                .ifPresentOrElse(
//                        company -> System.out.println("company=" + company),
//                        () -> System.out.println("NO RESULT"));
    }


    @Test
    void testUpdate() {
//        Company company = new Company("SPG-Enterprises", new ArrayList<>());
//        company.addPerson(new Person("Max", "Mustermann", new Date()));
//        company.addPerson(new Person("Susi", "Sorglos", new Date()));
//        company = companies.save( company );

//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
//        System.out.println("result=" + company);
//        System.out.println("change company");
//        company.setName("Geändert");
//        company = companies.save( company );
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
//        System.out.println("result=" + company);

//        System.out.println( companies.findAll() );
    }


}
