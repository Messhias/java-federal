import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        int n1, n2, n3;
	        int media, i, cStudinput = 0;
	        
	        for(i = 0; i < 3; i++){
	            
	            cStudinput++;
	            // receive 1� 
	            System.out.println("Aluno " + cStudinput + ", digite sua 1� nota");
	            n1 = input.nextInt();
	            
	            // receive a 2�
	            System.out.println("Aluno " + cStudinput + ", digite sua 2� nota");
	            n2 = input.nextInt();
	            
	            // recebe a 3� nota
	            System.out.println("Aluno " + cStudinput + ", digite sua 3� nota");
	            n3 = input.nextInt();
	            
	            // calcula a m�dia
	            media = (n1 + n2 + n3) / 3;
	            System.out.println("A m�dia do aluno " + cStudinput + " � " + media);
	            
	            // mostra a nota do aluno
	            if( (media >= 0) && (media <4) ){
	                System.out.println("Nota E");
	            } else if(media < 5){
	                System.out.println("Nota D");
	            } else if(media < 7){
	                System.out.println("Nota C");
	            } else if(media < 8){
	                System.out.println("Nota B");
	            } else if(media <= 10){
	                System.out.println("Nota A");
	            }
	        }
	}

}
