/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication49;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        
        String cadena;
        System.out.println("Ingrese una cadena");
        cadena= tc.nextLine();
       String [] frase= cadena.split(" ");
       String invertido="";
       for(int i=frase.length-1; i>=0; i--){
           invertido=invertido+" "+frase[i];
       }
        System.out.println(invertido);
        System.out.println("Cadena de Texto: ' " + cadena + " ' ");
        System.out.println("Tamano de la cadena: "  + cadena.length() + "caracteres");
       }
       
       
            
    }
    

