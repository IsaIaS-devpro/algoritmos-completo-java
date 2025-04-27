import java.util.Scanner;

public class Main{
public static void main(String[] args){

  int n = 0;
  Scanner scanner = new Scanner(System.in);
  
  do{
    
    Clear.clear();
    
    // HOME //
    System.out.println("=============  _ PROGRAMA _ COMPLETO_  =============");
    System.out.println(" \n + SEJA BEM VINDO ! + ");
    System.out.println("\n  PARA UTILIZAR O PROGRAMA DIGITE O NÚMERO DA ESCOLHA OU DIGITE '0'(ZERO) PARA SAIR. \n ");
    System.out.println("\n 1. CRÉDITOS ");
    System.out.println("\n 2. LISTA 1: ALGORITMOS SIMPLES");
    System.out.println("\n 3. LISTA 3 (NOME DA LISTA)");
    System.out.println("\n 4. LISTA 4 (NOME DA LISTA)");
    System.out.println("\n 5. LISTA 5 (NOME DA LISTA)");
    System.out.println("\n DIGITE SUA OPÇÃO:  ");
 

    if (scanner.hasNextInt()) {
      n = scanner.nextInt();
      scanner.nextLine(); 
    } else {
      scanner.nextLine();
      System.out.println("\nEntrada inválida. Digite um número!\n");
      Clear.pause(scanner);
      continue;
    }

    switch(n){

      case 0: 
        break;
      case 1:
         Clear.clear();
        System.out.println("\n BEM VINDO AOS CRÉDITOS ! ! ! \n ");
        System.out.println("\n DESENVOLVIDO POR ISAIAS FERNANDES CEDRO RIBEIRO CARLOS");
        System.out.println("\n ESTUDANTE DE CIÊNCIA DA COMPUTAÇÃO, COMECEI NA UFCA E CONCLUINDO NO FARIAS BRITO");
        System.out.println("\n ATUALMENTE ESTAGIANDO NA USIMINAS, MINAS GERAIS");
        System.out.println("\n + + + TODA HONRA E GLÓRIA SEJAM DADAS A CRISTO JESUS, O REI DO UNIVERSO! + + +");
        Clear.pause(scanner);
      
        break;
      case 2:
        Lista_1.Executar();
        break;
      case 3:
      case 4:
      case 5:
      case 6:

      default: 
        System.out.println("\n \n ERRO DE DIGITO .... ESCREVA CORRETAMENTE!\n \n \n");
        break;
    }
    
  }while(n != 0);
  Clear.clear();
  System.out.println("\n TCHAUUUUUUUUUUU! ATÉ MAIS!");
        
  }
}