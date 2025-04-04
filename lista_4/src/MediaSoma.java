import java.util.Scanner;
public class MediaSoma {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner (System.in);

        int numero = 0, soma = 0;
        double media = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Informe um número: ");
            numero = scanner.nextInt();
            media += numero;
            soma += numero;
        }
        media =  media / 5;
        System.out.printf("A média dos números informados é %.2f e a soma é %d ", media, soma);
        scanner.close();
    }

}
