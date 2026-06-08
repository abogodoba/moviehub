package br.com.cdl.moviehub.modelos;

public class Titulo {
     //declarando os atributos da classe
    private String nome;
    private int anoDeLancamento, totalEmMinutos, totalDeAvaliacoes;
    private double somaDasAvaliacoes,nota, pegaMedia;
    private boolean incluidoNoPlano;

    // ====================================================================
    // NOVO MÉTODO: AÇÃO PARA ALTERAR OS DADOS ORIGINAIS DE QUALQUER TÍTULO
    // ====================================================================
    public void atualizarDadosBase(String novoNome, int novoAno, int novosMinutos) {
        this.nome = novoNome;
        
        // Usamos as mesmas validações que você já tinha criado abaixo
        if (novoAno > 1888) {
            this.anoDeLancamento = novoAno;
        } else {
            System.out.println("Erro ao alterar: Ano de lançamento inválido!");
        }

        if (novosMinutos > 0) {
            this.totalEmMinutos = novosMinutos;
        } else {
            System.out.println("Erro ao alterar: Duração inválida!");
        }
        System.out.println(">>> [Sucesso] Dados originais do título alterados para: " + novoNome);
    }
    // ====================================================================

    //criando as ações da classe
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme/série: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + totalEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        if (anoDeLancamento>1888) {
            this.anoDeLancamento = anoDeLancamento;
        } else {
            System.out.println("Ano de lançamento inválido!");
        }
    }

    public int getTotalEmMinutos() {
        return totalEmMinutos;
    }

    public void setTotalEmMinutos(int totalEmMinutos) {
        if (totalEmMinutos>0) {
            this.totalEmMinutos = totalEmMinutos;
         } else {
            System.out.println("Duração do filme inválida!");
         }
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPegaMedia() {
        return pegaMedia;
    }

    public void setPegaMedia(double pegaMedia) {
        this.pegaMedia = pegaMedia;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return totalEmMinutos;
    }
}
