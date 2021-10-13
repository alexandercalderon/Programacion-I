/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios13092021;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ejercicios130920212 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int horas, dias, semanas, resultado;
        int valor;

        System.out.println("Digita la cantidad de horas");
        valor = in.nextInt();

        if (valor < 24)
        {

            horas = valor;

            System.out.println(valor + " horas equvalen a " + horas + " horas");

        } else if (valor > 24 && valor <= 144)
        {

            dias = valor / 24;
            horas = valor;

            System.out.println(valor + " horas equivalen a " + dias
                    + " dias y " + horas + " horas");

        } else if (valor > 144)
        {

            semanas = valor / 168;
            dias = valor % 168 / 24;
            horas = valor % 24;

            System.out.println(valor + " horas equivalen a " + semanas + " semanas "
                    + dias + " dias y " + horas + " horas");

        }

    }
}
