import java.util.Scanner;
import br.com.cdl.moviehub.calculos.CalculadoraDeTempo;
import br.com.cdl.moviehub.modelos.Filme;
import br.com.cdl.moviehub.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ========================================================
        // 1. CADASTRO INICIAL DO FILME
        // ========================================================
        Filme filme1 = new Filme();
        System.out.println("--- CADASTRO INICIAL DO FILME ---");
        System.out.println("Digite o nome do filme:");
        filme1.setNome(scanner.nextLine());
        System.out.println("Digite o nome do diretor do filme:");
        filme1.setDiretor(scanner.nextLine());
        System.out.println("Digite o ano de lançamento do filme:");
        filme1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração do filme em minutos:");
        filme1.setTotalEmMinutos(Integer.parseInt(scanner.nextLine().trim()));
        
        System.out.println("Digite a quantidade de avaliações:");
        int qtd = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite a nota da avaliação " + (i + 1) + ":");
            filme1.avalia(Double.parseDouble(scanner.nextLine().trim()));
        }

        // ========================================================
        // ALTERAÇÃO DO FILME (O QUE VOCÊ PEDIU)
        // ========================================================
        System.out.println("\n[ALTERAÇÃO] Vamos alterar os dados do filme que você acabou de criar!");
        System.out.println("Digite o NOVO nome para o Filme (Ex: A Viagem de Chihiro):");
        String novoNomeFilme = scanner.nextLine();
        System.out.println("Digite o NOVO diretor do filme:");
        String novoDiretor = scanner.nextLine();
        System.out.println("Digite o NOVO ano de lançamento:");
        int novoAnoFilme = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Digite a NOVA duração em minutos:");
        int novosMinutosFilme = Integer.parseInt(scanner.nextLine().trim());
        
        // Mudando os dados usando os métodos que atualizamos nas classes
        filme1.atualizarDadosBase(novoNomeFilme, novoAnoFilme, novosMinutosFilme);
        filme1.setDiretor(novoDiretor);
        System.out.println("------------------------------------------------");

        // ========================================================
        // 2. CADASTRO INICIAL DA SÉRIE
        // ========================================================
        System.out.println("\n--- CADASTRO INICIAL DA SÉRIE ---");
        Serie serie1 = new Serie();
        System.out.println("Digite o nome da série:");
        serie1.setNome(scanner.nextLine());
        System.out.println("Digite o ano de lançamento da série:");
        serie1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de temporadas da série:");
        serie1.setTemporadas(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de episódios por temporada:");
        serie1.setEpisodiosPorTemporada(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração de cada episódio em minutos:");
        serie1.setMinutosPorEpisodio(Integer.parseInt(scanner.nextLine().trim()));

        // ========================================================
        // ALTERAÇÃO DA SÉRIE (O QUE VOCÊ PEDIU)
        // ========================================================
        System.out.println("\n[ALTERAÇÃO] Vamos alterar os dados da série que você acabou de criar!");
        System.out.println("Digite o NOVO nome para a Série (Ex: Attack on Titan):");
        String novoNomeSerie = scanner.nextLine();
        System.out.println("Digite o NOVO ano de lançamento:");
        int novoAnoSerie = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Digite a NOVA quantidade de temporadas:");
        int novasTemporadas = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Digite a NOVA quantidade de episódios por temporada:");
        int novosEpisodios = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Digite a NOVA duração de cada episódio:");
        int novosMinutosEpisodio = Integer.parseInt(scanner.nextLine().trim());
        
        // Mudando os dados usando os métodos da classe série
        serie1.atualizarDados(novoNomeSerie, novasTemporadas, novosEpisodios, novosMinutosEpisodio);
        serie1.setAnoDeLancamento(novoAnoSerie);
        System.out.println("------------------------------------------------");

        scanner.close();

        // ========================================================
        // EXIBIÇÃO DOS RESULTADOS FINAIS JÁ ALTERADOS
        // ========================================================
        System.out.println("\n====================================");
        System.out.println("       EXIBINDO DADOS ATUALIZADOS     ");
        System.out.println("====================================");
        
        filme1.exibeFichaTecnica();
        System.out.println("Diretor: " + filme1.getDiretor());
        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());
        
        System.out.println("\n------------------------------------");
        serie1.exibeFichaTecnica();
        System.out.println("Duração Total da Série: " + serie1.getDuracaoEmMinutos() + " minutos");

        // Calculadora de tempo (vai somar usando os dados novos!)
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(serie1);
        System.out.println("\n====================================");
        System.out.println("Tempo total necessário para assistir tudo: " + calculadora.getTempoTotal() + " minutos");
        System.out.println("====================================");
    }
}
