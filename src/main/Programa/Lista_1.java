import java.util.Scanner;
 
public class Lista_1{
  Scanner type = new Scanner(System.in);
 
  public static void Executar(){
    
    int  n =0;
    int r=0;
    int m = 0;
    Scanner scanner = new Scanner(System.in);

    do{
      
       System.out.println("\n ======== LISTA DE QUESTÕES 1 =========  \n");
       System.out.println("\n  ESCOLHA SUA OPÇÃO OU DIGITE '0'(ZERO) PARA SAIR");
       System.out.println("\n 1. receba um número e imprima ele caso seja maior que 20.");
       System.out.println("\n 2. Recebe 2 números e soma. caso seja maior que 10, resultado é impresso.");
       System.out.println("\n 3. NÚMERO PAR OU ÍMPAR");
       System.out.println("\n 4. POSITIVO, NEGATIVO OU NULO");
       System.out.println("\n 5. RECEBE 2 NÚMEROS, IMPRIME COM + 8 SE FOR > 20, CC , IMPRIME COM -5");
       System.out.println("\n 6. IMPRIME O QUADRADO DO NÚMERO");
       System.out.println("\n 7. CONFERIR SE O NÚMERO É MÚLTIPLO DE 3 OU NÃO.");
       System.out.println("\n 8. VERIFICA SE O NÚMERO 'A' É DIVISÍVEL POR 'B'.");
       System.out.println("\n 9. RECEBE DOIS INTEIROS E VERIFICA QUAL O MAIOR/MENOR");
       System.out.println("\n 10. ENTRADA DE 4 NÚMEROS E SAI O MAIOR E O MENOR");
       System.out.println("\n 11. ENTRA 3 NÚMEROS E SÃEM EM ORDEM CRESCENTE.");
       System.out.println("\n 12.");
       System.out.println("\n 13.");
       System.out.println("\n 14.");
       System.out.println("\n 15.");
       System.out.println("\n 16.");
       System.out.println("\n 17.");
       System.out.println("\n DIGITE SUA OPÇÃO : ");

      if (scanner.hasNextInt()) {
        m = scanner.nextInt();
        scanner.nextLine(); 
      } else {
        scanner.nextLine();
        System.out.println("\nEntrada inválida. Digite um número!\n");
        Clear.pause(scanner);
        continue;
      }

      switch(m){
        case 0:
          break;
        case 1:
         Clear.clear();
          System.out.println("\n DIGA O NUMERO  'N' : ");
            n = scanner.nextInt();
          Q1(n);
          break;
        case 2:
          Clear.clear();
          System.out.println("\n DIGA O NUMERO  'N' : ");
            n = scanner.nextInt();
          System.out.println("\n DIGA O NUMERO  'R' : ");
            r = scanner.nextInt();
          Q2(n,r);
          break;
        case 3:
          Clear.clear();
          System.out.println("\n DIGA O NUMERO  'N' : ");
            n = scanner.nextInt();
          Q3(n);
          break;
        case 4:
          Clear.clear();
          System.out.println("\n DIGA O NUMERO  'N' : ");
            n = scanner.nextInt();
          Q4(n);
          break;
        case 5:
          System.out.println("\n DIGA O NUMERO  'N' : ");
            n = scanner.nextInt();
          System.out.println("\n DIGA O NUMERO  'R' : ");
            r = scanner.nextInt();
          Q5(n,r);
          break;
        case 6:
          System.out.println("\n DIGA O NUMERO  'N' : ");
           n = scanner.nextInt();
          Q6(n);
          break;
        case 7:
          System.out.println("\n DIGA O NUMERO  'N' : ");
          n = scanner.nextInt();
          Q7(n);
          break;
        case 8:
          System.out.println("\n DIGA O NUMERO  'N' : ");
            n = scanner.nextInt();
          System.out.println("\n DIGA O NUMERO  'R' : ");
            r = scanner.nextInt();
          Q8(n,r);
          break;
        case 9:
          System.out.println("\n DIGA O NUMERO  'N' : ");
            n = scanner.nextInt();
          System.out.println("\n DIGA O NUMERO  'R' : ");
            r = scanner.nextInt();
          Q9(n,r);
          break;
        case 10:
          Q10();
          break;
        case 11:
          Q11();
          break;
        case 12:
          break;
        case 13:
          break;
        case 14: 
          break;
        case 15:
          break;
        case 16:
          break;
        case 17:
          break;
      }

      
      
    }while( m != 0);
  }

  public static void Q1(int n){
   
    Clear.clear();
    if(n > 20){
      System.out.println("\n SEU NÚMERO É : " + n);
    }else{
      System.out.println("\n MENOR OU IGUAL A 20.");
    }
    
    }

  public static void Q2(int n, int r){
 
    if((n + r)> 10){
      System.out.println("\n SUA SOMA É: " + (n + r));
    }else{
      System.out.println("\n SUA SOMA É MENOR QUE 10");
    }
  }

  public static void Q3(int n){
    if(n % 2 != 0 && n != 2){
      System.out.println("\n NÚMERO IMPAR!");
    }else{
      System.out.println("\n NÚMERO PÁR!");
    }
  }

  public static void Q4(int n){
    if(n == 0){
      System.out.println("\n NULO");
    }else if(n > 0){
      System.out.println("\n POSITIVO");
    }else{
      System.out.println("\n NEGATIVO");
    }
    
  }

  public static void Q5(int n, int r){
    int soma = n + r;

    if(soma > 20){
      System.out.println("\n RESULTADO MAIOR QUE 20: " + (soma + 8));
    }else{
      System.out.println("\n RESULTADO MAIOR QUE 20: " + (soma - 5));
    }
  }

  public static void Q6(int a){
     System.out.println("\n SEU NÚMERO AO QUADRADO: " + (a * a));
  }

  public static void Q7(int a){
    if(a % 3 == 0){
      System.out.println("\n EH MUTIPLO DE 3");  
    }else{
      System.out.println("\n NÃO É MUTIPLO DE 3");
    } 
  }

  public static void Q8(int a, int b){
    if( a % b == 0){
      System.out.println("\n  É DIVISÍVEL");  
    }else{
      System.out.println("\n NÃO É DIVISÍVEL ");  
    }
  }

  public static void Q9(int a , int b){
    if(a > b){
      System.out.println("\n  'A' É MAIOR QUE 'B'");  
    }else{
      System.out.println("\n  'B' É MAIOR QUE 'A'");  
    }
  }

  public static void Q10(){

    Scanner scanner = new Scanner(System.in);

    
    int a,b,c,d = 0;
    int maior = 0;
    int menor = 0;
    
    System.out.println("\n DIGA O NUMERO  'A' : ");
    a = scanner.nextInt();
    System.out.println("\n DIGA O NUMERO  'B' : ");
    b = scanner.nextInt();
    System.out.println("\n DIGA O NUMERO  'C' : ");
    c = scanner.nextInt();
    System.out.println("\n DIGA O NUMERO  'D' : ");
    d = scanner.nextInt();

    maior = a;

    if(maior < b){
      maior = b;
    }
    if( maior < c){
      maior = c;
    }
    if(maior < d){
       maior = d;
    }

    menor = a;

    if(menor > b){
      menor = b;
    }
    if( menor > c){
     menor = c;
    }
    if(menor > d){
       menor = d;
    } 

    System.out.println("\n MAIOR NÚMERO: " + maior);
    System.out.println("\n MENOR NÚMERO: " + menor);
    
  }

  public static void Q11(){
    
    Scanner scanner = new Scanner(System.in);

    int a,b,c = 0;
    int medio = 0;
    int maior,menor= 0 ;
    
    System.out.println("\n DIGA O NUMERO  'A' : ");
    a = scanner.nextInt();
    System.out.println("\n DIGA O NUMERO  'B' : ");
    b = scanner.nextInt();
    System.out.println("\n DIGA O NUMERO  'C' : ");
    c = scanner.nextInt();
    
    maior = a;

    if(maior < b){
      maior = b;
    }
    if( maior < c){
      maior = c;
    }

    menor = a;

    if(menor > b){
      menor = b;
    }
    if( menor > c){
     menor = c;
    }

   if(a > b && a < c){
     medio = a;
   }
    if(a < b && a > c ){
      medio = a;
   } 
    if(b > a && b < c ){
      medio = b;
    }
    if(b < a && b > c ){
        medio = b;
     } 
    if(c > a && c < b ){
      medio = b;
    }
    if(c < a && c > b ){
       medio = b;
     } 

    System.out.println("\n MAIOR :" + maior);
    System.out.println("\n MEDIO :" + medio);
    System.out.println("\n MENOR :" + menor);
    
  }
  
}