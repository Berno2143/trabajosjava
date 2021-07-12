package ciclos;
import java.util.Scanner;
public class ciclosjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ciclo while
		 * 
		 * int numero1=1;
		 * int numero2=2;
		 * 
		 * while(numero1 != numero2) {
		 * codigo
		 * codigo
		 * }
		 * 
		 */
		
	/*	
		
        int numero1 = 0;
        int numero2 = 1;
        Scanner numero = new Scanner(System.in);
       
        while (numero1 != numero2) {
        	System.out.println("Introduce un número: ");
        	numero1 = numero.nextInt();
        	System.out.println("Introduce otro número: ");
        	numero2 = numero.nextInt();
        }
	    
        System.out.println(" FIN "); 		
        
        */
        		

// si numero1 es igual a numero2 terminar ejecucion
// si numero2 no es igual a numero1 seguir con numero3 
// si numero3 es igual a numero 1 terminar ejecucion
// si numero3 no es igual a numero1 seguir con numero3
// estoy mal esto es un if 
        
        
        
		
		/*
		 * ciclo do while
		 * do{
		 * codigo
		 * codigo
		 * codigo
		 * } while (condicion)
		 */
		
		
	Scanner numero = new Scanner(System.in);
	
		int numero1 = 0;
        int numero2 = 0;
        
        do {
        	System.out.println("Introduce un número: ");
        	numero1 = numero.nextInt();
        	System.out.println("Introduce otro número: ");
        	numero2 = numero.nextInt();	
		} while(numero1 != numero2);
        numero.close();
        System.out.println(" FIN "); 	
	}

}
