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
public class Ejercicio_2_28_DiametroCircunferenciaYAreaDeUnCirculo {
    public static void main(String[] args) {
        System.out.println("Programa que determina el diametro, la circunferencia y el area de un circulo con radio entero");
        Scanner entrada = new Scanner(System.in);
        int radio;
        
        System.out.print("Ingrese el radio del circulo (recuerde que debe ser entero): ");
        radio = entrada.nextInt();
        
        System.out.printf("El diametro del circulo es: %d%n", 2*radio);
        System.out.printf("La circunferencia del circulo es: %f%n", 2*Math.PI*radio);
        System.out.printf("El area del circulo es: %f%n", Math.PI*Math.pow(radio, 2));
    }
}
