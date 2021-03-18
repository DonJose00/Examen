/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 * 
 * @author JCoronel
 */

public class c1 {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
      Scanner lector = new Scanner (System.in);
      int n1=1;
      int contador;
      
      System.out.println("Cuantos números deseas imprimir: ");
      contador = lector.nextInt();

        while(n1<=contador){
            System.out.println("El número: " +n1);
            n1++;
}
}
}
