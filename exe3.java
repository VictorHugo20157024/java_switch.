import java.util.Scanner;

public class exe3 {
	
	public static void main(String[] args) {
		
		
		int cod;
		
		System.out.println("Opçao mensagem\r\n" +
		                  "1 Executa a rotina de inclusao do aluno\r\n" +
		                  "2 Executa a rotina de alteraçao do aluno\r\n" +
		                  "3 Executa a rotina de exclusao do aluno\r\n" +
		                  "4 Executa a rotina de consulta do aluno");
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Escolha uma opcao");
			cod = leitor.nextInt();
		}
		
		switch(cod) {
		
		case 1:
		System.out.println ("Executa a rotina de inclusao do aluno");
		break;
		
		case 2:
			System.out.println ("Executa a rotina de alteracao do aluno");
			break;
			
		case 3:
			System.out.println ("Executa a rotina de exclusao do aluno");
			break;
			
		case 4:
			System.out.println ("Executa a rotina de consulta do aluno");
			break;
		
		
		}
	}


}
