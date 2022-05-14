package resolucaodosistema;

import java.awt.Toolkit;

public class ResolucaoDoSistema{
    
    public static void main(String[] args){
        
       var resolucao = Toolkit.getDefaultToolkit().getScreenSize();       
       System.out.println("A resolução do sistema é "+resolucao.width+" x "+resolucao.height);
    }
    
}

