package Atividade_Avaliativa01;
import java.util.Scanner;

public class Valor_Calorias {
     public static void main(String[] args){
         int bebida, prato, sobremesa;
         
         Scanner scanner = new Scanner (System.in);
         
         System.out.println("selecione um prato");
         System.out.println("1- Vegetariano");
         System.out.println("2- Peixe");
         System.out.println("3- Frango");
         System.out.println("4- Carne");
         
         System.out.println("Insira o numero do prato: ");
         do  {             
         prato = scanner.nextInt(); 
         if (prato > 4 || prato < 0){
             System.out.println("Valor invalido, selecione um valor correto!!");
         }
         } while (prato > 4 || prato < 0);
         
         System.out.println("selecione uma sobremesas");
         System.out.println("1- Abacaxi");
         System.out.println("2- Sorvete");
         System.out.println("3- Mouse diet");
         System.out.println("4- Mouse chocolate");
         
         System.out.println("selecione o numero da sobremesa: ");
         do  {             
         sobremesa = scanner.nextInt(); 
         if (sobremesa > 4 || sobremesa < 0){
             System.out.println("Valor invalido, selecione um valor correto!!");
         }
         } while (sobremesa > 4 || sobremesa < 0);
         
         System.out.println("selecione uma bebida");
         System.out.println("1- Cha");
         System.out.println("2- Suco de laranja");
         System.out.println("3- Suco de melao");
         System.out.println("4- Refrigerante diet");
         
         System.out.println("selecione o numero de uma bebida: ");
        do  {             
         bebida = scanner.nextInt(); 
         if (bebida > 4 || bebida < 0){
             System.out.println("Valor invalido, selecione um valor correto!!");
         }
         } while (bebida > 4 || bebida < 0);
         
         
         scanner.close();
         
         int caloriasPrato =0 ;
         int caloriasSobremesas = 0;
         int caloriasBebidas = 0 ;
         
             switch (prato) {
             case 1:
                 caloriasPrato = 180;
                 break;
             case 2:
                 caloriasPrato = 230; 
                 break;
             case 3:
                 caloriasPrato = 250;
                 break;
             case 4:    
                 caloriasPrato = 350;
                 break;
             default:
                 caloriasPrato = 0;
         }
             switch (sobremesa) {
             case 1:
                 caloriasSobremesas = 75;
                 break;
             case 2:
                 caloriasSobremesas = 110; 
                 break;
             case 3:
                 caloriasSobremesas = 170;
                 break;
             case 4:    
                 caloriasSobremesas = 200;
                 break;
             default:
                 caloriasSobremesas = 0;
         }
             switch (bebida) {
             case 1:
                 caloriasBebidas = 20;
                 break;
             case 2:
                 caloriasBebidas = 70; 
                 break;
             case 3:
                 caloriasBebidas = 100;
                 break;
             case 4:    
                 caloriasBebidas = 65;
                 break;
             default:
                 caloriasBebidas = 0;
         }
             System.out.println("Total das calorias:" +(caloriasPrato + caloriasSobremesas + caloriasBebidas));
             
     }
    
}