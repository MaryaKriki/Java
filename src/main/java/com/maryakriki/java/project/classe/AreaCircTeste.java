package com.maryakriki.java.project.classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        a1.raio = 10;
        //a1.pi = 10;
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5.6);
        a2.raio = 100;
        //a2.pi = 0;
        System.out.println(AreaCirc.area(10));

        //AreaCirc.pi = 3.1415;
        System.out.println(AreaCirc.pi);
        System.out.println(Math.PI);


    }
}
