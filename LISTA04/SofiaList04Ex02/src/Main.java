//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);

    int numeroDeFilhos = 0;
    int opcao = 0;
    float salario = 0;
    int contador = 0;
    float mediaSalario = 0;
    float somaSalario= 0;
    int somaFilhos = 0;
    int mediaFilhos = 0;
    int maiorSalario = 0;

    System.out.println("Digite 1 para iniciar o programa e 2 para finalizar");
    opcao = input.nextInt();

    if (opcao == 1) {
        while (opcao == 1) {
            contador++;
            System.out.println(".:PESQUISA DA PREFEITURA");
            System.out.print("Informe seu salário: ");
            salario = input.nextFloat();
            somaSalario += salario;

            System.out.print("Informe sua quantidade de filhos:");
            numeroDeFilhos = input.nextInt();
            somaFilhos = numeroDeFilhos;


            System.out.print("Digite 1 para continuar e 2 para finalizar");
            opcao = input.nextInt();

        }
        mediaSalario = somaSalario / contador;
        mediaFilhos = somaFilhos/contador;
        System.out.println("A média salarial é: " + mediaSalario);
        System.out.println("A média de filhos é: " + mediaFilhos);

    } else {
        System.out.println("Programa finalizado!");
    }
}



