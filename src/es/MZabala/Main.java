package es.MZabala;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca los números a comparar.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        comparar(a,b);
    }

    /*
    La función main sirve para crear la variable scanner e inicializar los valores a y b.
     */

    private static void comparar(int a, int b) {
        if(a==b){
            System.out.println("Los números introducidos son iguales");
        }else{
            if(a<b){
                System.out.println("El número " +a +" es menor que " +b);
            }else{
                System.out.println("El número " +b +" es menor que " +a);
            }
        }
    }

    /*
    Esta función compara las varibles usadas y saca por pantalla si las variables son iguales o no y cuál es la menor de ambas.
     */
}