package ex2;

public class Empregado {
    private int numeroEmpregado;
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private double salarioAnual;

    public Empregado(int num, String n, String s, double sM){
        this.numeroEmpregado = num;
        this.nome = n;
        this.sobrenome = s;
        this.salarioMensal = sM;
    }
    
        public int getNumeroEmpregado() {
        return numeroEmpregado;
    }

    public void setNumeroEmpregado(int numeroEmpregado) {
        this.numeroEmpregado = numeroEmpregado;
    }
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioAnual() {
        return (salarioMensal*12)*1.1;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    
    public void status(){
        System.out.println("Empregado número: " + this.getNumeroEmpregado()
                         + "\nO nome dele é: " + this.getNome()
                         + "\nO sobrenome dele é: " + this.getSobrenome()
                         + "\nO salário mensal dele é: R$" + this.getSalarioMensal()
                         + "\nO salário anual dele com o aumento é: R$" + this.getSalarioAnual());
    } 
}

