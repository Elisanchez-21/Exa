/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication48;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tc= new Scanner(System.in);
       String frase;
        System.out.println("Ingrese una frase");
        frase=tc.nextLine();
        System.out.println("Cadena de Texto: ' " + frase + " ' ");
        System.out.println("Tamano de la cadena: "  + frase.length() + "caracteres");
    }
    
}
