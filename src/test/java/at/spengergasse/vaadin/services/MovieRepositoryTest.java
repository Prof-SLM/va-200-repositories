package at.spengergasse.vaadin.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@Slf4j
@SpringBootTest
@Sql(scripts = {"/_schema.sql"})
//@Sql(scripts = {"/employees_schema.sql", "/import_employees.sql"}, executionPhase = BEFORE_TEST_CLASS)
class MovieRepositoryTest {

//    @Autowired MovieRepository movieRepository;
//
//    @Test
//    void test() {
//        Movie movie = new Movie("Matrix 1", "Tsching Bum Fülm", new ArrayList<>());
//        movie.addRentals( new Rental(234, Duration.ofDays(1)), new Rental(23, Duration.ofDays(4)) );
//        movieRepository.save(movie);
//
//        movie.setTitle("Matrix fuck you");
//        movieRepository.save( movie );
//
//        System.out.println( movieRepository.findAll() ) ;
//    }
}