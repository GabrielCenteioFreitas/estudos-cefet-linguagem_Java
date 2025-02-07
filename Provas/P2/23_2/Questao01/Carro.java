import java.util.ArrayList;
import java.util.List;

class Carro {
  private String placa;
  private String cor;
  private int ano;
  private String renavan;
  private List<Acessorio> acessorios;

  public Carro(String placa, String cor, int ano, String renavan) {
    this.placa = placa;
    this.cor = cor;
    this.ano = ano;
    this.renavan = renavan;
    this.acessorios = new ArrayList<Acessorio>();
  }

  public String getPlaca() {
    return placa;
  }

  public String getCor() {
    return cor;
  }

  public int getAno() {
    return ano;
  }

  public String getRenavan() {
    return renavan;
  }

  public List<Acessorio> getAcessorios() {
    return acessorios;
  }

  public void addAcessorio(Acessorio acessorio) {
    this.acessorios.add(acessorio);
  }
}