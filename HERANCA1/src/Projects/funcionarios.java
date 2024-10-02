package Projects;

public class funcionarios {

    // Declaracao das variaveis privadas
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    // Construtor da classe funcionarios
    public funcionarios(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    // Metodo toString para retornar uma representacao em string do objeto
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereco: " + endereco + ", Salario: " + salario;
    }
}
