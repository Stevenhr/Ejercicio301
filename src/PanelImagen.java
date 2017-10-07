	import java.awt.*;
	import javax.swing.*;

public class PanelImagen extends JPanel{

	
		
		public PanelImagen() {  //constructor
			
		    setLayout( new BorderLayout( ) );  // organiza en el tipo de orden que quiero ""BorderLayout""
	        JLabel imagen = new JLabel( );   
	        JLabel imagen1 = new JLabel( );//carga una imagen 
	        ImageIcon icono = new ImageIcon( "img/descarga.jpg" );     //icono aloja la imagen   
	        ImageIcon icono1 = new ImageIcon( "img/abajo.png" );
	        
	        imagen.setIcon( icono );
	        imagen1.setIcon( icono1 );//asignar icono 
	        //Define el icono que mostrará este componente.
	        
	        
	        imagen.setHorizontalAlignment( JLabel.LEFT );   //lo ubica
	        imagen1.setHorizontalAlignment( JLabel.RIGHT );
	        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
	        
	        
	        add( imagen, BorderLayout.WEST );
	        add( imagen1, BorderLayout.EAST );
	        //ubicacion de mi imagen dentro del panel
	        
	        
	        setBackground( Color.WHITE );
		}
}
