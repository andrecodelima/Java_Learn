package Veiculo;

import java.util.Scanner;

public class Carro extends Veiculo{

    private int ano;

    public Carro(String modelo, int ano) {
        super(modelo);
        this.ano = ano;
    }

    public Carro(){}

    public Carro(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static Veiculo cadastro(){
        Carro c = new Carro();

        Scanner sc = new Scanner(System.in);

        System.out.print("Modelo: ");
        c.setModelo(sc.next());

        System.out.print("Ano: ");
        c.setAno(sc.nextInt());

        return c;

    }

    public void exibe(){
        super.exibe();
        System.out.println("Ano: " + getAno());
    }
 }
