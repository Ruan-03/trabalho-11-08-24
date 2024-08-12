public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        boolean executar = true;
        while (executar) {
            cadastro.imprimirMenu();
            String opcao = cadastro.scanner.nextLine();
            switch (opcao) {
                case "1":
                    cadastro.adicionarJogador();
                    break;

                case "2":
                    cadastro.lerJogador();
                    break;

                case "3":
                    cadastro.deletarJogador();
                    break;

                case "4":
                    cadastro.scanner.close();
                    executar = false;
                    break;

                default:
                    System.out.println("Opcao invalida, escolha outra opcao.");
                    break;
            }
        }
    }
}

