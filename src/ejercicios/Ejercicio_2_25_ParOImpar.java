/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author efrain
 */
public class Ejercicio_2_25_ParOImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int resd;
        
        System.out.println("Determinacion si un numero es par o impar");
        System.out.print("Ingrese el numero entero: ");
        num = entrada.nextInt();
        
        resd = num % 2;
        
        if(resd == 0){
            System.out.println("El numero " + num + " es un numero par.");
        }else{
            System.out.println("El numero " + num + " es un numero impar");
        }
        
    }
}
