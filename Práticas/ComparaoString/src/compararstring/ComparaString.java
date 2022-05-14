/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compararstring;
/**
 *
 * @author Cauã
 */
public class ComparaString {
    
    public static void main(String args[]){
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        boolean res;
        res = (nome1 == nome3)?true:false;
        System.out.println(res);
    }
    
}
