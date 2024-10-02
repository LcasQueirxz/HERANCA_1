import Projects.*;

public class Main {

    public static void main(String[] args) {

        // Criando um objeto da classe fisica com cpf
        fisica c1 = new fisica("Lucas Queiroz", "497.342.588-40", "rua jardins flores", "lucasqueiroz@gmail.com");

        // Criando um objeto da classe pessoaJuridicacom cnpj 
        pessoaJuridica c2 = new pessoaJuridica("Pedro joias", "13.475.978/0001-64", "afonso vergueira", "pedrojoias@outlook.com");

        // Criando um objeto da classe funcionarios com salario
        funcionarios c3 = new funcionarios("Raquel soares", "567.876.908-21", "margarida flortes", 4300);

        // Exibindo as informacoes dos objetos criados no console
        System.out.println(c1); // Exibe  c1
        System.out.println(c2); // Exibe  c2
        System.out.println(c3); // Exibe  c3
    }
}
