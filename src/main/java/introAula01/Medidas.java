// 1 - Pacote
package introAula01;

// 2 - Bibliotecas ou Referência

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Bom Dia");
        System.out.println("Calculo de Areas");

        // Calcular o tamanho da area - Exemplo: o tamanho do tapete ou do piso

    }

    public void calcularAreaModoExtenso(){
        int largura;
        int comprimento;
        int resultado;

        largura = 4; // largura recebe 4
        comprimento = 3; // comprimento recebe 3

        resultado = largura * comprimento; // Calculo recebe em resultado
        System.out.println("Para a largura de " + largura + " m² e comprimento de  " + comprimento + " m² o resultado é: " + resultado + "m²");
    }

    public void calcularAreaModoCompacto(){
        // Calculo da area - Reduzida
        int largura = 4;
        int comprimento = 3;
        System.out.println( "O resultado é " + largura * comprimento);
    }

}
