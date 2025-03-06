package movie_management_proto_service.movie_management_proto_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) // TODO: come back and not exlcude this when finalizing the database
public class MovieManagementProtoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieManagementProtoServiceApplication.class, args);
	}
}
