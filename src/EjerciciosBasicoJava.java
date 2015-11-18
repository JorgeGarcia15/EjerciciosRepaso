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

		println(menorPor10 (1,	7,	11));
		println(menorPor10 (1,	7,	10));
		println(menorPor10 (11,	1,	7));

		println(digitoIgual (12,	23));
		println(digitoIgual (12,	43));
		println(digitoIgual (12,	44)	);

		println(multiploMultiple (3));
		println(multiploMultiple (10));
		println(multiploMultiple (15));

		println(menos20	(18));
		println(menos20	(19));
		println(menos20	(20));		

		println(loteria (2,	2,	2));
		println(loteria (2,	2,	1));
		println(loteria (0,	0,	0));
		
		println(withoutDoubles	(2,	3,	true));
		println(withoutDoubles	(3,	3,	true));
						println(withoutDoubles	(3,	3,	false));
								println(withoutDoubles	(6,	6,	true));	
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
		if(numero1-numero2==10 ||numero1-numero3==10 ||numero2-numero3==10 ||numero3-numero2==10 ||numero2-numero1==10 ||numero3-numero1==10){
			return true;
		}
		return false;

	}

	public boolean digitoIgual (int numeroA, int numeroB){

		if( (100/numeroA)==(100%numeroB) || (100/numeroB)==(100%numeroA) || (100/numeroB)==(100/numeroA) || (100%numeroB)==(100%numeroA)){

			return true;

		}
		return false;
	}

	public boolean multiploMultiple (int numero1){
		if (numero1%3==numero1%5 ){
			return false;
		}
		if (numero1%3==0 || numero1%5==0 ){
			return true;
		}
		return false;
	}

	public boolean menos20 (int numero){
		if (numero%20==19 || numero%20==18){
			return true;

		}
		return false;

	}

	public int loteria (int a, int b, int c){
		if ( a==2 && b==2 && c==2){
			return 10;
		}

		if (a==b && b==c && a==c){
			return 5;
		}

		if (a!=b && a!=c){
			return 1;
		}

		return 0;
	}
	
	public int withoutDoubles (int a, int b, boolean noDoubles ){
		if (noDoubles){
			if( a!=b){
				return a+b;
			}
			if( a==b){
				return (a+b)+1;
			}
			
		}
		
		if (!noDoubles){
			return a+b;
		}
		
		return 0;
		
		
	}
	

}
