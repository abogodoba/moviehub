public class Filme {

    //declarando os atributos da classe
    String nome;
    int anoDeLancamento, totalEmMinutos, totalDeAvaliacoes;
    double somaDasAvaliacoes;

    //criando as ações da classe

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + totalEmMinutos);
    }




}