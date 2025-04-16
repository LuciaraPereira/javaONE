package informacoes.aluno.desafio;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private double nota;
    private  int idade;

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public  void setIdade(int idade){
        this.idade = idade;
    }

    Scanner leitura = new Scanner(System.in);
    public void media() {
        double soma = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite a " + i  + "ª nota: ");
            nota = leitura.nextInt();
            soma = soma + nota;
        }
        double media = soma / 4;
        System.out.println("A média é: " + media);
    }

    public void menorOuMaior(){
        if (idade < 18){
            System.out.println("Menor de idade");
        }else {
            System.out.println("Maior de idade");
        }
    }
}
