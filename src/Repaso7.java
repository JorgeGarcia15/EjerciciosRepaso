/*
 * Repaso 6
 * Cuando se hace click en un rectangulo central, genera un 
 * nuevo rectangulo aleatorio
 * 
 */



import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class Repaso7 extends GraphicsProgram {

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

		if( getElementAt(evento.getX(), evento.getY())== rectangulo){	
			
			GRect auxiliar =  new GRect(aleatorio.nextInt(120), aleatorio.nextInt(80));
			auxiliar.setFilled(true);
			auxiliar.setFillColor(aleatorio.nextColor());
			add(auxiliar, aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));

		}
	}


}
