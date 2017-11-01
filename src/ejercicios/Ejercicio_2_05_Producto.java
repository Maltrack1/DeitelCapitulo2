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
public class Ejercicio_2_05_Producto {
    //El metodo main empieza la ejecucion de la aplicacion en Java
    public static void main(String[] args) {
        //Crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int x;//Primer numero introducido por el usuario
        int y;//Segundo numero introducido por el usuario
        int z;//Tercer numero instroducido por el usuario
        int resultado;//Producto de los numeros
        
        System.out.print("Escriba el primer entero: ");//Indicador
        x = entrada.nextInt();//Obtiene la entrada del usuario y lo asigna a la variable
        
        System.out.print("Escriba el segundo entero: ");//Indicador
        y = entrada.nextInt();//Obtiene la entrada del usuario y lo asigna a la variable
        
        System.out.print("Escriba el tercer entero: ");//Indicador
        z = entrada.nextInt();//Obtiene la entrada del usuario y lo asigna a la variable
        
        resultado = x * y * z;//Calcula el producto de los numeros
        
        System.out.printf(" El producto es %d%n", resultado);
    }//Fin del metodo main
}//Fin de la clase Producto