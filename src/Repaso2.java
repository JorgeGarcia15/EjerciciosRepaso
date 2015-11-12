import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Repaso2 extends GraphicsProgram {

	
	GRect rectangulo;
	
	
	//Declaro otra variable de instancia que guardara el punto X de la
	//pantala en que empezara a pintarse el rectangulo
	int distanciaX;
	
	public void init(){
		
		setSize(800,600);
		
		
		rectangulo = new GRect(120, 80);
		add(rectangulo);
	}
	public void run(){
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX-rectangulo.getWidth()/2, 0);
		
	}
	
}
