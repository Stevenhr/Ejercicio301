import java.awt.*;
import javax.swing.*;
public class RegistroUsuario extends JPanel {

	JTextField campo1,campo2,campo3,campo4,campo5;
	JButton boton;
	GridBagConstraints retriccion;
	Insets inserciones;
	
		public RegistroUsuario() {
			
			setLayout(new GridBagLayout());
			GridBagConstraints restriccion;
			Insets inserciones;
			setBackground(Color.WHITE);
			
			campo1=new JTextField ();
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=0;
			restriccion.fill=GridBagConstraints.BOTH;
			//add(cedula);
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo1,restriccion);
			
			campo2=new JTextField ();
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=1;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo2,restriccion);
			
			campo3=new JTextField ();
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=2;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo3,restriccion);
			
			campo4=new JTextField ();
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=3;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo4,restriccion);
			
			campo5=new JTextField ();
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=4;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo5,restriccion);
			
			boton=new JButton ();
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=5;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(boton,restriccion);
			
			
		}
}
