package Projects;

public class clientes {

    // Declaracao das variaveis privadas
    private String nome;
    private String email;
    private String endereco;

    // Construtor da classe clientes
    public clientes(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    // Metodo para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Metodo para obter o email do cliente
    public String getEmail() {
        return email;
    }

    // Metodo para obter o endereco do cliente
    public String getEndereco() {
        return endereco;
    }
}
