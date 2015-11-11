/*
 * Repaso1: Pinta un rectangulo en la esquina superior izquierda
 * 
 */
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class Repaso1 extends GraphicsProgram{

	// Declaro una variable de instacia para guaradar el rectangulo
	
	GRect rectangulo;

	//recuerdo que el init se ejecuta siempre antes que el run
	public void init(){
		setSize(800,600);
		
		rectangulo = new GRect(120,80);
		
	}
	public void run(){
		
		add(rectangulo,0,0);
		rectangulo.setFilled(true);
		
	}
}
