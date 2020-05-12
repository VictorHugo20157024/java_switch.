import java.util.Scanner; 

public class exe4 {
	
	public static void main(String[] args) {
		
		int opc;
		double n1, n2, ma, mp;
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Digite a opcao da media que deseja ( 1- para media aritmetica ou 2 - para media ponderada)  ");
			opc = leitor.nextInt();
			
			double n3;
			switch(opc) {
			
			case 1 :
				
 System.out.println("Voce escolhey o opcao media aritmetica");
 
 System.out.println("digite a primeira nota");
 n1 = leitor.nextDouble();
 
 System.out.println("Digite a segunda nota");
 n2 = leitor.nextDouble();
 
 System.out.println("Digite a terceira nota");
 n3 = leitor.nextDouble();
 
 ma = (n1+n2+n3)/3;
 System.out.println("A media foi: " +ma);
 
 
 break;
 
 
			case 2 :
				
				 System.out.println("Voce escolhey o opcao media ponderada");
				 
				 System.out.println("digite a primeira nota");
				 n1 = leitor.nextDouble();
				 
				 System.out.println("Digite a segunda nota");
				 n2 = leitor.nextDouble();
				 
				 System.out.println("Digite a terceira nota");
				 n3 = leitor.nextDouble();
				 
				 mp = ((n1*3)+ (n2*3)+ (n3*4))/10;;
				 
				 System.out.println("A media foi: " +mp);
				 
				 break ;
				 
 
 }
		}
		
		
		
	}

}
