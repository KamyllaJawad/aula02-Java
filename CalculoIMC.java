import java.util.Scanner;

public class CalculoIMC
{
   	public static void main (String[] main)
		{
			double peso;
			double altura;
			double imc;
			
			Scanner entrada = new Scanner(System.in);
			System.out.print ("Peso:	");
			peso = entrada.nextDouble();
			System.out.print ("Altura:	");
			altura = entrada.nextDouble();
			
			entrada.close();
			
			imc = peso / (altura * altura);
			
			System.out.printf("Seu imc eh:	%.2f\n", imc);
			System.out.println("Voce esta:	");
			
			if (imc < 18.5){
				System.out.println("Abaixo do peso");
			}
			else if (imc >= 18.5 && imc < 25){
				System.out.println("Normal");
			}
			else if (imc >= 25 && imc < 30){
				System.out.println("Sobrepeso");
			}
			else{
				System.out.println("Obeso");
			}
			
		}
}