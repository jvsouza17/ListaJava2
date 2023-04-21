package ex3;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa n1 = new Pessoa("João", 17, 06, 2003);
        System.out.println(n1.toString());
        
        Pessoa albertEinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.println("Albert Einstein estaria com " + albertEinstein.getIdade() + " anos hoje.");
        System.out.println("Isaac Newton estaria com " + isaacNewton.getIdade() + " anos hoje.");
    }
}