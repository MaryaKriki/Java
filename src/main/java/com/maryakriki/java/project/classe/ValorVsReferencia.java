package com.maryakriki.java.project.classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        int a = 2;
        int b = a;

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1," janeiro ",1970);
        Data d2 = d1;

        d1.dia = 31;
        d2.mes = " junho ";

        d1.ano = 2025;

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = " janeiro ";
        d.ano = 1970;
    }
    static void alterarPrimitivo(int a){
        a++;
    }
}
