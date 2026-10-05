//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner input = new Scanner(System.in);

        int numero;
        int  resultado = 1;

        System.out.print("Digite um numero inteiro: ");
        numero = input.nextInt();
        for (int fator = numero; fator >=1; fator--){
            resultado *= fator;



        }
        System.out.printf("O fatorial de %d é %d", numero, resultado );
    }