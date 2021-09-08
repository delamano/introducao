//Pacotes
package Intro;

//Referências as bibliotecas

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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


        System.out.println();
        System.out.println("MENU DE OPÇÕES");
        System.out.println("a - ");
        System.out.println("b - ");
        System.out.println("c - FOR");
        System.out.println("d - WHILE");



        Scanner sc = new Scanner(System.in);

        String opcao = sc.next();
        switch (opcao){
            case "a":
                System.out.println("Opção A");
                break;
            case "b":
                System.out.println("Opção B");
                break;
            case "c":
                System.out.println("Voce escolheu usar o For");
                usandoFor();
                break;
            case "d":
                System.out.println("Você escolheu usar While");
                usandoWhile();
                break;
        }

        System.out.println("Digite de 1 a 7");
        int diasSemana = sc.nextInt();

        if(diasSemana==1){
            System.out.println("segunda-feira");
        }
        else if(diasSemana==2){
            System.out.println("terça-feira");
        }
        else if(diasSemana==3){
            System.out.println("quarta-feira");
        }
        else if(diasSemana==4){
            System.out.println("quinta-feira");
        }
        else if(diasSemana==5){
            System.out.println("sexta-feira");
        }
        else if(diasSemana==6){
            System.out.println("sábado");
        }
        else if(diasSemana==7){
            System.out.println("domingo");
        }
        else{
            System.out.println("Digitou errado");
        }
    }
    public static void usandoFor(){

        System.out.println("Usando for");

        for(int i=1; i<=10; i++ ){
            System.out.println(i);
        }

    }

    public static void usandoWhile(){
     int numero = 1;
        while(numero<=10){
            System.out.println("Ainda está menor ou igual " + numero);
        numero = numero +1;
        }
    }



    }


