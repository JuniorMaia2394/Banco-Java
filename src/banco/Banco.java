/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;



/**
 *
 * @author JuniorMaia
 */
public class Banco {

  
   
   
   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("----------BEM-VINDO AO NUBANCO----------");
        String nome;
        System.out.println("DIGITE SEU NOME:");
        nome = ler.nextLine();
        System.out.println("Ola,"+nome+"!");
        
        System.out.println("SELECIONE UMA DAS OPÇÕES:");
        System.out.println("(1) DEPOSITAR");
        System.out.println("(2) SACAR");
        System.out.println("(3) CONSULTAR SALDO");
        System.out.println("(0) SAIR");
        
        int op;
  
        double depositar = 0;
        double poupanca = 0;
        double sacar = 0;
        
        System.out.println("SELECIONE SUA OPÇÃO:");
        op = ler.nextInt();
        if(op == 0){
            System.out.println("ATE MAIS!");
        }
        
       while(op!=0){
           
       if(op == 1){
           System.out.println("QUAL VALOR A DEPOSITAR?");
           depositar = ler.nextDouble();
           poupanca += depositar;
           
                    }else if(op == 2){
                        System.out.println("QUANTO DESEJA SACAR?");
                        sacar = ler.nextInt();                       
                            if(sacar >poupanca){
                                System.out.println("VALOR DE SAQUE MAIOR QUE O SALDO!!");
                            }else{
                                poupanca -= sacar;
                            }
                            
                                    }else if(op == 3){
                                        System.out.println("SEU SALDO É: "+"R$ "+poupanca);
                                    
                                                }
        
        System.out.println("DESEJA FAZER OUTRA OPERAÇÃO?");
           System.out.println("(7) SIM");
           System.out.println("(0) NÃO");
           op = ler.nextInt();
           
           if(op == 7){
           
        System.out.println("SELECIONE UMA DAS OPÇÕES:");
        System.out.println("(1) DEPOSITAR");
        System.out.println("(2) SACAR");
        System.out.println("(3) CONSULTAR SALDO");
        System.out.println("(4) SAIR");
        op=ler.nextInt();
                    }else{
               System.out.println("ATE MAIS!");
           }
           
       }
        
    }
    
}
