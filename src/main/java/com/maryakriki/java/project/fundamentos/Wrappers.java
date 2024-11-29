package com.maryakriki.java.project.fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        //Wrappers são classes onde ficam os tipos primitivos
        //Para inferir uma classe, escrever com primeira letra maiúscula

        Byte b = 100;
        Short s = 1000;
        //Integer.parseInt(entrada.next());
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean boo = Boolean.parseBoolean("true");
        System.out.println(boo);
        System.out.println(boo.toString().toUpperCase());
    }
}
