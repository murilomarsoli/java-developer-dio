package estruturasRepeticao;

public class ExemploBreakContinue {
	public static void main(String[] args) {
      
		// BREAK;
		for(int num = 1; num <=5; num++){
			if(num == 3){
				break; // quebra/sai do laço;
	        }
			System.out.println(num);
		}
		
		System.out.println();
		
		// CONTINUE;
		for(int num = 1; num <=5; num++){
			if(num == 3){
				continue; // quebra/sai apenas da iteração em que num == 3 e continua o loop;
			}
			System.out.println(num);
		}
	}
}