import java.util.Scanner;

public class Exe09 {
    
    public static void main (String []args){

        int num;
        int cont1 = 0;
        int cont2 = 0;

        Scanner scanner = new Scanner (System.in);

            System.out.print("\nDigite um numero inteiro: ");
            num = scanner.nextInt();                    
            
            
        scanner.close();

            System.out.printf("\nOs " + num + " primeiros numeros naturais impares sao: \n");

            while(cont1 >= 0 && cont1 < num){     //contador de impares

                if(cont2 % 2 != 0){      // verificar se o numero é impar

                    System.out.print(cont2 + "  ");     

                    cont1++;       //+1 para o contador pois achou um impar
                    cont2++;       //soma + 1 para verificar o proximo numero
                }

                else{       // já que não é impar, vai para o proximo numero sem subir o contador de impar.
                    cont2++;
                }

            }

            System.out.println("");  //para deixar a vizualização bonita na saída
    }
}
