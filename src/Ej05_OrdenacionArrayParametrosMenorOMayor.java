
public class Ej05_OrdenacionArrayParametrosMenorOMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length==0){
			
			System.out.println("No has introducido argumentos");
			
		}else if( !((args[0].equals("<")) || (args[0].equals(">"))) ){
			
			System.out.println("El primer argumento debe ser '>' o '<' para indicar forma de ordenación");
			
		}else{
			
			if(args.length==2){
				
				System.out.println("Para la ordenación, mínimo dos enteros");
				
			}else{

				int arreglo[] = new int[args.length-1];
				int control=0;
				
				for(int i=0;i<args.length-1;i++){
					
					arreglo[i]=Integer.valueOf(args[i+1]);
					
				}
				
				System.out.println("Has introducido el siguiente array: ");
				
				for(int i=0;i<args.length-1;i++){
					
					System.out.print(arreglo[i] + " ");
					
				}
				
				if(args[0].equals("<")){
					
					System.out.println("\nEscogiste ordenar de menor a mayor");
					
					for(int i=1 ; i<arreglo.length ; i++){
						
						if(arreglo[i] < arreglo[i-1]){
							control=arreglo[i];
							arreglo[i]=arreglo[i-1];
							arreglo[i-1]=control;
							i=0;
						}
						
					}
					
					
				}else{
					
					System.out.println("\nEscogiste ordenar de mayor a menor");
					
					for(int i=1 ; i<arreglo.length ; i++){
						
						if(arreglo[i] > arreglo[i-1]){
							control=arreglo[i];
							arreglo[i]=arreglo[i-1];
							arreglo[i-1]=control;
							i=0;
						}
						
					}
					
					
				}
				
				System.out.print("Array ordenado: ");
				
				for(int i=0; i< arreglo.length;i++){
					
					System.out.print(arreglo[i] + " ");
					
				}
				
			}
			
		}
		
	}

}
