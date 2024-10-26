import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Pessoa p = new Pessoa();
    System.out.print("Nome da pessoa: ");
    p.nome = scanner.nextLine();
    System.out.print("Idade da pessoa: ");
    p.idade = scanner.nextInt();

    System.out.println(p.nome + " tem " + p.idade + " anos");
    p.correr();

    scanner.close();
  };
}