/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Cauã
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
      int n;
      int pares = 0;
      int impares = 0;
      int acima100 = 0;
      int total = 0;
      int media = 0;
      int soma = 0;
      do{
       n = Integer.parseInt(JOptionPane.showInputDialog(null, 
               "<html>Informe um número: <br><em>( Valor 0 interrompe )</em></br></html>", "Numeral", JOptionPane.QUESTION_MESSAGE));
       if(n > 100){
           acima100++;
       }
       if(n != 0){

            if(n%2 == 0){
                pares++;
            }else{
              impares++;
            }
           
           total++;
           soma+=n;
       }
      }while(n != 0);
      media = soma/total;
      JOptionPane.showMessageDialog(null,
              "<html>Resultado: <hr>"+
              "Total de valores: "+total+"<br>"+
              "Total de Pares: "+pares+"<br>"+
              "Total de Ímpares: "+impares+"<br>"+
              "Acima de 100: "+acima100+"<br>"+
              "Média dos valores: "+media+"</html>","Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
