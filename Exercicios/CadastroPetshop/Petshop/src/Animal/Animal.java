package Animal;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void Pet(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Pet");
        System.out.println("Nome: " + getNome());
    }


}
