// Classe Funcionario é uma subclasse de Pessoa, ou seja, um Funcionario é uma Pessoa com um salario
public class Funcionario extends Pessoa {
    private double salario; // salario do funcionario

    // Construtor da classe Funcionario recebe nome, idade e salario e inicializa os atributos da classe pai e da classe filho
    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade); // chama o construtor da classe pai (Pessoa) para inicializar o nome e a idade
        this.salario = salario; // inicializa o salario do funcionario
    }

    // Getter para o salario do funcionario
    public double getSalario() {
        return salario;
    }

    // Setter para o salario do funcionario
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
