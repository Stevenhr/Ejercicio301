

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;


public class VentanaPrincipal extends JFrame{
	
	RegistroUsuario registro = new  RegistroUsuario(this);
	PanelAbajo abajo = new PanelAbajo();
	
	public VentanaPrincipal(){
		 super("Ventana JFrame Principal");
		 iniciar();
		 componente();
		 setVisible(true);
		 //setLocationRelativeTo(null);
		// pack();
		// Centrar la ventana
	    setLocationRelativeTo( null );
	    
	}
	public VentanaPrincipal iniciar(){
		
		Dimension dims = new Dimension(700, 650);
		this.setSize(dims);
		this.setPreferredSize(dims);
		/*
		 * Ordenamiento del Jframe
		 * */
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}
	public void componente() {
		 registro = new RegistroUsuario(this);
		 this.add(registro,BorderLayout.EAST);
		 
		 abajo  = new PanelAbajo();
		 add(abajo,BorderLayout.SOUTH);
		 
		
			
			
		
	        
		
	}//componentes
	
	
	
	
	
	
}
