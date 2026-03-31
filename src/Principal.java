import java.util.Scanner;

import br.com.cdl.moviehub.modelos.Filme;
import br.com.cdl.moviehub.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Informação dos filmes
        Filme filme1 = new Filme();
        System.out.println("Digite o nome do filme:");
        filme1.setNome(scanner.nextLine());
        System.out.println("Digite o nome do diretor do filme:");
        filme1.setDiretor(scanner.nextLine());
        System.out.println("Digite o ano de lançamento do filme:");
        filme1.setAnoDeLancamento(scanner.nextInt());
        System.out.println("Digite a duração do filme em minutos:");
        filme1.setTotalEmMinutos(scanner.nextInt());
        System.out.println("Digite a quantidade de avaliações:");
        int qtd= scanner.nextInt();
        for (int i=0;i<qtd;i++){
            System.out.println("Digite a nota da avaliação " + (i+1) + ":");
            filme1.avalia(scanner.nextDouble());
        }
        // Informação das séries
        Serie serie1 = new Serie();
        System.out.println("Digite o nome da série:");
        serie1.setNome(scanner.nextLine());
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Digite o ano de lançamento da série:");
        serie1.setAnoDeLancamento(scanner.nextInt());
        System.out.println("Digite a quantidade de temporadas da série:");
        serie1.setTemporadas(scanner.nextInt());
        System.out.println("Digite a quantidade de episódios por temporada:");
        serie1.setEpisodiosPorTemporada(scanner.nextInt());
        System.out.println("Digite a duração de cada episódio em minutos:");
        serie1.setMinutosPorEpisodio(scanner.nextInt());
        scanner.close();
        filme1.exibeFichaTecnica();
        serie1.exibeFichaTecnica();
        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());
}
}
