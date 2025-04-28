public class ativ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da cotação: ");
        float valorCotacao = scanner.nextFloat();

        System.out.println("Digite sua quantidade de dólares: ");
        float qntDolar = scanner.nextFloat();

        float conversao = valorCotacao * qntDolar;


        System.out.printf("O valor da conversão é de: " + conversao);
    }
}
