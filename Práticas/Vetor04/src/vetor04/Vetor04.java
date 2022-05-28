/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;
import java.util.Arrays;
/**
 *
 * @author Cauã
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for(int i: vet){
            System.out.print(i+ " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 8 );
        System.out.println("A posicao do valor 1 no vetor e "+p);
    }
    
}
