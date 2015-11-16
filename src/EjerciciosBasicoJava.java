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
		
		println(muyVanidoso (22));
		println(muyVanidoso (23));
		println(muyVanidoso (24));
		
		println(contesta (false, false, false));
		println(contesta (false, false, true));
		println(contesta (true,	false, false));
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
	
	public boolean muyVanidoso (int Valor){
		if(Valor%11==0 || Valor%11==1){
			return true;
			
		}
		return false;
	}
	
	public boolean contesta (boolean matinal, boolean madre, boolean dormido){
		
		if(dormido){
			
			return false;			
		}
		if( matinal && !madre){
			
			return false;			
		}
		if( matinal && madre){
			
			return true;			
		}
		
		return true;	
						
		
		
	}
	
	public boolean menorPor10 (int numero1, int numero2, int numero3){
		if(numero1-numero2==10 ||numero1-numero3==10 ||numero2-numero3==10){
			return true;
		}
		return false;
		
	}
	
	
}
