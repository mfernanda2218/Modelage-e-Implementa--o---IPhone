import java.util.Scanner;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Implementação dos métodos do Reprodutor Musical
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos do Aparelho Telefônico
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Acessando correio de voz...");
    }

    // Implementação dos métodos do Navegador na Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método main para testes
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que você deseja fazer no IPhone?");
        System.out.println("1 - Reproduzir música");
        System.out.println("2 - Fazer uma ligação");
        System.out.println("3 - Navegar na internet");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        while (opcao != 0) {
            switch (opcao) {
            case 1:
                System.out.print("Informe o nome da música: ");
                String musica = scanner.nextLine();
                iphone.selecionarMusica(musica);

                System.out.println("O que deseja fazer com a música?");
                System.out.println("1 - Tocar");
                System.out.println("2 - Pausar");
                int opMusica = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opMusica) {
                    case 1:
                        iphone.tocar();
                        break;
                    case 2:
                        iphone.pausar();
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                break;
            case 2:
                System.out.println("O que deseja fazer com o telefone?");
                System.out.println("1 - Ligar");
                System.out.println("2 - Atender");
                System.out.println("3 - Acessar correio de voz");
                System.out.print("Escolha uma opção: ");
                int opTelefone = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opTelefone) {
                    case 1:
                        System.out.print("Informe o número para ligar: ");
                        String numero = scanner.nextLine();
                        iphone.ligar(numero);
                        break;
                    case 2:
                        iphone.atender();
                        break;
                    case 3:
                        iphone.iniciarCorreioVoz();
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                break;
            case 3:
                System.out.println("O que deseja fazer no navegador?");
                System.out.println("1 - Exibir página");
                System.out.println("2 - Adicionar nova aba");
                System.out.println("3 - Atualizar página");
                System.out.print("Escolha uma opção: ");
                int opNavegador = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opNavegador) {
                    case 1:
                        System.out.print("Informe a URL: ");
                        String url = scanner.nextLine();
                        iphone.exibirPagina(url);
                        break;
                    case 2:
                        iphone.adicionarNovaAba();
                        break;
                    case 3:
                        iphone.atualizarPagina();
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
            }
        }
        
    }
}