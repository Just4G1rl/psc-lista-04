import java.util.Scanner;
public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sexo, estadoCivil;
        String nome;
        int idade;
        double salario;

        do{
            System.out.println("Nome: ");
            nome = scanner.next();

        } while(nome.length() < 3);

        do{
            System.out.println("Idade: ");
            idade = scanner.nextInt();

        }while (idade < 0 || idade > 150); //de acordo com o prof andré dessa forma é possivel quebrar o codigo. Descubra uma forma de concertar.

        do{
            System.out.println("Salário: ");
            salario = scanner.nextDouble();
        } while(salario < 0);
            
        do{
            System.out.println("Sexo: ");
           sexo = scanner.next().charAt(0);
        }while(sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M');

        do{
            System.out.println("Estado Civíl: ");
            estadoCivil = scanner.next().charAt(0);
        }while(estadoCivil != 's' && estadoCivil != 'S' && estadoCivil != 'c' && estadoCivil != 'C' && estadoCivil != 'v' && estadoCivil != 'V' && estadoCivil != 'd' && estadoCivil != 'D');

        scanner.close();
    }

}
