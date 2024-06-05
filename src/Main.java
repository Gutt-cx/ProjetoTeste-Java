import java.util.ArrayList;
import java.util.Scanner;
import Domain.Aluno;
import Domain.Common;
import Domain.Professor;
import Domain.Seminario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Seminario> seminariosRegister = new ArrayList<Seminario>();
        ArrayList<Professor> professorsRegister = new ArrayList<Professor>();
        ArrayList<Aluno> alunosRegister = new ArrayList<Aluno>();

        Scanner input = new Scanner(System.in);

        boolean init = true;

        while (init) {
            Common.menu();

            int start = input.nextInt();

            switch (start) {

                case 1:
                    break;

                case 2:
                    System.out.println("Professores Registrados");

                    for (int i = 0; i < professorsRegister.size(); i++) {
                        System.out.println("___________________________________");
                        System.out.println("Nome: " + professorsRegister.get(i).getNome());
                        System.out.println("Especialidade: " + professorsRegister.get(i).getEspecialidade());
                    }
                    break;

                case 3:
                    System.out.println("Alunos Registrados:");

                    for (int i = 0; i < alunosRegister.size(); i++) {
                        System.out.println("___________________________________");
                        System.out.println("* " + alunosRegister.get(i).getNome());
                    }
                    break;

                case 4:
                    Common.clearScreen();
                    input.nextLine();

                    System.out.println("Digite o Titulo do Seminario:");
                    String titulo = input.nextLine();

                    System.out.println("Informe o endereço do local:");
                    String endereco = input.nextLine();

                    System.out.println("Informe o professor palestrante:");

                    break;

                case 5:
                    Common.clearScreen();
                    input.nextLine();

                    System.out.println("Digite o nome do Professor:");
                    String nomeProfessor = input.nextLine();

                    System.out.println("Digite a Especialidade do Professor:");
                    String especialidade = input.nextLine();

                    Professor ProfessorRegistrado = new Professor(nomeProfessor, especialidade);
                    professorsRegister.add(ProfessorRegistrado);
                    break;


                case 6:
                    Common.clearScreen();
                    input.nextLine();

                    System.out.println("Digite o nome do Aluno:");
                    String nomeAluno = input.nextLine();

                    System.out.println("Digite a idade do Aluno");
                    int idade = input.nextInt();
                    input.nextLine();

                    Aluno alunoRegistrado = new Aluno(nomeAluno, idade);
                    alunosRegister.add(alunoRegistrado);
                    break;

                case 7:
                    System.out.println("Encerrando...");
                    init = false;
                    break;

                default:
                    Common.clearScreen();
                    System.out.println("[!] Opção Invalida, por favor escolha novamente");
                    break;


            }

        }

    }
}