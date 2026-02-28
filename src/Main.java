import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> tarefas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n===== BOARD DE TAREFAS =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    removerTarefa();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    static void adicionarTarefa() {
        System.out.print("Digite a tarefa: ");
        String tarefa = scanner.nextLine();
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada!");
    }

    static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        System.out.println("\n--- Tarefas ---");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i));
        }
    }

    static void removerTarefa() {
        listarTarefas();
        System.out.print("Digite o número da tarefa para remover: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
            System.out.println("Tarefa removida!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}