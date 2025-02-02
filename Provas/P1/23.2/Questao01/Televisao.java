public class Televisao extends Produto implements Ligavel {
  public void ligavel() {
    System.out.println("Ligando a televisão");
  }

  public Televisao(String id) {
    super(id);
  }
}