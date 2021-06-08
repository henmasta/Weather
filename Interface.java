//I don't know what better
//import javax.swing.*;
//import java.awt.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.io.File;
import java.io.IOException;

class Interface extends JFrame {
	public static JFrame window;
	private static JButton button;
	public static JTextField enterField;
	private static JLabel city, temperature, weather, information;
	private static Color informationColor, textColor;

	public void Interface() {
		window = new JFrame("Weather in");
		enterField = new JTextField();
		button = new JButton("process");
		
		information = new JLabel("Information");
		city = new JLabel("City: ");
		temperature = new JLabel("Temperature: ");
		weather = new JLabel("Weather: ");
		informationColor = Color.decode("#eb1707");
		textColor = Color.decode("#dbe0d9");

		window.add(enterField);
		window.add(button);

		button.setBounds(95, 50, 100, 30);
		button.setFont(new Font("Arial", Font.BOLD, 15));
		//button.setFocusable(true);
		button.setBackground(Color.GRAY);

		city.setBounds(10, 150, 80, 30);
		city.setFont(new Font("Arial", Font.BOLD, 20));
		city.setForeground(textColor);

		temperature.setBounds(10, 200, 200, 30);
		temperature.setFont(new Font("Arial", Font.BOLD, 20));
		temperature.setForeground(textColor);

		weather.setBounds(10, 250, 200, 30);
		weather.setFont(new Font("Arial", Font.BOLD, 20));
		weather.setForeground(textColor);

		information.setBounds(10, 100, 200, 30);
		information.setFont(new Font("Arial", Font.BOLD, 20));
		information.setForeground(informationColor);

		window.add(city);
		window.add(temperature);
		window.add(weather);
		window.add(information);

		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Process process = new Process();
				process.Process();
            }
        });

		enterField.setBounds(10, 15, 280, 30);


		window.setSize(300, 400);
		window.setResizable(false);
        window.setLayout(null);
        window.setVisible(true);
		window.getContentPane().setBackground(new Color(0x6b6968));
	}
}