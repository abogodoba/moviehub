// ========================================================
// ESTRUTURA DAS CLASSES DO PROJETO DE ANIME
// ========================================================

class Anime {
    protected String nome;
    protected String genero;
    protected double nota;

    public Anime(String nome, String genero, double nota) {
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
    }

    public void atualizarInformacoes(String novoNome, String novoGenero, double novaNota) {
        this.nome = novoNome;
        this.genero = novoGenero;
        this.nota = novaNota;
        System.out.println(">>> [Sucesso] Informacoes do anime '" + this.nome + "' atualizadas!");
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Nota/Avaliacao: " + nota);
    }
}

class Filme extends Anime {
    private int duracaoMinutos;

    public Filme(String nome, String genero, double nota, int duracaoMinutos) {
        super(nome, genero, nota);
        this.duracaoMinutos = duracaoMinutos;
    }

    public void atualizarInformacoes(String novoNome, String novoGenero, double novaNota, int novaDuracao) {
        super.atualizarInformacoes(novoNome, novoGenero, novaNota);
        this.duracaoMinutos = novaDuracao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Filme | Duracao: " + duracaoMinutos + " minutos");
        System.out.println("-----------------------------------");
    }
}

class Serie extends Anime {
    private int totalTemporadas;
    private int totalEpisodios;

    public Serie(String nome, String genero, double nota, int totalTemporadas, int totalEpisodios) {
        super(nome, genero, nota);
        this.totalTemporadas = totalTemporadas;
        this.totalEpisodios = totalEpisodios;
    }

    public void atualizarInformacoes(String novoNome, String novoGenero, double novaNota, int novasTemporadas, int novosEpisodios) {
        super.atualizarInformacoes(novoNome, novoGenero, novaNota);
        this.totalTemporadas = novasTemporadas;
        this.totalEpisodios = novosEpisodios;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Serie | Temporadas: " + totalTemporadas + " | Episodios: " + totalEpisodios);
        System.out.println("-----------------------------------");
    }
}

// ========================================================
// CLASSE PRINCIPAL QUE EXECUTA O CODIGO (TESTE)
// ========================================================
public class Main {
    public static void main(String[] args) {
        System.out.println("--- CRIANDO OS ANIMES ORIGINAIS ---\n");

        Filme filmeAnime = new Filme("Your Name", "Romance/Drama", 8.4, 106);
        Serie serieAnime = new Serie("Naruto", "Shounen/Acao", 8.3, 5, 220);

        filmeAnime.exibirDetalhes();
        serieAnime.exibirDetalhes();

        System.out.println("\n--- ALTERANDO OS NOMES E INFORMACOES ---\n");

        filmeAnime.atualizarInformacoes("A Viagem de Chihiro", "Fantasia/Aventura", 8.6, 125);
        serieAnime.atualizarInformacoes("Attack on Titan", "Acao/Misterio", 9.1, 4, 87);

        System.out.println("\n--- EXIBINDO OS DADOS JA ALTERADOS ---\n");
        
        filmeAnime.exibirDetalhes();
        serieAnime.exibirDetalhes();
    }
}
