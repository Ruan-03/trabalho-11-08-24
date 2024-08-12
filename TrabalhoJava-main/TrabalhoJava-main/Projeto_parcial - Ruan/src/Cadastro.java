import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    BancoDeDados bancoDeDados = new BancoDeDados();
    Jogadores jogador = new Jogadores();

    void adicionarJogador() {
        List<String[]> lista = new ArrayList<>();



        //Insira seu código aqui

        System.out.println("Digite o nome do jogador:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do jogador:");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a posição do jogador:");
        String posicao = scanner.nextLine();


        jogador.inserirJogador(lista);
        bancoDeDados.close();

    }
}

    void lerJogador(){
        //Insira seu código aqui
        void lerJogador() {
            System.out.println("Digite o nome do jogador que deseja consultar:");
            String nome = scanner.nextLine();

            String[] jogadorEncontrado = jogadores.consultarJogador(nome);

            if (jogadorEncontrado != null) {
                System.out.println("Jogador encontrado:");
                System.out.println("Nome: " + jogadorEncontrado[0]);
                System.out.println("Idade: " + jogadorEncontrado[1]);
                System.out.println("Posição: " + jogadorEncontrado[2]);
            } else {
                System.out.println("Jogador não encontrado.");
            }
        }

    }

    void deletarJogador(){
        //Insira seu código aqui
        System.out.println("Digite o nome do jogador que deseja deletar:");
        String nome = scanner.nextLine();

        boolean resultado = jogadores.deletarJogador(nome);

        if (resultado) {
            System.out.println("Jogador deletado com sucesso!");
        } else {
            System.out.println("Jogador não encontrado.");
        }
    }


    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir jogador");
        System.out.println("2- Consultar jogador");
        System.out.println("3- Deletar jogador");
        System.out.println("4- Sair");
    }
}
