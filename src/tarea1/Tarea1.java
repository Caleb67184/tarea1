/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Caleb
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz = new int [3][3];
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int cont1 = 0;
        int cont2 = 2;
        int total = 0;
         
        
            //Rellenar la matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                matriz[f][c] = (int)(Math.random()*100);
            }
        }   
        //Mostrar matriz en consola
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("   "+ matriz[i][j]);
            }
            System.out.println(" ");
        }
        
        //Sumatoria de la diagonal1
        for (int i = 0; i < 3; i++) {
                sumaDiagonal1 += matriz[i][i];
            }
            
            System.out.println("Primera diagonal: "+sumaDiagonal1);
            
        //Sumatoria de la diagonal2
        for (int f = 0; f < 3; f++) {
          
            sumaDiagonal2 += matriz[cont1][cont2];
            cont1++; 
            cont2--;   
        }
        
        System.out.println("Segunda diagonal: "+sumaDiagonal2);
        
        total = sumaDiagonal1+sumaDiagonal2;
        System.out.println("Total de las 2 diagonales: "+total);
    }
    
    
}
