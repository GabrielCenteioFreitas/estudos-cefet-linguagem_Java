import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o nome: ");
    String nomePessoa = scanner.nextLine();
    List<String> linhas = BancoDeDados.getFunc();
    
    double imcPessoa = 0.0, somaIMCs = 0.0;
    int qntIMCMaior = 0;
    boolean encontrou = false;

    for (String linha : linhas) {
      String[] partes = linha.split("#");
      String nome = partes[0];
      double peso = Double.parseDouble(partes[1]);
      double altura = Double.parseDouble(partes[2]);

      if (nome.equals(nomePessoa)) {
        imcPessoa = peso / (altura * altura);
        encontrou = true;
        break;
      }
    }

    if (!encontrou) {
      System.out.println("Pessoa não encontrada.");
      scanner.close();
      return;
    }

    for (String linha : linhas) {
      String[] partes = linha.split("#");
      double peso = Double.parseDouble(partes[1]);
      double altura = Double.parseDouble(partes[2]);

      double imc = peso / (altura * altura);
      somaIMCs += imc;

      if (imc > imcPessoa) {
        qntIMCMaior++;
      }
    }

    double imcMedio = somaIMCs / linhas.size();
    double proporcao = ((double) qntIMCMaior) / linhas.size();

    System.out.print(nomePessoa + " - " + imcPessoa + " - " + imcMedio + " - " + proporcao);

    if (imcPessoa > 40) {
      System.out.println(" - ALERTA");
    } else {
      System.out.println();
    }

    scanner.close();
  }
}
