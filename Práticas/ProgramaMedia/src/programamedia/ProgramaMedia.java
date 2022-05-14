/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programamedia;
import java.util.Scanner;
/**
 *
 * @author Cauã
 */
public class ProgramaMedia {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Sua primeira nota foi?: ");
        float n1 = teclado.nextFloat();
        System.out.print("Sua segunda nota foi?: ");
        float n2 = teclado.nextFloat();
        
        float media = (n1+n2)/2;
        
        System.out.printf("Sua media é %.2f",media);
        
        if(media >= 9){
            System.out.println("Parabéns");
        }
        
    }
}
