import java.util.Scanner;
public class BoletimEscolar {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        int notaEscolar;

        System.out.println("Informe a nota do aluno: ");
        notaEscolar = src.nextInt();

        while (notaEscolar < 0 ) {
            System.out.println("O valor informado é invalido.");
            System.out.println("Informe um valor válido: ");
            notaEscolar = src.nextInt();
        }

        while (notaEscolar > 10 ) {
            System.out.println("O valor informado é invalido.");
            System.out.println("Informe um valor válido: ");
            notaEscolar = src.nextInt();
        }
        src.close();
    }
}
