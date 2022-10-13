package exercicios;

public class QuatroOperacoes {
  private int value1, value2;

  public QuatroOperacoes(int v1, int v2) {
    this.value1 = v1;
    this.value2 = v2;
  }
  private int sum () {
    return this.value1 + this.value2;
  }
  private int sub () {
    return this.value1 - this.value2;
  }
  private int div () {
    return this.value1 / this.value2;
  }
  private int mult () {
    return this.value1 * this.value2;
  }

  public void showResult () {
    int soma, divisao, subtracao, multiplicacao;
    soma = this.sum();
    divisao = this.div();
    subtracao = this.sub();
    multiplicacao = this.mult();
    System.out.println("O resultado da soma é: " + soma);
    System.out.println("O resultado da divisão é: " + divisao);
    System.out.println("O resultado da multiplicação é: " + multiplicacao);
    System.out.println("O resultado da subtração é: " + subtracao);

  }
}
