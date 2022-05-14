package horadosistema;

import java.util.Date;

public class HoraDoSistema{
    public static void main(String[] args){
        Date relogio = new Date(); // A palavara new cria um novo objeto
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
}