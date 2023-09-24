package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        c.helloWorld();
        if(c.somar(1,1) == 2){
            System.out.println("Sucesso");
        }else{
            System.out.println("Falha");
        }
    }
}