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
public class Ejercicio_2_17_AritmeticaMenorYMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int suma;
        int prom;
        int prod;
        
        System.out.print("Ingrese el primer numero entero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = entrada.nextInt();
        
        System.out.print("Ingrese el tercer numero entero: ");
        num3 = entrada.nextInt();
        
        suma = num1 + num2 + num3;
        System.out.println("La suma de los numeros es: " + suma);
        prom = suma/3;
        System.out.println("El promedio de los numeros es: " + prom);
        prod = num1 * num2 * num3;
        System.out.println("El producto de lo numeros es: " + prod);
        
        if(num1 > num2){
            if(num1 > num3){
                System.out.println(num1 + " es el mas grande");
                if(num2 > num3){
                    System.out.println(num3 + " es el menor");
                }else{
                    System.out.println(num2 + " es el menor");
                }
            }else{
                System.out.println(num3 + " es el mayor");
                System.out.println(num2 + " es el menor");
                
            }
        }else{
            if(num2 > num3){
                System.out.println(num2 + " es el mayor");
                if(num1 > num3){
                    System.out.println(num3 + " es el menor");
                }else{
                    System.out.println(num1 + " es el menor");
                }
            }else{
                System.out.println(num3 + " es el mayor");
                System.out.println(num1 + " es el menor");
            }
        }
    }
}
