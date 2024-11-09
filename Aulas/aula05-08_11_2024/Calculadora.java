public class Calculadora {
  private String cor;

  public static double media(double a, double b) {
    return (a+b)/2;
  }

  public static double media(double a, double b, double c) {
    return (a+b+c)/3;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }
}