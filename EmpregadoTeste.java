package ex2;

public class EmpregadoTeste {
    public static void main(String[] args) {

        Empregado e1 = new Empregado(1, "João", "Victor", 3000);
        Empregado e2 = new Empregado(2, "Lucas", "Henrique", 2000);
        e1.status();
        e2.status();
    }
    
}
