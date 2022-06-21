import java.util.Scanner;
  
class Main{
  public static void main(String[] Args){
    Scanner teclado = new Scanner(System.in);
    
  double ale = Math.random();

  int n = (int) (1 + ale * (11-1));

  System.out.println("------------------");
  System.out.println("Jogo da advinhação");
  System.out.println("------------------\n");

  System.out.println("Estou pensando em um número...\n");

  System.out.print("Em que número pensei? [De 1 a 10]: ");
  int palpite = teclado.nextInt();

  if (palpite == n){
    System.out.print("Acertou. " + n);
  } else {
    System.out.print("Errou. Meu número foi " + n);
  }
  }
}
  