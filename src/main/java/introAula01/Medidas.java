// 1 - Pacote
package introAula01;

// 2 - Bibliotecas ou Referência


import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware, um software...

        // Utilizar a classe Scanner do Java para receber a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" M E N U D E O P Ç Õ E S ");
        System.out.println(" c - Calcular área Modo Curto: ");
        System.out.println(" e - Calcular área Modo Extenso:  ");
        System.out.println(" i - If Simples  ");
        System.out.println(" d - Contagem de 1 a 10:  ");
        System.out.println(" r - Contagem de 10 a 0:  ");
        System.out.println(" Digite a opção desejada:  ");
        String opcao = scanner.next();


        // Estrutura: switch(seletor) = o comportamento do programa conforme a escolha da pessoa ou do software

        // String opcao = "curto";

        switch (opcao) {
            case "i", "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "c", "C":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "e", "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "d", "D":
                System.out.println("Você escolheu executar o método contarAte10");
                contarAteDez();
            case "r", "R":
                System.out.println("Você escolheu executar o método contagemRegressivaAte0 ");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada.");
                break;

        }

    }

    public static void ifSimples() {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware, um software...

        // if = se
        // else = se não

        String modo = "curto";

        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();
        }

    }

    public static void calcularAreaModoCurto() {
        System.out.println("Calculo de Area Modo Curto");

        // Calculo de area - Reduzido

        int largura = 4;
        int comprimento = 3;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área é de " + largura * comprimento + "m2");
    }


    public static void calcularAreaModoExtenso() {
        System.out.println("Calculo de Area Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso

        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 5
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + " a area é de " + resultado + "m2");

    }


    public static void contarAteDez() {
        // Loops ou Repetições
        // for = repetição incodicional
        System.out.println("Contagem Crescente: ");

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("O numero é " + numero);
        }
    }

    public static void contagemRegressiva() {
        {

            System.out.println("Contagem regressiva: ");

            for (int numero = 10; numero > -1; numero--) {
                System.out.println("O numero é:" + numero);
            }


        }

    }
}