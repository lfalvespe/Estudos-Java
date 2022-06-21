public class Lutador{
  // Atributos:
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

   //Construtor:
  public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;
    
  }

   // Getters e Setters:
  public String getNome(){
    return nome;
  }
  public void setNome(String no){
    this.nome = no;
  }

  public String getNacionalidade(){
    return nacionalidade;
  }
  public void setNAcionalidade(String na){
    this.nacionalidade = na;
  }

  public int getIdade(){
    return idade;
  }
  public void setIdade(int id){
    this.idade = id;
  }


  public float getAltura(){
    return altura;
  }
  public void setAltura(float al){
    this.altura = al;
  }

  public float getPeso(){
    return peso;
  }
  public void setPeso(float peso){
    this.peso = peso;
    this.setCategoria();
  }

  public String getCategoria(){
    return categoria;
  }
  private void setCategoria(){
    if (peso < 52.2){
      this.categoria = "Inválido";
      
    } else if (peso <= 70.3f){
      this.categoria = "Leve";
    } else if (peso <= 83.9f){
      this.categoria = "Médio";
    } else if (peso >= 120.2f){
      this.categoria = "Pesado";
    } else {
      this.categoria = "Inválido";
    }
      
  }

  public int getVitorias(){
    return vitorias;
  }
  public void setVitorias(int vi){
    this.vitorias = vi;
  }

  public int getDerrotas(){
    return derrotas;
  }
  public void setDerrotas(int de){
    this.derrotas = de;
  }

  public int getEmpates(){
    return empates;
  }
  public void setEmpates(int em){
    this.empates = em;
  }
  
  
  
  // Métodos personalizados:
  public void apresentar(){
    System.out.println("-----------------------------------------------");
    System.out.println("Chegou a hora, apresentamos o Lutador, " + this.getNome());
    System.out.println("Diretamente de " + this.getNacionalidade());
    System.out.println("Com " + this.getIdade() + " Anos e " + this.getAltura() + "m" );
    System.out.println("Pesando " + this.getPeso() + "kg");
    System.out.println(this.getVitorias() + " Vitórias");
    System.out.println(this.getDerrotas() + " Derrota(s) e ");
    System.out.println(this.getEmpates() + " Empate(s)!");
    
  }

  public void status(){
    System.out.println("(---------STATUS---------)");
    System.out.println(this.getNome() + " É um peso " + this.getCategoria());
    System.out.println("Ganhou " + this.getVitorias() + " Vezes");
    System.out.println("Empatou " + this.getEmpates() + " Vezes");
    System.out.println("Perdeu " + this.getDerrotas() + " Vezes");
    System.out.println("");
  }

  public void ganharLuta(){
    this.setVitorias(getVitorias() + 1);
  }

  public void perderLuta(){
    this.setDerrotas(getDerrotas() + 1);
  }

  public void empatarLuta(){
    this.setEmpates(getEmpates() + 1);
  }
  


  
}