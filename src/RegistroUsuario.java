import java.awt.*;
import javax.swing.*;
public class RegistroUsuario extends JPanel {

	JTextField campo1,campo2,campo3,campo4,campo5;
	JButton boton;
	JLabel etiqueta;
	GridBagConstraints retriccion;
	Insets inserciones;
	VentanaPrincipal v;
	
		public RegistroUsuario(VentanaPrincipal _v) {
			this.v = _v;
			
			setLayout(new GridBagLayout());
			GridBagConstraints restriccion;
			Insets inserciones;
			setBackground(Color.WHITE);
			
			etiqueta =new JLabel("Registro persona");
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=0;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(etiqueta,restriccion);
			
			campo1=new JTextField ("nombre");
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=1;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo1,restriccion);
			
			campo2=new JTextField ("apellido");
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=2;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo2,restriccion);
			
			campo3=new JTextField ("cedula");
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=3;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo3,restriccion);
			
			campo4=new JTextField ("edad");
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=4;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo4,restriccion);
			
			campo5=new JTextField ("telefono");
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=5;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(campo5,restriccion);
			
			boton=new JButton ("Registrar");
			restriccion=new GridBagConstraints();
			restriccion.gridx=0;
			restriccion.gridy=6;
			restriccion.fill=GridBagConstraints.BOTH;
			inserciones=new Insets(10,10,10,10);
			restriccion.insets=inserciones;
			add(boton,restriccion);
			
			
		}
}
