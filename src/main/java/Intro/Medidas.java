//Pacotes
package Intro;

//Referências as bibliotecas

import java.util.Scanner;

//classe
public class Medidas {
    //Atributos (Características)
    //Métodos e Funções (verbos - o que a coisa sabe fazer)
    //Método (faz e não retorna) Função (faz e retorna)

    public static void main(String[] arg){
        System.out.println("Cálculo de áreas");

    int largura = 4;
    int comprimento = 3;
        System.out.println("a largura de " + largura + " m² "
                            + "e o comprimento de " + comprimento +" m² "
                            + "formam uma área de " + largura * comprimento + " m²");

        Scanner sc = new Scanner(System.in);

        String opcao = sc.next();
        switch (opcao){
            case "a":
                System.out.println("Opção A");
                break;
            case "b":
                System.out.println("Opção B");
                break;
        }

    }

}
