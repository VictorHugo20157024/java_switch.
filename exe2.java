import java.util.Scanner ;

public class exe2 {
	
	public static void main(String[] args) {
		
		int cod, qtd;
		double valor_total = 0;
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Digite o codigo do produto");
			cod = leitor.nextInt();
			
			System.out.println("Digite a quantidade");
			qtd = leitor.nextInt();
		}
		
		switch(cod) {
		
		case 100:
					System.out.println(" Cachorro quente");
					valor_total = qtd * 3.2;
					break;
			
		case 101:
			System.out.println(" Bauru simples");
			valor_total = qtd * 4.3;		
			break;
			
			
		case 102:
			System.out.println(" Bauro com ovo");
			valor_total = qtd * 5.5;
			break;
			
		case 103:
			System.out.println(" Hamburguer");
			valor_total = qtd * 3.2;
			break;
			
		case 104:
			System.out.println(" Cheeseburger");
			valor_total = qtd * 4.3;
			break;
			
		case 105:
			System.out.println(" Refrigerante");
			valor_total = qtd * 4.0;
			break;
			
		}
		
		System.out.println("Valor total:" + valor_total) ; 
		
		}
	
	}
		
		
		
		
		
			
			
		
	
	


