	import java.awt.*;
	import javax.swing.*;

public class PanelImagen extends JPanel{

	
		
		public PanelImagen() {  //constructor
			
			    setLayout( new BorderLayout( ) );  // organiza en el tipo de orden que quiero ""BorderLayout""
		        JLabel imagen = new JLabel( );   
		        ImageIcon icono = new ImageIcon( "img/descarga.jpg" );     //icono aloja la imagen   
		        
		        imagen.setIcon( icono );
		        //Define el icono que mostrará este componente.
		        
		        
		        imagen.setHorizontalAlignment( JLabel.NORTH );   //lo ubica
		        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
		        
		        
		        add( imagen, BorderLayout.NORTH);
		        //ubicacion de mi imagen dentro del panel
		        
		        
		        setBackground( Color.RED );
		        
		        setLayout( new BorderLayout( ) );  // organiza en el tipo de orden que quiero ""BorderLayout""
		        JLabel imagen1 = new JLabel( );   
		        ImageIcon icono1 = new ImageIcon( "img/abajo.png" );     //icono aloja la imagen   
		        
		        imagen.setIcon( icono1 );
		        //Define el icono que mostrará este componente.
		        
		        
		        imagen.setHorizontalAlignment( JLabel.SOUTH );   //lo ubica
		        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
		        
		        
		        add( imagen1, BorderLayout.SOUTH);
		        //ubicacion de mi imagen dentro del panel
		        
		        
		        setBackground( Color.WHITE );
		}
}
