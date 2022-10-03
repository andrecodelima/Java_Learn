package Exercicios;
import java.text.DateFormat;
import java.util.*;
import java.util.Calendar;

public class Aula6_ex01 {
    public static void main(String[] args) {

        /*
        Exiba o seu aniversário com data com formato japones, koreano e francês;
        */

        Calendar data = Calendar.getInstance();
        System.out.println("Data: " + data.getTime());

        Calendar Nascimento = Calendar.getInstance();
        Nascimento.set(1989,(07)-1,25);
        System.out.println(Nascimento.getTime());

        Locale brasil = new Locale("pt", "br");
        DateFormat formatoBrasil = DateFormat.getDateInstance(DateFormat.FULL, brasil);

        System.out.println("Nascimento Formato BR: " + formatoBrasil.format(Nascimento.getTime()));
    }
}
