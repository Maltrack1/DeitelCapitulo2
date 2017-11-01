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
public class Ejercicio_2_33_CalculadoraDelIndiceDeMasaCorporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double peso;
        double altura;
        double ibm;
        
        System.out.println("Calculadora del indice de masa corporal\n");
        
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = entrada.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        altura = entrada.nextDouble();
        
        ibm = peso / (altura * altura);
        
        System.out.println("\nSu indice de masa corporal es: " + ibm);
        
        System.out.println("\n\nVALORES DE BMI");
        System.out.println("Bajo peso  : menos de 18.5");
        System.out.println("Normal     : entre 18.5 y 24.9");
        System.out.println("Sobrepeso  : entre 25 y 29.9");
        System.out.println("Obeso      : 30 o mas");
    }
}
