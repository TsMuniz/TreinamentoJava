import exercicios.MediaCombustivel;
import exercicios.QuatroOperacoes;
import exercicios.Vendedor;

public class Main {
  public static void main(String[] args) {
//    QuatroOperacoes calculate = new QuatroOperacoes(25,5);
//    calculate.showResult();
//    MediaCombustivel calculateAverage = new MediaCombustivel(10, 1);
//    calculateAverage.calculateAverageConsumptiom();

    Vendedor vendedor = new Vendedor("Thiago", 5000, 2500 );

    vendedor.showInfo();
  }
}