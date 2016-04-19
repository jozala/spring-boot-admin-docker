package pl.aetas.springbootadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminDockerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootAdminDockerApplication.class, args);
  }
}
