package br.com.cdl.moviehub.modelos;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme1 = new Filme();
        System.out.println("Digite o nome do filme:");
        filme1.setNome(scanner.nextLine());
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
        scanner.close();
        filme1.exibeFichaTecnica();

        //Exibindo as avaliacoes do filme

        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());
    }

}
