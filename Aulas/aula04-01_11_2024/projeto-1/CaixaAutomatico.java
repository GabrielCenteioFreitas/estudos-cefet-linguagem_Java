import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CaixaAutomatico {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.depositar(100);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quanto quer sacar? ");
    double valorSaque = sc.nextDouble();
    NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
    if (c1.debitar(valorSaque)) {
      System.out.println("Liberando " + formatador.format(valorSaque) + " em dinheiro");
      System.out.println("Saldo atual: " + formatador.format(c1.getSaldo()));
    }
  }
}
