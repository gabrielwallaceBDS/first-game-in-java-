import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

    public class jogo{

        public static void main(String [] args){

            PrintStream show = System.out;
            Scanner scan = new Scanner(System.in);
            Random gerador = new Random();

            int opcao;
            int escolha_computador;
            int escolha_usuario;

            show.println("Olá! Qual o seu nome?");
            String nome = scan.nextLine();
            show.println("Prazer em conhece-lo" + nome+"!");
            show.println(nome + ", voce quer jogar comigo?");
            show.println("\nInforme o numero da sua opcao. \n1 -> SIM\n1 -> NAO");
            opcao = scan.nextInt();

            if(opcao == 2){

                show.println("Que pena! mas tudo bem, fica pra proxima");
            }else if(opcao == 1) {

                show.println("ok! o jogo e assim...");
                show.println("Eu vou escolher um numero de 0 a 10... ");
                show.println("mas nao vou falar para voce qual foi. ");
                show.println("se voce conseguir adivinhar qual foi... ");
                show.println("voce sera o vencedor!!");

                escolha_computador = gerador.nextInt(11);

                show.println("Ok, "+nome+". Eu ja escolhi!");
                show.println("Agora tente adivinhar!");

                do{
                    escolha_usuario = scan.nextInt();
                    if(escolha_usuario != escolha_computador){
                        show.println("resposta errada!");
                    }else{
                        show.println("Parabens! Voce acertou");
                    }
                }while(escolha_computador != escolha_usuario); 
            }


        }
    }