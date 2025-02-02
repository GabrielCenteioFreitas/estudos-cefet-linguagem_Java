public class Notebook extends Produto implements Eletronico {
  public Notebook(String id) {
    super(id);
  }

  public void ligar() {
    System.out.println("Ligando notebook...");
  }

  public void desligar() {
    System.out.println("Desligando notebook...");
  }
}