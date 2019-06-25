package sb.java.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="sb.java.spring.dao")
public class SpringbootAjaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAjaxApplication.class, args);
	}

}
