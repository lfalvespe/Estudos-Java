class Main{
  public static void main(String[] Args){

  System.out.println("------------------------------");
  
  ContaBanco p1 = new ContaBanco();
  p1.setnumConta(1111);
  p1.setDono("Antônio");
  p1.abrirConta("cc");
  

  ContaBanco p2 = new ContaBanco();
  p2.setnumConta(2222);
  p2.setDono("Josefa");
  p2.abrirConta("cp");

  p1.estadoAtual();  
  p2.estadoAtual();

  System.out.println("------------------------------");
    
  p1.depositar(100);
  p2.depositar(500);

  p2.sacar(100);
  p2.sacar(1000);
  p1.sacar(150);
  p1.fecharConta();
  
  p1.estadoAtual();  
  p2.estadoAtual();
    
  }
}