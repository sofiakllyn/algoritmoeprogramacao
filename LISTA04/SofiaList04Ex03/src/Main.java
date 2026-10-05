//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);

    double[] temperatura = new double[5];
    double soma = 0;
 
    String[] dias = {
            "Segunda-feira", "Terca-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"
    };
    for (int i = 0; i < 5; i++) {
        System.out.print("Digite a temperatura de " + dias[i] + ":");
        temperatura[i] = input.nextDouble();
        soma += temperatura[i];
    }
double media = soma/5;
    System.out.printf("%nTemperatura média da semana: %.2f ºC%n", media);
    System.out.println("Dias com a temperatura encima da média: ");
    boolean algumAcima = false;

    for (int i = 0; i < 5; i++){
        if (temperatura[i] > media){
            System.out.printf(" %s (%.1f ºC)%n", dias[i], temperatura[i]);
            algumAcima = true;
        }
    }
if (!algumAcima){
    System.out.println("Nenhum dia ficou acima da média.");
    }
}
