package ex4;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimeDetalhes() {
        System.out.println("Nome: " + nome + ", Preço: R$ " + preco);
    }
}

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void imprimeDetalhes() {
        super.imprimeDetalhes();
        System.out.println("Autor: " + autor);
    }
}

public class CD extends Produto {
    private int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    @Override
    public void imprimeDetalhes() {
        super.imprimeDetalhes();
        System.out.println("Número de Faixas: " + numeroFaixas);
    }
}

public class DVD extends Produto {
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public void imprimeDetalhes() {
        super.imprimeDetalhes();
        System.out.println("Duração: " + duracao + " minutos");
    }
}

public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("O Pequeno Príncipe", 19.90, "Antoine de Saint-Exupéry");
        produtos[1] = new Livro("A Arte da Guerra", 29.90, "Sun Tzu");
        produtos[2] = new CD("Thriller", 29.90, 9);
        produtos[3] = new CD("Back in Black", 24.90, 10);
        produtos[4] = new DVD("Titanic", 39.90, 194);

        for (Produto produto : produtos) {
            produto.imprimeDetalhes();
        }
    }
}