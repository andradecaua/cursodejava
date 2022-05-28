/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Calendar;
/**
 *
 * @author Cauã
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", 
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        
        int fev = ano%4 == 0?29:28;
        
        int dias[] = {31, fev, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};
        
        for(int i = 0; i < mes.length; i++){
            
            System.out.println("O mes de "+mes[i]+" possui "+dias[i]+" dias");
            
        }
        
    }
    
}
