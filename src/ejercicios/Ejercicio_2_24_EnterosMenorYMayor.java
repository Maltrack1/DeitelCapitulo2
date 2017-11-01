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
public class Ejercicio_2_24_EnterosMenorYMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        
        System.out.print("Ingrese el primer entero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo entero: ");
        num2 = entrada.nextInt();
        
        System.out.print("Ingrese el tercer entero: ");
        num3 = entrada.nextInt();
        
        System.out.print("Ingrese el cuarto entero: ");
        num4 = entrada.nextInt();
        
        System.out.print("Ingrese el quinto entero: ");
        num5 = entrada.nextInt();
        
        //Algoritmo para encontrar el mayor
        if(num1 > num2){
            if(num1 > num3){
                if(num1 > num4){
                    if(num1>num5){
                        System.out.println("El numero mayor es: " + num1);
                    }else{
                        System.out.println("El numero mayor es: " + num5);
                    }
                }else{
                    if(num4 > num5){
                        System.out.println("El numero mayor es: " + num4);
                    }else{
                        System.out.println("El numero mayor es: " + num5);
                    }
                }
            }else{
                if(num3 > num4){
                    if(num3 > num5){
                        System.out.println("El numero mayor es: " + num3);
                    }else{
                        System.out.println("El numero mayor es: " + num5);
                    }
                }else{
                    if(num4 > num5){
                        System.out.println("El numero mayor es: " + num4);
                    }else{
                        System.out.println("El numero mayor es: " + num5);
                    }
                }
            }
        }else{
            if(num2 > num3){
                if(num2 > num4){
                    if(num2 > num5){
                        System.out.println("El numero mas grande es: " + num2);
                    }else{
                        System.out.println("El numero mas grande es: " + num5);
                    }
                }else{
                    if(num4 > num5){
                        System.out.println("El numero mas grande es: " + num4);
                    }else{
                        System.out.println("El numero mas grande es: " + num5);
                    }
                }
            }else{
                if(num3 > num4){
                    if(num3 > num5){
                        System.out.println("El numero mayor es: " + num3);
                    }else{
                        System.out.println("El numero mayor es: " + num5);
                    }
                }else{
                    if(num4 > num5){
                        System.out.println("El numero mayor es: " + num4);
                    }else{
                        System.out.println("El numero mayor es: " + num5);
                    }
                }
            }
        }
        
        
        //Algoritmo para encontar el menor
        if(num1 < num2){
            if(num1 < num3){
                if(num1 < num4){
                    if(num1 < num5){
                        System.out.println("El numero menor es: " + num1);
                    }else{
                        System.out.println("El numero menor es: " + num5);
                    }
                }else{
                    if(num4 < num5){
                        System.out.println("El numero menor es: " + num4);
                    }else{
                        System.out.println("El numero menor es: " + num5);
                    }
                }
            }else{
                if(num3 < num4){
                    if(num3 < num5){
                        System.out.println("El numero menor es: " + num3);
                    }else{
                        System.out.println("El numero menor es: " + num5);
                    }
                }else{
                    if(num4 < num5){
                        System.out.println("El numero menor es: " + num4);
                    }else{
                        System.out.println("El numero menor es: " + num5);
                    }
                }
            }
        }else{
            if(num2 < num3){
                if(num2 < num4){
                    if(num2 < num5){
                        System.out.println("El numero menor es: " + num2);
                    }else{
                        System.out.println("El numero menor es: " + num5);
                    }
                }else{
                    if(num4 < num5){
                        System.out.println("El numero menor es: " + num4);
                    }else{
                        System.out.println("El numero menor es: " + num5);
                    }
                }
            }else{
                if(num3 < num4){
                    if(num3 < num5){
                        System.out.println("El numero menor es: " + num3);
                    }else{
                        System.out.println("El numero menor es: " + num5);
                    }
                }else{
                    if(num4 < num5){
                        System.out.println("El numero menor es: " + num4);
                    }else{
                        System.out.println("El numero menor es: " + num5);
                    }
                }
            }
        }
    }
}
