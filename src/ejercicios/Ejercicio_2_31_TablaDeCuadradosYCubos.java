/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author efrain
 */
public class Ejercicio_2_31_TablaDeCuadradosYCubos {
    public static void main(String[] args) {
        System.out.println("Cuadrado y cubo de los numeros del 0 al 10");
        System.out.println("Numero      Cuadrado    Cubo");
        for (int i = 0; i <= 10; i++) {
            if(i<4){
                System.out.printf("%d           %.0f           %.0f%n", i, Math.pow(i, 2), Math.pow(i, 3));
            }else{
                if(i<10){
                    System.out.printf("%d           %.0f          %.0f%n", i, Math.pow(i, 2), Math.pow(i, 3));
                }else{
                    System.out.printf("%d          %.0f         %.0f%n", i, Math.pow(i, 2), Math.pow(i, 3));
                }
            }
            
        }
    }
}
