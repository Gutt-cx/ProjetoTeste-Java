package Domain;

import java.io.IOException;


public class Common {

    public static void menu() {
        System.out.println("--------------------------------------");
        System.out.println("[SGS] Sistema de Gerenciamento de Seminários");
        System.out.println("--------------------------------------");
        System.out.println("Selecione uma opção:");
        System.out.println();
        System.out.println("( 1 ) Consultar Seminários.");
        System.out.println("( 2 ) Consultar Professores.");
        System.out.println("( 3 ) Consultar Alunos.");
        System.out.println();
        System.out.println("( 4 ) Cadastrar Seminário.");
        System.out.println("( 5 ) Cadastrar Professor.");
        System.out.println("( 6 ) Cadastrar Aluno.");
        System.out.println();
        System.out.println("( 7 ) Encerrar o Programa.");
    }

    public void exibirProfessores() {

    }


    public static void clearScreen() {
        for (int i = 0; i <= 50; i++) {
            System.out.println(" ");
        }

    }




}