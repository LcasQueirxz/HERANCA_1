package Projects;

public class fisica {

    // Declaracao das variaveis privadas
    private String nome;
    private String cpf;
    private String endereco;
    private String email;

    // Construtor da classe fisica
    public fisica(String nome, String cpf, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }

    // Metodo toString para retornar uma representacao em string do objeto
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereco: " + endereco + ", Email: " + email;
    }
}
