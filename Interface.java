//<I don't know what better>\\
//import java.awt.*;
//import javax.swing.*;
import java.io.File;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Interface extends JFrame {
	//<Why public? Well... Address to Proces class...>\\
	public static JFrame window;
	private static ImageIcon icon;
	private static JButton button;
	public static JTextField enterField;
	private static Color informationColor, textColor;
	private static JLabel city, temperature, weather, information;

	public void Interface() {
		//<Initialization all variables>\\
		
		enterField  	 = new JTextField();
		city             = new JLabel("City: ");
		button      	 = new JButton("process");
		weather          = new JLabel("Weather: ");
		informationColor = Color.decode("#eb1707");
		textColor        = Color.decode("#dbe0d9");
		window      	 = new JFrame("Weather in");
		information 	 = new JLabel("Information");
		icon 			 = new ImageIcon("icon.png");
		temperature      = new JLabel("Temperature: ");

		//<Add all elements on screen>\\
		window.add(city);
		window.add(button);
		window.add(weather);
		window.add(enterField);
		window.add(temperature);
		window.add(information);

		//<Setting for button>\\
		button.setBackground(Color.GRAY);
		button.setBounds(95, 50, 100, 30);
		button.setFont(new Font("Arial", Font.BOLD, 15));

		//<Setting for city>\\
		city.setForeground(textColor);
		city.setBounds(10, 150, 80, 30);
		city.setFont(new Font("Arial", Font.BOLD, 20));

		//<Setting for temperature>\\
		temperature.setForeground(textColor);
		temperature.setBounds(10, 200, 200, 30);
		temperature.setFont(new Font("Arial", Font.BOLD, 20));
		
		//<Setting for weather>\\
		weather.setForeground(textColor);
		weather.setBounds(10, 250, 200, 30);
		weather.setFont(new Font("Arial", Font.BOLD, 20));
		
		//<Setting for information>\\
		information.setBounds(10, 100, 200, 30);
		information.setForeground(informationColor);
		information.setFont(new Font("Arial", Font.BOLD, 20));

		//<(little)Setting for enterField>\\
		enterField.setBounds(10, 15, 280, 30);

		//<Processing and listener for button>\\
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Processing processing = new Processing();
				processing.Processing();
            }
        });

		window.setSize(300, 400);
		window.setResizable(false);
        window.setLayout(null);
        window.setVisible(true);
		window.getContentPane().setBackground(new Color(0x6b6968));
		window.setIconImage(icon.getImage());
	}
}