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


public class Repaso10 extends GraphicsProgram {

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
			
			double disctanciaAlCentroDelRectangulo = evento.getY() - rectangulo.getY();
			double disctanciaAlCentroDelRectangulo2 = evento.getX() - rectangulo.getX();
			
		if (disctanciaAlCentroDelRectangulo > rectangulo.getHeight()/2 && disctanciaAlCentroDelRectangulo2 > rectangulo.getWidth()/2){	
			rectangulo.move(10, 10);
		}
		
		if (disctanciaAlCentroDelRectangulo < rectangulo.getHeight()/2 && disctanciaAlCentroDelRectangulo2 > rectangulo.getWidth()/2){	
			rectangulo.move(10, -10);
		}
		
		if (disctanciaAlCentroDelRectangulo < rectangulo.getHeight()/2 && disctanciaAlCentroDelRectangulo2 < rectangulo.getWidth()/2){	
			rectangulo.move(-10, -10);
		}

		if (disctanciaAlCentroDelRectangulo > rectangulo.getHeight()/2 && disctanciaAlCentroDelRectangulo2 < rectangulo.getWidth()/2){	
			rectangulo.move(-10, 10);
		}
	}
}


}
