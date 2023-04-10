import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 09/04/2023 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

    System.out.print("Quantos kgs de peixe temos? ");
    double pesoPeixe = entrada.nextDouble();

    if(pesoPeixe <= 50){
        System.out.println("Peso adequado!");

    }else{

        double excesso = (pesoPeixe - 50);
        System.out.println("O pesso excedeu o limite em "+ excesso +"Kgs, valor da Multa: " + (excesso * 4) + " Reais.");
    }
    entrada.close();
    }
}