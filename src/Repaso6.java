/*
 * Repaso 6
 * Es igual que el 5 pero solo
 * cambia si se pulsa dentro del rectangulo
 * 
 */



import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class Repaso6 extends GraphicsProgram {

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
	
	//añado el metodo quee scucha el evento del clic del raton
	
	public void mouseClicked (MouseEvent evento){
		//evento.getX
		//La funcion se llama getElement
	if( getElementAt(evento.getX(), evento.getY())== rectangulo){	
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
	}
	}
	
		
}
