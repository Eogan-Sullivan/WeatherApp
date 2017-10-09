import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inputWeatherWindow extends JFrame {
	

	private JPanel contentPane;
	private JTextField txtEnterTowncityHere;
	private JTextField txtPercipertation;
	private JTextField txtTemperature;
	private JTextField numTemp;
	private JTextField numPercip;
	private JTextField txtSky;
	private JTextField txtSkes;
	private JButton btnBck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inputWeatherWindow frame = new inputWeatherWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public inputWeatherWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		txtEnterTowncityHere = new JTextField();
		txtEnterTowncityHere.setText("Enter Town/City Here");
		txtEnterTowncityHere.setBounds(20, 11, 182, 20);
		contentPane.add(txtEnterTowncityHere);
		txtEnterTowncityHere.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(106, 227, 96, 23);
		contentPane.add(btnSubmit);
		
		txtPercipertation = new JTextField();
		txtPercipertation.setBounds(20, 61, 86, 20);
		txtPercipertation.setEditable(false);
		txtPercipertation.setText("Percipitation");
		contentPane.add(txtPercipertation);
		txtPercipertation.setColumns(10);
		
		txtTemperature = new JTextField();
		txtTemperature.setText("Temperature:");
		txtTemperature.setEditable(false);
		txtTemperature.setColumns(10);
		txtTemperature.setBounds(20, 127, 86, 20);
		contentPane.add(txtTemperature);
		
		numTemp = new JTextField();
		numTemp.setText("0");
		numTemp.setColumns(10);
		numTemp.setBounds(116, 127, 86, 20);
		contentPane.add(numTemp);
		
		numPercip = new JTextField();
		numPercip.setText("0");
		numPercip.setColumns(10);
		numPercip.setBounds(116, 61, 86, 20);
		contentPane.add(numPercip);
		
		txtSky = new JTextField();
		txtSky.setText("Skies");
		txtSky.setEditable(false);
		txtSky.setColumns(10);
		txtSky.setBounds(20, 188, 86, 20);
		contentPane.add(txtSky);
		
		txtSkes = new JTextField();
		txtSkes.setText("0");
		txtSkes.setColumns(10);
		txtSkes.setBounds(116, 188, 86, 20);
		contentPane.add(txtSkes);
		
		btnBck = new JButton("Back");
		btnBck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();		
			WeatherApp.main(null);
			
			}
		});
		btnBck.setBounds(20, 227, 63, 23);
		contentPane.add(btnBck);
	}
}
