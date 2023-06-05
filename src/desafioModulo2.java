import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class desafioModulo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0");

        System.out.println("[------------- Bem vindes ------------]");
        System.out.println("Você deve escolher um número inteiro se você acertar o número recebe 10 pontos, " +
                "se você digitar um número acima ou abaixo recebe 5 pontos e se não acertar não recebe nada.");
        System.out.println("Escolha a dificuldade do seu jogo:");
        System.out.println("1 - Dificuldade de 1 até 10");
        System.out.println("2 - Dificuldade de 1 até 20");
        System.out.println("3 - Dificuldade de 1 até 50");
        System.out.println("4 - Dificuldade de 1 até 100");
        System.out.println("5 - Dificuldade de 1 até 1000");
        System.out.println("Pode digitar por favor de 1 à 5: ");
        int dificuldadeInserida = scanner.nextInt();

        //gera o número aleatório de 1 até 1000;
        int max = 1000;
        int min = 1;
        int range = max - min + 1;
        double random = (int)(Math.random() * range - 1);

        //regras do jogo
        int acertouPontos = 10;
        int numProximoPontos = 5;

        // contador de acertos e erros;
        int acertos = 0;
        int errou = 0;
        int pontuacao = 0;

        ArrayList<Integer> numerosInseridos = new ArrayList<>();
        ArrayList<Integer> numerosRandomizados = new ArrayList<>();
        ArrayList<Integer> numerosAcertados = new ArrayList<>();
        ArrayList<Integer> numerosErrados = new ArrayList<>();

        switch (dificuldadeInserida) {
            case 1:
                //gerando números aleatórios somente de 1 a 10;
                range = 10 - 1 + 1;

                for (int i = 0; i < 5; i++){
                    random = (int)(Math.random() * range + 1);
                    numerosRandomizados.add(Integer.valueOf((int) random));
                    System.out.println("Insira o " + ( i + 1 ) + "ª número:");
                    numerosInseridos.add(scanner.nextInt());
                }
                //for para fazer a comparação entre os dados inseridos e randomizados entre 2 listas diferentes.
                for (int i = 0; i < numerosInseridos.size() && i <= numerosRandomizados.size(); i++){

                    //faz a comparação com o primeiro número que o usuário digitou com o primeiro número randomizado pelo sistema.
                    if (numerosInseridos.get(i).equals(numerosRandomizados.get(i))){
                        numerosAcertados.add(numerosInseridos.get(i));
                        pontuacao += acertouPontos;
                        acertos++;
                    }

                    if ((numerosInseridos.get(i) - 1) == numerosRandomizados.get(i) || (numerosInseridos.get(i) + 1) == numerosRandomizados.get(i)) {
                        numerosAcertados.add(numerosInseridos.get(i));
                        pontuacao += numProximoPontos;
                        acertos++;
                    }

                    if (!numerosInseridos.get(i).equals(numerosRandomizados.get(i))){
                        numerosErrados.add(numerosInseridos.get(i));
                        errou++;
                    }
                }

                System.out.println("O sistema gerou os seguintes números:" + numerosRandomizados);
                System.out.println("Você digitou os seguintes números:" + numerosInseridos);
                System.out.println("Você acertou um total de " + acertos + " números, parabéns!");
                System.out.println("Você errou um total de " + errou + " números, :(");
                System.out.println("Você fez um total de pontos de: " + pontuacao);

                break;
            case 2:
                //gerando números aleatórios somente de 1 a 20;
                range = 20 - 1 + 1;
                random = (int)(Math.random() * range + 1);

                break;
            case 3:
                //gerando números aleatórios somente de 1 a 50;
                range = 50 - 1 + 1;
                random = (int)(Math.random() * range + 1);

                break;
            case 4:
                //gerando números aleatórios somente de 1 a 100;
                range = 100 - 1 + 1;
                random = (int)(Math.random() * range + 1);

                break;
            case 5:
                //gerando números aleatórios somente de 1 a 1000;
                range = 1000 - 1 + 1;
                random = (int)(Math.random() * range + 1);

                break;

            default:

                break;
        }




    }
}
