package Projects;

public class pessoaJuridica {

    // Declaracao das variaveis privadas
    private String nome;
    private String cnpj;
    private String endereco;
    private String email;

    // Construtor da classe pessoaJuridica
    public pessoaJuridica(String nome, String cnpj, String endereco, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
    }

    // Metodo toString para retornar uma representacao em string do objeto
    public String toString() {
        return "Nome: " + nome + ", CNPJ: " + cnpj + ", Endereco: " + endereco + ", Email: " + email;
    }
}
