package exercicios;

public class SomaValores {
  private int value1, value2;

  public SomaValores(int v1, int v2) {
    this.value1 = v1;
    this.value2 = v2;
  }

  private int sumValues()  {
    return this.value1 + this.value2;
  }

  public void showResult() {
    int result  = sumValues();
    System.out.println("O resultado da soma dos valores é: " + result);
  }
}
