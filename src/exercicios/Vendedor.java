package exercicios;

public class Vendedor {
  private String name;
  private float totalSales;
  private float commission = 0.15f;
  private float salary;

  public Vendedor(String n, float sN, float s) {
    this.name = n;
    this.totalSales = sN;
    this.salary = s;
  }

  public void showInfo () {
    float liquidSalary;
    liquidSalary = (this.totalSales * this.commission)  + this.salary;
    System.out.println("O vendedor " + name + " tem um salario fixo de " + salary + " e vai receber R$" + liquidSalary + " esse mês.");
  }




}
