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
public class Ejercicio_2_32_ValoresNegativosPositivosYCeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int post = 0;
        int nega = 0;
        int ceros = 0;
        
        
        System.out.println("Programa que determina la cantida de positivos, negativos y ceros de 5 numeros");
        
        System.out.print("Ingrese el primer entero: ");
        num1 = entrada.nextInt();
        if(num1 > 0){
            post++;
        }else{
            if(num1 < 0){
                nega++;
            }else{
                ceros++;
            }
        }
        
        System.out.print("Ingrese el segundo entero: ");
        num2 = entrada.nextInt();
        if(num2 > 0){
            post++;
        }else{
            if(num2 < 0){
                nega++;
            }else{
                ceros++;
            }
        }
        
        System.out.print("Ingrese el tercer entero: ");
        num3 = entrada.nextInt();
        if(num3 > 0){
            post++;
        }else{
            if(num3 < 0){
                nega++;
            }else{
                ceros++;
            }
        }
        
        System.out.print("Ingrese el cuarto entero: ");
        num4 = entrada.nextInt();
        if(num4 > 0){
            post++;
        }else{
            if(num4 < 0){
                nega++;
            }else{
                ceros++;
            }
        }
        
        System.out.print("Ingrese el quinto entero: ");
        num5 = entrada.nextInt();
        if(num5 > 0){
            post++;
        }else{
            if(num5 < 0){
                nega++;
            }else{
                ceros++;
            }
        }
        
        System.out.println("La cantidad de negativos es: " + nega);
        System.out.println("La cantidad de positivos es: " + post);
        System.out.println("La cantidad de ceros es: " + ceros);
        
    }
}
