package at.spengergasse.vaadin;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.core.mapping.JdbcMappingContext;
import org.springframework.data.relational.RelationalManagedTypes;
import org.springframework.data.relational.core.mapping.NamingStrategy;

import java.util.Optional;


@Slf4j
@SpringBootApplication
@NpmPackage(value = "@fontsource/cairo", version = "4.5.0")
@Theme(value = "spg-enterprises")
public class Application implements AppShellConfigurator {

//    @Autowired
//    private DatabaseSeeder dbSeeder;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    private void seed() {
        log.debug("insert data ...");
//        dbSeeder.insertData();
        log.debug("... finished");
    }
}
