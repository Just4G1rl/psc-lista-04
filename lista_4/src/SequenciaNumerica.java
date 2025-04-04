import java.util.Scanner;
public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0, menor = 0;

        System.out.println("Informe o primeiro número: " );
        int numeroUm = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int numeroDois = scanner.nextInt();

        if(numeroUm > numeroDois){
            maior = numeroUm;
            menor = numeroDois;
        }else{
            maior = numeroDois;
            menor = numeroUm;
        }
        
        for(int i = menor; i <= maior; i++ ){
            System.out.print(i + " ");
        }
        scanner.close();
    }

}
