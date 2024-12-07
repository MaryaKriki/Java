package com.maryakriki.java.project;

import com.maryakriki.java.project.escola.Aluno;
import com.maryakriki.java.project.fundamentos.CanetaPOO;

public class JavaProjectApplication {

	public static void main(String[] args) {
		CanetaPOO c1 = new CanetaPOO();
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.carga = 75;
		c1.tampar();
        c1.status();
		c1.rabiscar();

		CanetaPOO c2 = new CanetaPOO();
		c2.modelo = "transparente";
		c2.cor = "preta";
		c2.ponta = 0.7f;
		c2.carga = 33;
		c2.destampar();
		c2.status();
		c2.rabiscar();

	}
}
