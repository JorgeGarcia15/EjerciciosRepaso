import acm.graphics.*;
import acm.program.*;


public class EjerciciosBasicoJava extends ConsoleProgram {

	public void run(){
		
		println(fiestaArdillas (30,	false));
		println(fiestaArdillas (50,	false));
		println(fiestaArdillas (70,	true));
		
		println(multa (60,	false));
		println(multa (65,	false));
		println(multa (65,	true));
		
	}
	
	public boolean fiestaArdillas(int Bellotas, boolean Festivo){
	
		if((Bellotas >= 40 && Bellotas <= 60) && !Festivo){
			return true;
		}
		
		if(Bellotas > 0 && Festivo){
			return true;
		}
		return false;
	}
	
	public int multa (int velocidad, boolean cumpleaños){
		
		if(cumpleaños){
			if(velocidad <= 65){
				return 0;
			}
			if(velocidad <= 85 && velocidad >= 66){
				return 1;
			}
			if(velocidad <= 86){
				return 2;
			}
		}
		
		if(!cumpleaños){
			if(velocidad <= 60){
				return 0;
			}
			if(velocidad <= 80 && velocidad >= 61){
				return 1;
			}
			if(velocidad >= 81){
				return 2;
			}
		}
		return 10;
		
	}
	
	
}
