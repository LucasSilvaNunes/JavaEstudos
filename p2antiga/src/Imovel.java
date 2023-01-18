package imoveis;
public  class Imovel {
  
  private String localizacao;
  private double preco;
  private int qtdquartos;
  private String prop;    
  
  public Imovel(){
    
  }
  public Imovel(String localizacao, double preco, int qtdquartos, String prop){
    this.localizacao = localizacao; 
    this.preco = preco;
    this.qtdquartos = qtdquartos;
    this.prop = prop;
  }
  public String toString(){
    return("\nLocalizacao:  "+localizacao+"\nPreço: "+preco+"\nQuantidade de quartos: "+qtdquartos+"\nProprietário: "+prop);
  }           
           

  public String getLocalizacao(){
    return localizacao;
  }

  public void setLocalizacao(String localizacao){
    this.localizacao = localizacao;
  }

  public double getPreco(){
    return preco;
  }

  public void setPreco(double preco){
    this.preco = preco;
  }

  public int getQtdquartos(){
    return qtdquartos;
  }

  public void setQtdquartos(int qtdquartos){
    this.qtdquartos = qtdquartos;
  }

  public String getProp(){
    return prop;
  }

  public void setProp(String prop){
    this.prop = prop;
  }
  
}        
