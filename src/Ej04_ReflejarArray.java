import helper.Input;

public class Ej04_ReflejarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAX = 5;
		int arreglo[] = new int[MAX];
		System.out.println("Introduce cinco enteros");
	
		for(int i=0;i<MAX;i++){
			
			System.out.print("Introduce entero número " + (i+1) + " : ");
			arreglo[i]=Input.scannInt();
		}
		
		System.out.println("El arreglo que has introducido es : ");
		
		for(int i=0;i<MAX;i++){
		
			System.out.print(arreglo[i] + " ");
		
		}
		
		System.out.println("\nProcediendo a invertir arreglo");
		
		int contadorfinal = MAX-1;
		int control = 0;
		for(int i=0; i<(MAX/2); i++){
			
			control=arreglo[contadorfinal];
			arreglo[contadorfinal]=arreglo[i];
			arreglo[i]=control;
			contadorfinal--;
			
		}
		
		for(int i=0; i<MAX; i++){
		
			System.out.print(arreglo[i] + " ");
		
		}
	}

}
