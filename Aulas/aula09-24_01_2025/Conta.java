public class Conta {
  public double saldo;

  public void sacar(double x) throws SemDinheiroException {
    if (saldo < x) {
      throw new SemDinheiroException("O seu saldo e menor que " + x);
    }
    saldo -= x;
  }

  public void depositar(double x) {
    if (x < 0) {
      throw new RuntimeException("Valor menor que 0: " + x);
    }
    saldo += x;
  }
}