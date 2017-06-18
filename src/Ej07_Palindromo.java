import helper.Input;

public class Ej07_Palindromo {

	public static void main(String[] args) {
		
		System.out.println("Introduce frase para identificar si es palíndromo o no : ");
		String  frase = Input.scannLine().toLowerCase();
		
		char[] fraseChar = frase.toCharArray();
		boolean diferente = false;
		for(int i=0,z=fraseChar.length-1;i<fraseChar.length;i++,z--){
			
			if(fraseChar[i]==' '){
				i++;
			}
			if(fraseChar[z]==' '){
				z--;
			}
			
			if(fraseChar[i]!=fraseChar[z]){
				diferente = true;
			}
			
		}
		
		if(diferente){
			System.out.println("La frase no es palíndroma");
		}else{
			System.out.println("La frase es palíndroma");
		}
		

	}

}
