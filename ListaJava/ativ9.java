public class ativ9 {
    public class Main {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o valor para depósito: ");
            float valorDeposito = scanner.nextFloat();

            double rendimento = valorDeposito * 0.70 / 100;
            double juros = rendimento + valorDeposito;
            System.out.println("Valor com o rendimento de 0,70%: " + juros);

        }


}
