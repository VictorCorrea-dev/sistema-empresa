public abstract class Funcionario {

    String nome;
    int idade;
    double salario;

    public void trabalhar() {
        IO.println(nome + " está trabalhando.");
    }
}

public class Gerente extends Funcionario {

    public void gerenciarEquipe() {
        IO.println(nome + " está gerenciando a equipe.");
    }
}

public class Vendedor extends Funcionario {

    public void realizarVenda() {
        IO.println(nome + " está realizando uma venda.");
    }
}

public class Programador extends Funcionario {

    public void programar() {
        IO.println(nome + " está programando.");
    }
}

