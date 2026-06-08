package br.com.cdl.moviehub.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa;

    // MÉTODO PARA ALTERAR O NOME E TODAS AS INFORMAÇÕES DA SÉRIE
    public void atualizarDados(String novoNome, int novasTemporadas, int novosEpisodios, int novosMinutos) {
        this.setNome(novoNome); // Altera o nome que vem da classe Titulo
        this.temporadas = novasTemporadas;
        this.episodiosPorTemporada = novosEpisodios;
        this.minutosPorEpisodio = novosMinutos;
    }

    // Getters e Setters
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
   
    // Duração total da série
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;     
    }

    // MÉTODO EXEMPLO: Mostra os dados da série na tela
    public void exibirFichaTecnica() {
        System.out.println("--- DADOS DA SÉRIE ---");
        System.out.println("Nome da Série: " + this.getNome());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Duração Total: " + this.getDuracaoEmMinutos() + " minutos");
        System.out.println("----------------------");
    }
}
