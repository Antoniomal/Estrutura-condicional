package condicional;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da disciplina: ");
        String disciplina = scanner.nextLine();

        System.out.print("Digite a quantidade de aulas dadas: ");
        int totalAulas = scanner.nextInt();

        int totalFaltas;
        double[] notas = new double[3]; 
        for (int i = 0; i < 3; i++) { 
            System.out.printf("Digite a nota do %dº trimestre: ", i + 1); 
            notas[i] = scanner.nextDouble();
        }

        System.out.print("Digite o total de faltas do aluno: ");
        totalFaltas = scanner.nextInt();

        double media = calcularMedia(notas);
        double presenca = 100.0 * (totalAulas - totalFaltas) / totalAulas;

        System.out.println("\nDisciplina: " + disciplina);
        System.out.printf("Média do aluno: %.2f\n", media);
        System.out.printf("Presença: %.2f%%\n", presenca);

        if (media >= 6.0 && presenca >= 75.0) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        System.out.print("Digite a renda do funcionário: ");
        double renda = scanner.nextDouble();
        double imposto = calcularImpostoDeRenda(renda);
        System.out.printf("Desconto do imposto de renda: R$ %.2f\n", imposto);

        System.out.print("Digite um número entre 1 e 7 referente ao dia da semana: ");
        int dia = scanner.nextInt();
        String nomeDia = nomeDoDia(dia);
        System.out.println("Dia da semana: " + nomeDia);

        scanner.close();
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static double calcularImpostoDeRenda(double renda) {
        if (renda <= 1903.98) {
            return 0.0;
        } else if (renda <= 2826.65) {
            return renda * 0.075 - 142.80;
        } else if (renda <= 3751.05) {
            return renda * 0.15 - 354.80;
        } else if (renda <= 4664.68) {
            return renda * 0.225 - 636.13;
        } else {
            return renda * 0.275 - 869.36;
        }
    }

    public static String nomeDoDia(int dia) {
        switch (dia) {
            case 1: return "Domingo";
            case 2: return "Segunda-feira";
            case 3: return "Terça-feira";
            case 4: return "Quarta-feira";
            case 5: return "Quinta-feira";
            case 6: return "Sexta-feira";
            case 7: return "Sábado";
            default: return "Dia inválido";
        }
    }
}

