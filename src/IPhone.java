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

    // Método principal
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador de Internet");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    int opMusica = -1;
                    while (opMusica != 3) {
                        System.out.print("Informe o nome da música: ");
                        String musica = scanner.nextLine();
                        iphone.selecionarMusica(musica);

                        System.out.println("1 - Tocar");
                        System.out.println("2 - Pausar");
                        System.out.println("3 - Sair do Reprodutor Musical");
                        System.out.print("Escolha uma opção: ");
                        opMusica = scanner.nextInt();
                        scanner.nextLine();

                        switch (opMusica) {
                            case 1:
                                iphone.tocar();
                                break;
                            case 2:
                                iphone.pausar();
                                break;
                            case 3:
                                System.out.println("Saindo do Reprodutor Musical...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 2:
                    int opTelefone = -1;
                    while (opTelefone != 4) {
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Atender");
                        System.out.println("3 - Correio de Voz");
                        System.out.println("4 - Sair do Sistema Telefônico");
                        System.out.print("Escolha uma opção: ");
                        opTelefone = scanner.nextInt();
                        scanner.nextLine();

                        switch (opTelefone) {
                            case 1:
                                System.out.print("Digite o número: ");
                                String numero = scanner.nextLine();
                                iphone.ligar(numero);
                                break;
                            case 2:
                                iphone.atender();
                                break;
                            case 3:
                                iphone.iniciarCorreioVoz();
                                break;
                            case 4:
                                System.out.println("Saindo do Sistema Telefônico...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 3:
                    int opNavegador = -1;
                    while (opNavegador != 4) {
                        System.out.println("1 - Exibir Página");
                        System.out.println("2 - Nova Aba");
                        System.out.println("3 - Atualizar Página");
                        System.out.println("4 - Sair do Navegador");
                        System.out.print("Escolha uma opção: ");
                        opNavegador = scanner.nextInt();
                        scanner.nextLine();

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
                            case 4:
                                System.out.println("Saindo do Navegador...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}