package Veiculo;

public abstract class Veiculo {

    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibe(){
        System.out.println("Modelo: " + getModelo());
    }
}
