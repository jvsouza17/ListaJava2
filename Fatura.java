package ex1;
// loja de suprimentos de informática
public class Fatura {
    private String numeroFatura;
    private String descricao;
    private int numSuprimentos;
    private double precoUnitario;
    private double valorTotalFatura;

    public Fatura(String nF, String d, int n, double p) {
        this.numeroFatura = nF;
        this.descricao = d;
        this.numSuprimentos = n;
        this.precoUnitario = p;
        
    } 
    
    public String getNumeroFatura() {
        return numeroFatura;
    }


    public void setNumeroFatura(String numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumSuprimentos() {
        return numSuprimentos;
    }

    public void setNumSuprimentos(int numSuprimentos) {
        this.numSuprimentos = numSuprimentos;
    }


    public double getPrecoUnitario() {
        if(precoUnitario<0){
            precoUnitario = 0.0;
        }
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {

        this.precoUnitario = precoUnitario;
    }
    
    public double getValorTotalFatura() {
        if(valorTotalFatura<0){
            valorTotalFatura = 0;
        }
        valorTotalFatura = (this.numSuprimentos * this.precoUnitario);
        return valorTotalFatura;
    }
    
    public void setValorTotalFatura(double valorTotalFatura) {
        
        this.valorTotalFatura = valorTotalFatura;
    }
    
    public void status(){
        System.out.println("O número da fatura é: " + this.getNumeroFatura()
                         + "\nA descrição da fatura: " + this.getDescricao()
                         + "\nForam comprados " + this.getNumSuprimentos() + " suprimentos"
                         + "\nO preço unitário de cada um é: R$" + this.getPrecoUnitario()
                         + "\nO valor total da fatura é: R$" + this.getValorTotalFatura());
    } 
}