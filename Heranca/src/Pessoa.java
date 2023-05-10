// Classe Pessoa representa uma pessoa com nome e idade
public class Pessoa {
    private String nome; // nome da pessoa
    private int idade; // idade da pessoa

    // Construtor da classe Pessoa recebe nome e idade e inicializa os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Getter para a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Método que aumenta a idade da pessoa em 1 ano
    public void fazerAniversario() {
        idade++;
    }
}
