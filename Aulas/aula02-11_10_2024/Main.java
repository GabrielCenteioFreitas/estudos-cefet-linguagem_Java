public class Main {
  public static void main(String args[]) {
    Gato g1 = new Gato();
    Gato g2 = new Gato();
    Gato g3 = g2;
    g1.nome = "Felix";
    g2.idade = 4;
    g3.idade = 5;

    System.out.println(g1.nome);
    System.out.println(g1.idade);
    System.out.println(g2.nome);
    System.out.println(g2.idade);
    
    g1.miar();
    g2.miar();
    
    // byte, short, int, long
    // float, double
    // char
    // boolean
  }
}