package application;

import entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Triangule x = new Triangule();
        Triangule y = new Triangule();

        System.out.println("Enter the measures of Triangule X: ");
        x.a = ler.nextDouble();
        x.b = ler.nextDouble();
        x.c = ler.nextDouble();

        System.out.println("Enter the measures of Triangule Y: ");
        y.a = ler.nextDouble();
        y.b = ler.nextDouble();
        y.c = ler.nextDouble();

        double p = (x.a + x.b + x.c)/2.0;
        double areaX = x.area();

        p = (y.a + y.b + y.c)/2.0;
        double areaY = y.area();

        System.out.println("Triangule X area: " + areaX);
        System.out.println("Triangule Y area: " + areaY);

        if(areaX > areaY) {
            System.out.println("Larger area X");
        }else {
            System.out.println("Larger area Y");
        }

    }


}
