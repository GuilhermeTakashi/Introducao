// 1 - Pacote
package introAula01;

// 2 - Bibliotecas ou Referência

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Esvaziou esses codigos e jogou em modo curto
        // Como chamar os Public void
        // Fazer a instancia ou metodo estatico
        // Menu de Restaurante

        calcularAreaModoCurto();
        calcularAreaModoExtenso();


    }
    public static void calcularAreaModoCurto(){
        System.out.println("Calculo de Areas Modo Curto");

        // Calculo de area - Reduzido

        int largura = 4;
        int comprimento = 3;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área é de " + largura * comprimento + "m2");
    }


    public static void calcularAreaModoExtenso(){
        System.out.println("Calculo de Areas Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso

        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 5
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " +largura+ "m e o comprimento de " + comprimento + " a area é de " + resultado + "m2" );

    }




    }


