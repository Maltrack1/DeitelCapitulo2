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
public class Ejercicio_2_26_Multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Programa que determina si los numeros son multiplos");
        
        int num1;
        int num2;
        int temp;
        
        System.out.print("Ingrese el primer entero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo entero: ");
        num2 = entrada.nextInt();
        
        if(num2 > num1){
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        
        temp = num1 % num2;
        
        if(temp == 0){
            System.out.println("El numero " + num1 + " es multiplo de " + num2);
        }else{
            System.out.println("Los numeros no son multiplos");
        }
    }
}
