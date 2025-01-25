public class Teste {
  public static void main(String[] args) {
    Conta c = new Conta();
    double valSaque = 100;
    try {
      c.sacar(valSaque);
      System.out.println("Liberando dinheiro");
    } catch (SemDinheiroException e) {
      System.out.println(e.getMessage());
    }
    try {
      c.depositar(-8);
      System.out.println("Depositando ");
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
}