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
public class Ejercicio_2_30_SeparacionDeLosDigitosEnUnEntero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int temp1;
        int temp2;
        int temp3;
        int temp4;
        int temp5;
        
        System.out.println("Programa que separa los digitos de un numero de 5 cifras");
        
        System.out.print("Ingrese el entero de 5 digitos: ");
        num = entrada.nextInt();
        
        if(num >9999 && num < 100000){
            temp1 = num % 10;
            num = num / 10;
            temp2 = num % 10;
            num = num / 10;
            temp3 = num % 10;
            num = num / 10;
            temp4 = num % 10;
            num = num / 10;
            temp5 = num % 10;
            
            System.out.println(temp5 + " " + temp4 + " " + temp3 + " " + temp2 + " " + temp1);
        }else{
            System.out.println("¡ERROR! Ingreso un numero que no cuenta con 5 digitos");
        }    
    }
}
