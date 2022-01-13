package com.projeto.crm.springbootmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootMysqlApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO consultas (especialidade, nome, localidade, horario, data) VALUES (?, ?, ?, ?, ?)";
		int resultado = jdbcTemplate.update(sql, "Card", "john", "jaba", "Tarde", "2022-01-14 00:00:00");
		if(resultado > 0) {
			System.out.println("Uma nova linha foi inserida!");
			
		}
	}

}
