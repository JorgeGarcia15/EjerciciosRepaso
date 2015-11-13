import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class Repaso5 extends GraphicsProgram {

	GRect rectangulo;
	
	RandomGenerator aleatorio = new RandomGenerator();
	
	public void init(){
		
		setSize(800,600);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del raton
		addMouseListeners();
		
		
	}
	
	public void run(){
		
		add(	rectangulo, 
				getWidth()/2 - rectangulo.getWidth()/2, 
				getHeight()/2 - rectangulo.getHeight()/2 
				);
			
		
	}
	
	//a�ado el metodo quee scucha el evento del clic del raton
	
	public void mouseClicked (MouseEvent evento){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		
	}
	
		
}