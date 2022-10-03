package AulasRevisão_1;
import java.util.*;
public class Data_ex02 {
    public static void main(String[] args) {
//        Receba o dia e o mês de duas datas desse ano e diga quantos dias de distância
//        há entre as duas datas.

          Scanner leia = new Scanner(System.in);
          System.out.println("Informe o primeiro dia: ");
          int dia1 = leia.nextInt();

          System.out.println("Informe o primeiro mês: ");
          int mes1 = leia.nextInt();

          System.out.println("Informe o segundo dia: ");
          int dia2 = leia.nextInt();

          System.out.println("Informe o segundo mês: ");
          int mes2 = leia.nextInt();

          System.out.println(dia1 + "\n" + dia2 + "\n" + mes1 + "\n" + mes2);

          Calendar data1 = Calendar.getInstance();
          data1.set(Calendar.DAY_OF_MONTH,dia1);
          data1.set(Calendar.MONTH, mes1);
          





    }
}
