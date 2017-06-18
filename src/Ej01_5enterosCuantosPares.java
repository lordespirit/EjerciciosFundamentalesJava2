import helper.Input;

public class Ej01_5enterosCuantosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escriba 5 enteros");
		
		final int max = 5;
		int array_enteros[] = new int[max] ;
		
		for(int x=0;x<max;x++){
			
			System.out.print("Entero número " + (x+1) + " : ");
			array_enteros[x]=Input.scannInt();
			
		}
		boolean existe = false;
		for(int x=0;x<max;x++){
			
			if(array_enteros[x]%2==0){
			System.out.print(array_enteros[x] + " ");
			existe = true;
			}
		}
		
		if(!existe){
			System.out.println("No hay ningún par");
		}
		
	}

}
