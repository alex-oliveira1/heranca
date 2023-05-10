// Classe Main contém o método principal que testa a herança e os objetos das classes Pessoa e Funcionario
public class Main {

    public static void main(String[] args) {
        
        // Cria um objeto Pessoa e exibe o nome e a idade
        Pessoa pessoa1 = new Pessoa("Alice", 25);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        // Cria um objeto Funcionario e exibe o nome, a idade e o salario
        Funcionario funcionario1 = new Funcionario("João", 30, 3000.0);
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Salário: " + funcionario1.getSalario());

        // Chama o método fazerAniversario da classe Pessoa, que aumenta a idade em 1 ano, para o objeto Funcionario
        funcionario1.fazerAniversario();
        System.out.println("Nova idade: " + funcionario1.getIdade());
        
    }

}
