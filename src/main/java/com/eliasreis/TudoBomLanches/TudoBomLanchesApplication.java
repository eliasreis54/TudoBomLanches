package com.eliasreis.TudoBomLanches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eliasreis.TudoBomLanches.ingredientes.Alface;

@SpringBootApplication
public class TudoBomLanchesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TudoBomLanchesApplication.class, args);
		
		Alface c = new Alface(10);
		System.out.println(c.getValorTotal());
	}
}
