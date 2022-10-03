package AulasRevisão_1;
import java.util.*;
public class Data_ex01 {
    public static void main(String[] args) {
        // - EXERCÍCIO 01
        /*
            Crie um IF encadeado que baseado na hora atual, responda
            Bom dia, Boa tarde ou Boa noite.
            Entre 00 e 12 - Bom dia; Entre 12 as 18 - Boa tarde; Entre 18 e 00 Boa noite.
        */

        Calendar data = Calendar.getInstance();
        System.out.println(data.getTime());

        int hora = data.get(Calendar.HOUR_OF_DAY);
        int minutos = data.get(Calendar.MINUTE);

        System.out.println("Horário: " + hora + " horas " + " e " + minutos + " minutos");

        if(((hora >= 0) && (hora <= 12)) && ((minutos >= 0) && (minutos <= 60))){
            System.out.println("Bom dia");
        }else if(((hora >12) && (hora <= 18)) && ((minutos >= 0) && (minutos <= 60)))
            System.out.println("Boa tarde");
        else{
            System.out.println("Boa noite");
        }
    }
}
