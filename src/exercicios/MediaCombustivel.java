package exercicios;

public class MediaCombustivel {
  private float distance, consumption, fuel;

  public MediaCombustivel(int d, int f) {
    this.distance = d;
    this.fuel = f;
  }

  public void calculateAverageConsumptiom () {
    this.consumption = fuel / distance;
    System.out.println("O consumo medio de combustível é de : " + this.consumption + "litros por metro!" );
  }

}
