import java.util.List;
import java.util.ArrayList;

public class JogadorGerador {
    private static String listaDeNomes;
    private static String listaDeSobrenomes;
    private static String listaDeClubes;
    private static String listaDePosicoes;

    static {
        try {
            listaDeNomes = Main.retornaListaDaURI("https://venson.net.br/resources/data/nomes.txt");
            listaDeSobrenomes = Main.retornaListaDaURI("https://venson.net.br/resources/data/sobrenomes.txt");
            listaDeClubes = Main.retornaListaDaURI("https://venson.net.br/resources/data/clubes.txt");
            listaDePosicoes = Main.retornaListaDaURI("https://venson.net.br/resources/data/posicoes.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Jogador criarJogador() {
        String nome = Main.retornaIndiceAleatorio(listaDeNomes);
        String sobrenome = Main.retornaIndiceAleatorio(listaDeSobrenomes);
        String clube = Main.retornaIndiceAleatorio(listaDeClubes);
        String posicao = Main.retornaIndiceAleatorio(listaDePosicoes);
        int idade = Main.geraNumeroAleatorio(17, 40);

        return new Jogador(nome, sobrenome, clube, posicao, idade);
    }
}

class Jogador {
    private String nome;
    private String sobrenome;
    private String clube;
    private String posicao;
    private int idade;

    public Jogador(String nome, String sobrenome, String clube, String posicao, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.clube = clube;
        this.posicao = posicao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getClube() {
        return clube;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getIdade() {
        return idade;
    }

    public String getDescricao() {
        return nome + " " + sobrenome +
                " é um jogador profissional do " + clube +
                ", Atualmente está na posição " +
                posicao + " e possui " + idade + " anos de idade.";
    }
}
