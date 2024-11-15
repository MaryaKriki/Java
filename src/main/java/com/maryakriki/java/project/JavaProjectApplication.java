package com.maryakriki.java.project;

import com.maryakriki.java.project.escola.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaProjectApplication.class, args);
		Aluno aluno = new Aluno();
		aluno.setNome("Júlia");
		aluno.setSerie(10);
		System.out.println(aluno);

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Júlia");
		aluno2.setSobrenome("Gaio");
		aluno2.setSerie(10);
		System.out.println(aluno2);
	}
}
