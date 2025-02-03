import java.util.ArrayList;
import java.util.List;

public class Utils {
  public static List<String> getFuncionarios() {
    List<String> s = new ArrayList<String>();
    s.add("João da Silva#3000");
    s.add( "Ana Maria#4500");
    s.add( "Carlos Andrade#2800");
    s.add( "Lúcia Ferreira#3200");
    return s;
  }

  public static Funcionario[] parseFuncionarios(List<String> dados) {
    List<Funcionario> fs = new ArrayList<Funcionario>();

    String[] partes;
    for (String s : dados) {
      partes = s.split("#");
      fs.add(new Funcionario(partes[0], Double.parseDouble(partes[1])));
    }

    return fs.toArray(new Funcionario[0]);
  }

  public static double calcularMediaSalarios(Funcionario[] funcionarios) {
    double soma = 0;

    for (Funcionario f : funcionarios) {
      soma += f.getSalario();
    }

    return soma / funcionarios.length;
  }
}