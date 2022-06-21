import java.util.Random;

public class Luta{
  private Lutador desafiado;
  private Lutador desafiante;
  private int round;
  private boolean aprovada;


  //Getters e Setters

  public Lutador getDesafiado(){
    return desafiado;
  }

  public void setDesafiado(Lutador dd){
    this.desafiado = dd;
  }

  public Lutador getDesafiante(){
    return desafiante;
  }

  public void setDesafiante(Lutador dt){
    this.desafiante = dt;
  }

  public Boolean getAprovada(){
    return aprovada;
  }

  public void setAprovada(Boolean a){
    this.aprovada = a;
  }

  
  

  
/*Regras a luta:

  1. Só pode ser marcada entre lutadores da mesma categoria;
  2. Desafiado e Desafiante tem que ser lutadores diferentes.
  3. Só pode acontecer se estiver aprovada.
  4. Só pode ter como resultado a vitória de um dos lutadores ou empate.
*/


  //Métodos

  public void marcarLuta(Lutador l1, Lutador l2){
    if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
      this.setAprovada(true);
      this.setDesafiado(l1);
      this.setDesafiante(l2);
    } else {
      this.setAprovada(false);
      this.setDesafiante(null);
      this.setDesafiado(null);
    }
  }

  public void lutar(){
    if (this.getAprovada()){
      System.out.print("### DESAFIADO ###");
      desafiado.apresentar();
      System.out.print("### DESAFIANTE ###");
      desafiante.apresentar();

      Random ale =new Random();
      int vencedor = ale.nextInt(3);

      System.out.println("\n### RESULTADO DA LUTA ###");
      
      switch(vencedor){
          
        case 0: //Empate
          System.out.println("\nA luta foi Empate!!!");
          desafiado.empatarLuta();
          desafiante.empatarLuta();
          break;
          
        case 1: //Ganha Desafiado
          System.out.println("\nVitória do " + desafiado.getNome());
          desafiado.ganharLuta();
          desafiado.perderLuta();
          break;

        case 2: //Ganha Desafiante
          System.out.println("\nVitória do " + desafiante.getNome());
          desafiante.ganharLuta();
          desafiado.perderLuta();
          break;

      }
      
    } else {
      System.out.println("Luta não pode acontecer.");
    }

    System.out.println("");

    
  }

  
  
  
}