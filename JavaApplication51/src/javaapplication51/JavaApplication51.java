/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication51;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        int aux=0;
                int n=0;
                System.out.println("¿Cuantos vectores desea ingresar");
                    n=tc.nextInt();
                    int a []= new int [n];
                    for(int c=0;c <n;c++){
        System.out.println("Ingresa numero "+(c+1)+" de "+n+": ");
        a [c]=tc.nextInt();
                    
    }
                    System.out.println("\nDespliegue ordeando\n\n");
                    for(int c=0;c<(n-1); c++){
                        for (int b=(c+1);b<n;b++){
                            if (a[c]>a[b]){
                            aux=a[c];
                            a[c]=a[b];
                            a[b]=aux;
                            
                            
                        }
                            
                        }
                    }
                    for (int c=0;c <n; c++){
                        System.out.print(a [c]+" ");
                        tc.close();
                    }
    }
    
}
