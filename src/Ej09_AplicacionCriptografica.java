public class Ej09_AplicacionCriptografica {

	public static void main(String[] args) {

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
		
		if(args.length!=5){
			System.out.println("Argumentos incorrectos");
		}else{
			boolean isType = false,isNumber = false,isWord = false;
			Integer number = null;
			String word = null;
			char type = 0;
			for(int i=0;i<args.length;i++){
				
				if(args[i].equals("-e")||args[i].equals("-d")){
					isType = true;
					if(args[i].equals("-e"))
						type = 'e';
					else
						type = 'd';
				}
				if(args[i].equals("-n")){
					isNumber = true;
					number = Integer.valueOf(args[i+1]);
				}
				if(args[i].equals("-m")){
					isWord = true;
					word = args[i+1].toUpperCase();	
				}
			}
			
			if(isType&&isWord&&isNumber){
				
				char[] oldWord = word.toCharArray();
				//char[] newWord = new char[word.length()];

				if(type=='e'){
					for(char ch: oldWord){
						int alfabetIndex  = new String(alphabet).indexOf(ch);
						int control = number;
						while(control>0){
							alfabetIndex++;
							if(alfabetIndex==26){
								alfabetIndex = 0;
							}
							control--;
						}
						System.out.print(alphabet[alfabetIndex]);
					}	
				}else{
					for(char ch: oldWord){
						int alfabetIndex  = new String(alphabet).indexOf(ch);
						int control = number;
						while(control>0){
							alfabetIndex--;
							if(alfabetIndex<0){
								alfabetIndex = 25;
							}
							control--;
						}
						System.out.print(alphabet[alfabetIndex]);
					}
				}
								
			}else{
				
				System.out.println("Parámetros mal introducidos");
				
			}
		
		}


	}

}
