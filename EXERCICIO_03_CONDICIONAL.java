package aula2_CONDICIONAL;

import java.util.Scanner;

public class EXERCICIO_03_CONDICIONAL {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		int idade;
		System.out.println("Bem vindo ao clube\nInforme sua idade: ");
		idade= entrada.nextInt();
		
		if(idade>=10 && idade<=14) 
		{
			System.out.println("Faixa et�ria:infantil\nUso de piscina somente com autoriza��o do respons�vel");
		}
		else if (idade>=15 && idade <=17)
		{
			System.out.println("Faixa et�ria:juvenil\nAcesso �s piscinas autorizado");
		}
		else if (idade>=18 && idade <=25)
		{
			System.out.println("Faixa et�ria:Adulto\nAcesso �s piscinas autorizado\nN�o consuma �lcool perto das piscina,somente na nossa pra�a de alimenta��o ");
		}
		else if(idade<0) 
		{
			System.out.println("Erro!!!N�o existe idade negativa");
		}
		else if(idade<10 && idade>0) 
		{
			System.out.println("Faixa et�ria: sub infantil\nEntrada somente com um adulto de acompanhante");
		}
		else if(idade>25) 
		{
			System.out.println("Faixa et�ria: Adulto-cliente s�nior");
		}
		entrada.close();
	}

}
