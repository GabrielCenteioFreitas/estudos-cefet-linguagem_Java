import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Lutador[] lutadores = new Lutador[10];
    for (int i = 0; i < lutadores.length; i++) {
      System.out.println("Digite o nome do lutador " + (i+1) + ": ");
      String nome = scanner.nextLine();
      System.out.println("Digite a idade do lutador " + (i+1) + ": ");
      int idade = scanner.nextInt();
      System.out.println("Digite o peso do lutador " + (i+1) + ": ");
      double peso = scanner.nextDouble();
      scanner.nextLine();

      if (peso <= 65.0) {
        lutadores[i] = new PesoPena(nome, idade, peso);
      } else if (peso <= 83.9) {
        lutadores[i] = new PesoMedio(nome, idade, peso);
      } else if (peso <= 93.0) {
        lutadores[i] = new MeioPesado(nome, idade, peso);
      } else {
        lutadores[i] = new PesoPesado(nome, idade, peso);
      }
    }

    System.out.println("Escolha um lutador (0 a 9): ");
    int escolha = scanner.nextInt();

    System.out.println("Lutador escolhido: " + lutadores[escolha].toString());

    System.out.println("Lutadores aptos a lutar:");
    lutadores[escolha].possiveisLutas(lutadores);

    Lutador lutadorSorteado = lutadores[escolha].sorteioLuta(lutadores);
    System.out.println("Lutador sorteado para a luta: " + lutadorSorteado.toString());

    scanner.close();
  }
}
