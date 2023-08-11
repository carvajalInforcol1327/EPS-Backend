package com.gestion.EPS;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gestion.EPS.modelos.*;
import com.gestion.EPS.servicios.*;

@SpringBootApplication
public class GestionEpsBackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(GestionEpsBackendApplication.class, args);
	}

		
}
