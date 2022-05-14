package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos{
    
    public static void main(String[] args){
       
       Scanner teclado = new Scanner(System.in);
       System.out.print("Digite o nome do aluno ");
       String nome = teclado.nextLine();
       System.out.print("Digite a nota do aluno");
       float nota = (float) teclado.nextFloat();
       System.out.printf("A nota de %s é %.4f \n",nome, nota);
        
    }
    
}
