public class Main {
  public static void main(String[] args) {
    Gato g = new Gato();
    g.setNome("G1");
    g.setIdade(8);
    System.out.println(g.getNome());
    g.miar();
  }
}