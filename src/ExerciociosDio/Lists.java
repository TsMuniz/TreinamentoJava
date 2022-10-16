package ExerciociosDio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
  public static void init() {
    List<Double> temperatureAvaregeList = new ArrayList<>();
    List<MonthWithAvarage> temperatureAboveTheAverage = new ArrayList<>();
    Scanner input  = new Scanner(System.in);
    String[] monthList = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
    for (int i = 0; i <= 5; i++) {
      System.out.println("Insira a temperatura media de " + monthList[i]);
      temperatureAvaregeList.add(Double.parseDouble(input.next()));
    }
//    System.out.println(temperatureAvaregeList);
    Double sumOfAverages = 0.0;
    for (Double average: temperatureAvaregeList) {
      sumOfAverages += average;
    }
    double semesterAverage = sumOfAverages / temperatureAvaregeList.size();
    for(int i = 0; i < temperatureAvaregeList.size(); i++) {
      if (temperatureAvaregeList.get(i) > semesterAverage) {
        temperatureAboveTheAverage.add(new MonthWithAvarage(monthList[i], temperatureAvaregeList.get(i)));
      }
    }
    System.out.println("Meses acima da temperatura média!");

    for(MonthWithAvarage month: temperatureAboveTheAverage) {
      System.out.println(month.getName() + " " + month.getAvarage());
    }

  }
}


class MonthWithAvarage {
  private String name;
  private Double avarage;
  public MonthWithAvarage(String name, Double avarage) {
    this.name = name;
    this.avarage = avarage;
  }

  public String getName() {
    return name;
  }

  public Double getAvarage() {
    return avarage;
  }

  @Override
  public String toString() {
    return "monthWithAvarage{" +
            "name='" + name + '\'' +
            ", avarage=" + avarage +
            '}';
  }

}