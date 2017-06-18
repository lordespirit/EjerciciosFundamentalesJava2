
public class Ej03_INPUTdigitos_OUTPUTnumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length==0){
			
			System.out.println("No has introducido ningun argumento!");
		
		}else{
			boolean error = false;
			int max = args.length;
			System.out.print("El número es ");
			for(int x=0;x<max;x++){
				
				switch(args[x]){
					
					case "uno":
					case "UNO":
						System.out.print("1");
						break;
					case "dos":
					case "DOS":
						System.out.print("2");
						break;
					case "tres":
					case "TRES":
						System.out.print("3");
						break;
					case "cuatro":
					case "CUATRO":
						System.out.print("4");
						break;
					case "cinco":
					case "CINCO":
						System.out.print("5");
						break;
					case "seis":
					case "SEIS":
						System.out.print("6");
						break;
					case "siete":
					case "SIETE":
						System.out.print("7");
						break;
					case "ocho":
					case "OCHO":
						System.out.print("8");
						break;
					case "nueve":
					case "NUEVE":
						System.out.print("9");
						break;
					case "cero":
					case "CERO":
						System.out.print("0");
						break;			
					default:
						error = true;
						break;
				}
				
			}
			
			if(error){
				
				System.out.println("\nSe ha ignorado algún parámetro no válido");
				
			}
			
		}
		
	}

}
