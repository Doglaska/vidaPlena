package com.estudos.vidaplena;

import java.util.Scanner;

public class VidaPlena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;
        
            System.out.println("MENU");
            System.out.println("1 - Pacientes");
            System.out.println("2 - Profissionais");
            System.out.println("3 - Consultas");
            System.out.println("4 - Atendimento");
            System.out.println("5 - Pagamentos");
            System.out.println("6 - Relatorios");
            System.out.println("0 - Voltar");
            
            System.out.print("Insira uma opcao: ");
            op = sc.nextInt();
            
            switch (op){
                case 1:
                    System.out.println("Pacientes"); 
                    break;
                case 2:
                    System.out.println("Profissionais");
                    break;
                case 3:
                    System.out.println("Consultas");
                    break;
                case 4:
                    System.out.println("Atendimento");
                    break;
                case 5:
                    System.out.println("Pagamentos");
                    break;
                case 6:
                    System.out.println("Relatorios");
                    break;
                case 0:
                    System.out.println("Voltar");
                    break;
                default:
                    System.out.println("Valor invalido");
            }
        
  
        
        
        sc.close();
    }
    
}
