public class Processa {
  public static void main(String[] args) {
    System.out.println(calcula(2,3));
  }
  public double calcula(double a, double b) {
    return (a+b) * (a*0.1) + (b*0.9);
  }
}