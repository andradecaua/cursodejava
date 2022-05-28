/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Cauã
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
       float vetor[] = {23.2f, 521.26f, 0.24f, 9.7f};
       Arrays.sort(vetor);  
       for(float c: vetor){
           System.out.print(c + " ");
       }
   }
    
}
