package br.com.cdl.moviehub.modelos;

public class Filme extends Titulo {
    private String diretor;

    // MÉTODO PARA ALTERAR O NOME E O DIRETOR DO FILME
    public void atualizarDados(String novoNome, String novoDiretor) {
        this.setNome(novoNome); // Altera o nome que vem da classe Titulo
        this.diretor = novoDiretor; // Altera o diretor aqui do Filme
    }

    // Getters e Setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return getTotalEmMinutos();
    }
    
    // MÉTODO EXEMPLO: Mostra os dados do filme na tela
    public void exibirFichaTecnica() {
        System.out.println("--- DADOS DO FILME ---");
        System.out.println("Nome do Filme: " + this.getNome());
        System.out.println("Diretor: " + this.diretor);
        System.out.println("----------------------");
    }
}
