/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaidade;
import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author Cauã
 */
public class ProgramaIdade {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Voce nasceu em que ano ?: ");
        int nascimento = teclado.nextInt();
        int idade = Calendar.getInstance().get(Calendar.YEAR) - nascimento;
        System.out.println("Sua idade é "+idade);
        if(idade>= 18){
            System.out.println("Entao voce e maior de idade");
        }else{
            System.out.println("Você ainda e menor de idade então");
        }
        
    }
}
