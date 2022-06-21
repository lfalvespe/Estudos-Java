class ContaBanco{
  //Atributos
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  
  public void estadoAtual(){
    System.out.println("------------------------------");
    System.out.println("Conta: " + this.getnumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono: " + getDono());
    System.out.println("Saldo: " + getSaldo());
    System.out.println("Status: " + getStatus());
  }
  
// Método Construtor:

  public ContaBanco(){
    this.setStatus(false);
    this.setSaldo(0);
  }

// Métodos Getters e Setters:

  public void setnumConta(int n){
    this.numConta = n;
  }
  public int getnumConta(){
    return this.numConta;
  }

  public void setTipo(String t){
    this.tipo = t;
  }
  public String getTipo(){
    return this.tipo;
  }

  public void setDono(String d){
    this.dono = d;
  }
  public String getDono(){
    return this.dono;
  }

  public void setSaldo(float s){
    this.saldo = s;
  }
  public float getSaldo(){
    return this.saldo;
  }

  public void setStatus(boolean st){
    this.status = st;
  }
  public boolean getStatus(){
    return this.status;
  }
  
//Métodos:

  public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if (this.getTipo() == "cc"){
      this.setSaldo(50);
    }else if(this.getTipo() == "cp"){
      this.setSaldo(150);
    }
    System.out.println("Conta aberta com sucesso!!!");
  }

  public void fecharConta(){
    if (this.getSaldo() > 0){
      System.out.println("ERRO ao tentar fechar conta de " + this.getDono() + ": Há saldo na conta!!!");
    }else if (this.getSaldo() < 0){
      System.out.println("Erro ao tentar fechar a conta de " + this.getDono() + ": saldo negativo!!!");
    } else if (this.getSaldo() == 0){
      this.setStatus(false);
      System.out.println("----CONTA de " + this.getDono() +  " ENCERRADA ----");
      
    }
    
  }

  public void depositar(float v){
    if (this.getStatus()){
      this.setSaldo(this.getSaldo() + v);
      System.out.println("Depósito realizado na conta de " + this.getDono());
    }else{
      System.out.println("ERRO: Impossível depositar na conta de " + this.getDono());
    }
  }

  public void sacar(float v){
    if(this.getStatus() && this.getSaldo() >= v){
      this.setSaldo(this.getSaldo() - v);
      System.out.println("Saque realizado na conta de " + getDono());
    }else{
      System.out.println("ERRO: Saldo insuficiente para saque na conta de " + this.getDono());
    }
  }

  public void pagarMensal(){
    float m;
    if (getTipo() == "cc"){
      m = 50;
    }else{
      m = 150;
    }

    if (getStatus()){
      if (getSaldo() >= m){
        setSaldo(getSaldo() - m);
      }else{
        System.out.println("ERRO: Saldo insuficiente para pagar mensalidade na conta de " + this.getDono());
      }
     
    }
    
  }  



}