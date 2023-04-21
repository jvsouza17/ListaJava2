
package ex3;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int idade;
    private LocalDate dataNascimento;
    
    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
        this.idade = calcularIdade();
    }
    
    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - dataNascimento.getYear();
            if (hoje.getMonthValue() <= dataNascimento.getMonthValue() && hoje.getDayOfMonth() < dataNascimento.getDayOfMonth()) {
                idade--;
            }
        return idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
     public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Data de Nascimento: " + dataNascimento;
    }
}


