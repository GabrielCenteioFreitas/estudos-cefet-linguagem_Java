import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPrincipal {
  public static void main(String[] args) {
    ArrayList<Planta> plantas = new ArrayList<Planta>();
    Briofita p1 = new Briofita("id-1");
    Briofita p2 = new Briofita("id-2");
    Pteridofita p3 = new Pteridofita("id-3");
    Pteridofita p4 = new Pteridofita("id-4");
    plantas.add(p1);
    plantas.add(p2);
    plantas.add(p3);
    plantas.add(p4);
    p1.setNome("Musgo 1");
    p1.setTamanho(15.0);
    p2.setNome("Musgo 2");
    p2.setTamanho(12.0);
    p3.setNome("Samambaia 1");
    p3.setTamanho(3.0);
    p4.setNome("Samambaia 2");
    p4.setTamanho(4.0);

    Scanner s = new Scanner(System.in);
    System.out.print("Insira um id: ");
    String id = s.nextLine();
    Planta planta = new Planta(id);
    if (Utils.existe(plantas, planta)) {
      for (Planta p : plantas) {
        if (p.equals(planta)) {
          System.out.println(p);
          break;
        }
      }
    } else {
      System.out.println("A planta de ID " + id + " não existe.");
    }

    Planta[] ordenadas = Utils.ordena(plantas);
    for (Planta p : ordenadas) {
      System.out.println(p);
    }

    s.close();
  }
}
