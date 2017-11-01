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
public class Ejercicio_2_16_ComparacionDeEnteros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Ingrese el primer entero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo entero: ");
        num2 = entrada.nextInt();
        
        if(num1 == num2){
            System.out.println("Estos numeros son iguales");
        }else{
            if(num1 > num2){
                System.out.println(num1 + " es mas grande");
            }else{
                System.out.println(num2 + " es mas grande");
            }
        }
    }
}
