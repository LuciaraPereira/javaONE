import informacoes.aluno.desafio.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno alunoDados = new Aluno();

        alunoDados.setIdade(18);

        alunoDados.media();
        alunoDados.menorOuMaior();

    }
}