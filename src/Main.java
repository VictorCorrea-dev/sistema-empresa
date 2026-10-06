void main() {

    Gerente gerente = new Gerente();
    gerente.nome = "Carlos";
    gerente.idade = 35;
    gerente.salario = 5000;

    gerente.trabalhar();
    gerente.gerenciarEquipe();


    Vendedor vendedor = new Vendedor();
    vendedor.nome = "João";
    vendedor.idade = 28;
    vendedor.salario = 3000;

    vendedor.trabalhar();
    vendedor.realizarVenda();


    Programador programador = new Programador();
    programador.nome = "Pedro";
    programador.idade = 25;
    programador.salario = 4500;

    programador.trabalhar();
    programador.programar();
}



