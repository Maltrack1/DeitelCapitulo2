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
public class Ejercicio_2_15_Aritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int suma;
        int producto;
        int diferencia;
        double cociente1;
        double cociente2;
        
        System.out.print("Ingrese el primer entero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo entero: ");
        numero2 = entrada.nextInt();
        suma = numero1 + numero2;
        producto = numero1 * numero2;
        
        cociente1 = numero1 / numero2;
        cociente2 = numero2 / numero1;
        
        System.out.println("La suma de los numero es: " + suma);
        System.out.println("El producto de los numeros es: " + producto);
        if(numero1 > numero2){
            diferencia = numero1 - numero2;
            System.out.println("La diferencia de " + numero1 + " - " + numero2 + " es: " + diferencia);
        }else{
            diferencia = numero2 - numero1;
            System.out.println("La diferencia de " + numero2 + " - " + numero1 + " es: " + diferencia);
            }
        System.out.println("El cociente de " + numero1 + " / " + numero2 + " es: " + cociente1);
        System.out.println("El cociente de " + numero2 + " / " + numero1 + " es: " + cociente2);        
    }
}
