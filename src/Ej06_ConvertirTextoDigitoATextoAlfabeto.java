import helper.Input;

public class Ej06_ConvertirTextoDigitoATextoAlfabeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce en un solo texto cifras. Ejemplo: 123456");
		System.out.print("Número : ");
		
		int x = Input.scannInt();
		
		System.out.println("Has introducido el número : " + x);
		
		int valor_usuario = x;
		int length = 0;
		while(valor_usuario > 0){
			
			length++;
			valor_usuario = valor_usuario / 10;
		}
		
		System.out.println("Total de digitos: " + length);
		
		valor_usuario = x;
		int arreglo[] = new int[length];
		
		while(valor_usuario > 0){

			arreglo[length-1] = valor_usuario %10;
			valor_usuario = valor_usuario / 10;
			length--;
			
		}
		
		System.out.println("Mostrando el array");
		
		for(int i=0; i<arreglo.length;i++){
			System.out.print(arreglo[i] + " ");
		}
		
	}

}
