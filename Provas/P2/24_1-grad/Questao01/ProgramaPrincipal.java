import java.util.List;

public class ProgramaPrincipal {
  public static void main(String[] args) {
    List<String> fs1 = Utils.getFuncionarios();
    Funcionario[] fs2 = Utils.parseFuncionarios(fs1);
    System.out.println(Utils.calcularMediaSalarios(fs2));
  }
}
