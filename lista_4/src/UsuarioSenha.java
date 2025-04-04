import java.util.Scanner;
public class UsuarioSenha {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String nomeUsuario =" ", senha = " ";

        do{
            System.out.println("Nome de usuário: ");
            nomeUsuario = scr.nextLine();
            System.out.println("Senha: ");
            senha = scr.nextLine();

            if(nomeUsuario.equals(senha)){
                System.out.println("O nome de usuário deve ser diferente da senha.");
            }
        }while(nomeUsuario.equals(senha));

        System.out.println("Usuário: " + nomeUsuario);
        System.out.println("Senha: " + senha);

        scr.close();
    }
}
