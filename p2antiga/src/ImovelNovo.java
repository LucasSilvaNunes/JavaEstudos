package imoveis;
public class ImovelNovo extends Imovel{
  
  private double taxaAdd;
  private String estado;
  
  public ImovelNovo(){
    
  }
  public ImovelNovo(Imovel im, double taxaAdd, String estado){
    super(im.getLocalizacao(),im.getPreco(),im.getQtdquartos(),im.getProp());
    this.taxaAdd = taxaAdd;
    this.estado = estado;
  }

  public double calcularValorFinal(){
    return(taxaAdd*super.getPreco());
  }
  public String toString(){
    return (super.toString()+"\nValor final: "+calcularValorFinal()+"\nAno de construção: "+estado);
  }

  public double getTaxaAdd(){
    return taxaAdd;
  }
  public void setTaxaAdd(double taxaAdd){
    this.taxaAdd = taxaAdd;
  }
  public String getEstado(){
    return estado;
  }
  public void setestado(String estado){
    this.estado = estado;
  }
}
