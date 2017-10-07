

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelAbajo extends JPanel  {
    
	
	
	public PanelAbajo( )
    {
		  setLayout( new BorderLayout( ) );
	        JLabel imagen = new JLabel( );
	        ImageIcon icono = new ImageIcon( "img/Blue.png" );
	      
	        JLabel imagen2 = new JLabel( );
	        ImageIcon icono2 = new ImageIcon( "img/orange.png" );
	        
	        JLabel imagen3 = new JLabel( );
	        ImageIcon icono3 = new ImageIcon( "img/Red.png" );
	        
	        
	        imagen.setIcon( icono );
	        imagen2.setIcon( icono2 );
	        imagen3.setIcon( icono3 );
	        //Define el icono que mostrará este componente.
	        imagen.setHorizontalAlignment( JLabel.CENTER );
	        //imagen2.setHorizontalAlignment( JLabel.WEST );
	        //imagen3.setHorizontalAlignment( JLabel.EAST );
	        
	        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
	        
	        add( imagen, BorderLayout.CENTER );
	        add( imagen2, BorderLayout.WEST );
	        add( imagen3, BorderLayout.EAST );
	        //ubicacion de mi imagen dentro del panel
	        
	        setBackground( Color.DARK_GRAY );
	}
	
}

