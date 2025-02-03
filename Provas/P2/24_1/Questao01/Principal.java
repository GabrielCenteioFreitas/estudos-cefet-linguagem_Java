import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    LivroDeBiblioteca lb1 = new LivroDeBiblioteca("titulo-1", "autor-1", 2025, "lb-1");
    LivroDeBiblioteca lb2 = new LivroDeBiblioteca("titulo-2", "autor-2", 2025, "lb-2");
    LivroDeLivraria lv1 = new LivroDeLivraria("titulo-3", "autor-3", 2025, "lv-1");
    LivroDeLivraria lv2 = new LivroDeLivraria("titulo-4", "autor-4", 2025, "lv-2");

    Instituicao i = new Instituicao();
    i.addLivro(lb1);
    i.addLivro(lb2);
    i.addLivro(lv1);
    i.addLivro(lv2);

    ArrayList<Livro> lista = i.getListaDeLivros();
    imprimeRelatorioGeral(lista);

    Scanner s = new Scanner(System.in);
    System.out.print("Qual o ISBN do livro a ser consultado? ");
    String isbn = s.nextLine();
    Livro livroProcurado = new Livro(isbn);

    if (lista.contains(livroProcurado)) {
      Livro l = lista.get(lista.indexOf(livroProcurado));
      System.out.println(l.getTitulo() + l.getAno() + l.getAutor());
    }

    s.close();
  }

  public static void imprimeRelatorioGeral(List<Livro> ls) {
    Iterator<Livro> i = ls.iterator();
    Livro l;
    while (i.hasNext()) {
      l = i.next();
      if (l instanceof LivroDeBiblioteca) {
        LivroDeBiblioteca lb = (LivroDeBiblioteca) l;
        System.out.println(lb.getTitulo() + lb.getAno() + lb.getAlugado());
      } else if (l instanceof LivroDeLivraria) {
        LivroDeLivraria lv = (LivroDeLivraria) l;
        System.out.println(lv.getTitulo() + lv.getAno() + lv.getVendido());
      }
    }
  }
}
