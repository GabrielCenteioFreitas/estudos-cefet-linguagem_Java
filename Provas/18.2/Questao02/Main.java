import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nome = scanner.nextLine();
    List<String> lista = BancoDeDados.getFunc();

    int soma = 0, idade = -1;
    for (String linha : lista) {
      String partes[] = linha.split("#");
      soma += Integer.parseInt(partes[1]);
      if (partes[0].equals(nome)) {
        idade = Integer.parseInt(partes[1]);
      }
    }

    if (idade == -1) {
      System.out.println("Funcionario nao encontrado.");
      scanner.close();
      return;
    }

    double media = ((double) soma) / lista.size();
    System.out.println(nome + " - idade: " + idade + " - Media da idade de todos os funcionarios: " + media);

    scanner.close();
  }
}