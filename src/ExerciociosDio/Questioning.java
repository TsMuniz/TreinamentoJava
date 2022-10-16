package ExerciociosDio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Questioning {
  public static void init() {
    Scanner input  = new Scanner(System.in);
    String answer;
    List<String> questionsList = new ArrayList<>();
    List<String> answersList = new ArrayList<>();
    questionsList.add("Telefonou para a vítima?");
    questionsList.add("Esteve no localdo crime?");
    questionsList.add("Mora perto da vítima?");
    questionsList.add("Devia para a vítima?");
    questionsList.add("Já trabalhou com a vítima?");
    for(String question: questionsList){
      System.out.println(question);
      String answers = input.next();
      if(!Objects.equals(answers, "s")
              && !Objects.equals(answers, "n")){
        System.out.println("Opcao invalida!");
      }
      answersList.add(answers);

    }
    int trueAnswers = 0;

    for(String answers: answersList) {
      if(Objects.equals(answers, "s")) {
        trueAnswers++;
      }
    }

    System.out.println(trueAnswers);
    if(Objects.equals(trueAnswers, 2)) System.out.println("Suspeita");
    if(trueAnswers > 2 && trueAnswers < 5) System.out.println("Cumplice");
    if(Objects.equals(trueAnswers, 5)) System.out.println("Assasina");
  }
}
