package Aulas;
import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Aula06 {
    public static void main(String[] args) {

//        EDIÇÃO DE DATA

        Calendar data = Calendar.getInstance();
        data.set(2022, 11, 21);
        System.out.println("Data sem formato: " + data.getTime());

        // Formatando Datas ---------
        DateFormat Formatar_Data = DateFormat.getDateInstance();
                                // Observe o getDATE - de DATA
        System.out.println("Data Formatada: " + Formatar_Data.format(data.getTime()));

        // Formatando Hora ----------
        DateFormat Formatar_hora = DateFormat.getTimeInstance();
                              // Observe o getTIME - de HORA
        System.out.println("Hora formatada: " + Formatar_hora.format(data.getTime()));

        // Formatando Data e Hora
        DateFormat FormatarDataHora = DateFormat.getDateTimeInstance();
        System.out.println("Data e Hora formatada: " + FormatarDataHora.format(data.getTime()));

        System.out.println("----------------- Com o DATE -------------");
        Date hoje = new Date();
        System.out.println("Data de hoje sem formato: " + hoje);

        System.out.println("Data de hoje formatada: " + Formatar_Data.format(hoje));
        System.out.println("Hora de hoje formatada: " + Formatar_hora.format(hoje));
        System.out.println("Data e hora formatada: " + FormatarDataHora.format(hoje));


        System.out.println("---------------------");
        System.out.println("Editando formato");

        FormatarDataHora = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data completa padrão BR: " + FormatarDataHora.format(hoje));

        FormatarDataHora = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data sem dia da semana padrão BR: " + FormatarDataHora.format(hoje));

        FormatarDataHora = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data curta padrão BR: " + FormatarDataHora.format(hoje));

        // DATA COM EDIÃO PERSONALIZADA
        System.out.println("Data personalizada: " + data.get(Calendar.DAY_OF_MONTH) + "/"
                                                  + data.get(Calendar.MONTH) + "/"
                                                  + data.get(Calendar.YEAR));

        SimpleDateFormat formatadorSimples = new SimpleDateFormat("'dia' dd/MM/yyyy', às' hh:mm'h'");
        System.out.println("Data com formato personalizado " + formatadorSimples.format(hoje));


        Locale brasil = new Locale("pt","br");
        Locale italia = Locale.ITALIAN;
        Locale usa = Locale.US;

        DateFormat formatoBrasil = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        DateFormat formatoItalia = DateFormat.getDateInstance(DateFormat.FULL, italia);
        DateFormat formatoUSA = DateFormat.getDateInstance(DateFormat.FULL, usa);

        System.out.println("Data Brasil: " + formatoBrasil.format(hoje));
        System.out.println("Data Italia: "+  formatoItalia.format(hoje));
        System.out.println("Data USA: " + formatoUSA.format(hoje));




    }
}
