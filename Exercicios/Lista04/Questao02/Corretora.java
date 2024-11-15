import java.util.Scanner;

public class Corretora {
  Imovel imoveis[] = new Imovel[5];
  
  public Corretora() {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < imoveis.length; i++) {
      imoveis[i] = new Imovel();
      System.out.print("Endereço do imóvel " + (i+1) + ": ");
      imoveis[i].setEndereco(scanner.nextLine());
      System.out.print("Preço do imóvel " + (i+1) + ": ");
      imoveis[i].setPreco(scanner.nextFloat());
      scanner.nextLine();
    }

    scanner.close();
  }

  public float PrecoTotal() {
    float soma = 0;

    for (int i = 0; i < imoveis.length; i++) {
      soma += imoveis[i].getPreco();
    }

    return soma;
  }
}
