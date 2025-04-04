import java.util.Scanner;
public class TaxaNatalidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int populacaoPaisA, populacaoPaisB, contAno = 0;
        double taxaNatalidadePaisA, taxaNatalidadePaisB;

        do{
            System.out.println("Informe a população pais A:");
            populacaoPaisA = scanner.nextInt();
        }while(populacaoPaisA <= 0);

        do{
            System.out.println("Informe a porcentagem da taxa de natalidade do pais A:");
        taxaNatalidadePaisA = scanner.nextDouble();
        }while(taxaNatalidadePaisA <= 0 || taxaNatalidadePaisA > 100);
        
        do{
            System.out.println("Informe a população pais B:");
            populacaoPaisB = scanner.nextInt();
        }while(populacaoPaisB <= 0);

        do{
            System.out.println("Informe a porcentagem da taxa de natalidade do pais B:");
        taxaNatalidadePaisB = scanner.nextDouble();
        }while(taxaNatalidadePaisB <= 0);
    
        while (populacaoPaisA < populacaoPaisB) {
            contAno += 1;
            populacaoPaisA += (populacaoPaisA * taxaNatalidadePaisA / 100);
            populacaoPaisB += (populacaoPaisB * taxaNatalidadePaisB / 100);

        }

        System.out.printf("Considerando as populações e taxa de natalidade dos paises A e B ");
        System.out.println("levou "+contAno+" anos para a populaçao do pais A superar a do pais B");
        System.out.println("População pais A = " + populacaoPaisA);
        System.out.println("População pais B = " + populacaoPaisB);

        scanner.close();

    }
}
