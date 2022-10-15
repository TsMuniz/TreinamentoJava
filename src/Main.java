import exercicios.MediaCombustivel;
import exercicios.QuatroOperacoes;
import exercicios.Seller;
import exercicios.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Seller> sellersList = new ArrayList<>();
    Seller Thiago = new Seller(
            "Thiago",
            "Gerente",
            29,
            "ts_muniz@outlook.com",
            5000.0);
    Seller Verilene = new Seller(
            "Verilene",
            "balconnista",
            27,
            "very_muniz@outlook.com",
            5500.0);

    sellersList.add(Thiago);
    sellersList.add(Verilene);


    for (Seller seller: sellersList) {
      System.out.println(seller.getSalary());
    }


//    Scanner input = new Scanner(System.in);
//    int controller = 0;
//    do {
//      System.out.println("************************");
//      System.out.println("Sistema de cadastro");
//      System.out.println("************************\n");
//
//      System.out.println("1-Cadastro");
//      System.out.println("2-Listar Vendedores");
//      System.out.println("3-Listar Vendas");
//      System.out.println("4-Inserir Venda");
//      System.out.println("0-Sair\n");
//
//      System.out.println("Digite a opcao desejada!");
//      controller = Integer.parseInt(input.next());
//      switch (controller) {
//        case 1 -> System.out.println("Escolheu 1");
//        case 2 -> System.out.println(sellersList.toArray());
//        case 3 -> System.out.println("Escolheu 3");
//        case 4 -> System.out.println("Escolheu 4");
//        default -> System.out.println("Opção inválida!");
//      }
//    }
//    while(controller != 0);
  }
}