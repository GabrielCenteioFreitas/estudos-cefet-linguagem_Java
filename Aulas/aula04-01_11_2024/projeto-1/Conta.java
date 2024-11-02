public class Conta {
  private String nomeCliente;
  private double saldo;

  public double getSaldo() {
    return saldo;
  }

  public boolean depositar(double valor) {
    if (valor < 0) {
      System.out.println("Pode depositar negativo não po.");
      return false;
    }

    saldo += valor;
    System.out.println("Depositado: " + valor);
    return true;
  }

  public boolean debitar(double valor) {
    if (valor <= saldo && valor > 0) {
      saldo -= valor;
      System.out.println("Debitado: " + valor);
      return true;
    }
    
    System.out.println("Débito de " + valor + " não efetivado");
    //throw new RuntimeException();
    return false;
  }
}
