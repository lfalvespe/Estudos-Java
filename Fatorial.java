import java.util.Scanner;

class Main{
  public static void main(String[] Args){
    Scanner teclado = new Scanner(System.in);

    System.out.println("---------------------");
    System.out.println("Cálculo do Fatorial:");
    System.out.println("---------------------");
    System.out.print("Digite um número: ");
    int n = teclado.nextInt();

    System.out.println("\nResultado:\n");
    
    int fat = 1;
    
    for (int c = n; c >= 1; c--){
      fat *= c;
      
      if (c == n){
        System.out.print("--> " + n + "! = " + n);
      } else if (c > 1){
        System.out.print("x" + c);
      } else if (c == 1){
        System.out.print("x" + c + " = ");
      }
        
    }
    
    System.out.print(fat);
    
  }
  
}