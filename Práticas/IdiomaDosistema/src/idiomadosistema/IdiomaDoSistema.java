package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
        
    public static void main(String[] args){
          
        Object idoma = Locale.getDefault().getDisplayLanguage();
        
        System.out.println("O seu sistema está em");
        System.out.println(idoma.toString());
    }
    
}