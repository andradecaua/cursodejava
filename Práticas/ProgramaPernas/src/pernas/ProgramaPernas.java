/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pernas;
import java.util.Scanner;
/**
 *
 * @author Cauã
 */
public class ProgramaPernas {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String tipo;
        System.out.print("Digite a quantidade de pernas, para ver o tipo: ");
        int pernas = teclado.nextInt();
        
        switch (pernas){
            case 1: 
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default: 
                tipo = "ET";           
        }
        
        System.out.println(String.format("O tipo e %s", tipo));
        
    }
}
