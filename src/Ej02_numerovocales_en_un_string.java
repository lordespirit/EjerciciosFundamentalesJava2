
public class Ej02_numerovocales_en_un_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length==0){
			System.out.println("Introduce un parámetro!");
		}else{
		
		
		String palabra;
		palabra = String.valueOf(args[0]);
		char Caracteres[] = palabra.toCharArray();
		int a=0,e=0,i=0,o=0,u=0;
		
			for(int x=0;x<Caracteres.length;x++){
				
				switch(Caracteres[x]){
				case 'a':
				case 'A':
					a++;
					break;
				case 'e':
				case 'E':
					e++;
					break;
				case 'i':
				case 'I':
					i++;
					break;
				case 'o':
				case 'O':
					o++;
					break;					
				case 'u':
				case 'U':
					u++;
					break;
				
				}
		
			}	
			
			System.out.println("Total Vocales : " + (a+e+i+o+u));
			System.out.println("a: " + a);
			System.out.println("e: " + e);
			System.out.println("i: " + i);
			System.out.println("o: " + o);
			System.out.println("u: " + u);
		}
		
	}

}
