/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.exercicio;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExercicioCinco {
    
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Digite um numero: ");
        double pnumero = sc.nextDouble();
        
        System.out.println("Digite o operador: ");
        String op = sc.next();
        
        System.out.println("Digite um outro numero: ");
        double snumero = sc.nextDouble();
        
        switch (op){
            case "+" :
                resultado = (pnumero + snumero);
                break;
            case "-":
                resultado = (pnumero - snumero);
                break;
            case "*":
                resultado = (pnumero * snumero);
                break;
            case "/":
                resultado = (pnumero / snumero);
                break;
        }
          System.out.println("O resultado é : " + resultado);
    }
    
}