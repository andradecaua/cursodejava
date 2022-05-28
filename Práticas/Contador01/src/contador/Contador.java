/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador;

/**
 *
 * @author Cauã
 */
public class Contador {
    public static void main(String args[]){
        int cc = 0;
        while(cc<10){
            cc++;
            if(cc == 0 || cc == 2 || cc == 6){
               continue;
            }
            if(cc == 7){
                break;
            }
            System.out.println("Cambalhota " + (cc));
        }
        System.out.println("Fim das cambalhotas");
    }
}
