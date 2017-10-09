import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WeatherApp {

	private JFrame startUpFrame;
	private JFrame viewFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		startWeatherApp();
	}

	/**
	 * Create the application.
	 */
	public WeatherApp() {
		initializeWeatherApp();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeWeatherApp() {
		startUpFrame = new JFrame();
		startUpFrame.setBounds(100, 100, 515, 333);
		startUpFrame.setName("WeatherApp");
		startUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startUpFrame.getContentPane().setLayout(null);
		
		
		//View Weather Options
		JButton btnViewWeather = new JButton("View Weather");
		btnViewWeather.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				startUpFrame.dispose();
				viewWeatherWindow.main(null);
				
							
			}

		});
		
		//sets up and adds the v33, 67ton
		btnViewWeather.setBounds(60, 106, 126, 23);
		startUpFrame.getContentPane().add(btnViewWeather);
		
		//setup InputWeather
		JButton btnInputWeather = new JButton("Input Weather");
		btnInputWeather.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startUpFrame.dispose();
				inputWeatherWindow.main(null);
				
			}
		});
		
		
		
		btnInputWeather.setBounds(272, 106, 126, 23);
		
		//adds input weather button
		startUpFrame.getContentPane().add(btnInputWeather);
	}
	
	
//builds frame
	public static void startWeatherApp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				WeatherApp window = new WeatherApp();
				window.startUpFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
