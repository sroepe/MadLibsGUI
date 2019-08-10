import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MadLibsGUI extends JFrame {
	private JTextField color;
	private JTextField verb;
	private JTextField adjective1;
	private JTextField noun;
	private JTextField animal;
	private JTextField adjective2;
	private JLabel lblOutput;
	

	public void buildStory() {
		String userColor = color.getText();
		String userVerb = verb.getText();
		String userAdjective1 = adjective1.getText();
		String userNoun = noun.getText();
		String userAnimal = animal.getText();
		String userAdjective2 = adjective2.getText();
		lblOutput.setText("The " + userAdjective1 + " " + userColor + " " + userAnimal + " " + userVerb + " over the " + userAdjective2 + " " + userNoun + ".");
		
	}
	
	public MadLibsGUI() {
		setBackground(new Color(102, 255, 255));
		getContentPane().setBackground(new Color(255, 255, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sara's Wacky Mad Libs");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sara's Wacky Mad Libs");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel.setBounds(123, 32, 253, 26);
		getContentPane().add(lblNewLabel);
		
		lblOutput = new JLabel("Enter the following words in order to get a funny story!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblOutput.setBounds(10, 60, 482, 66);
		getContentPane().add(lblOutput);
		
		color = new JTextField();
		color.setBounds(294, 125, 86, 20);
		getContentPane().add(color);
		color.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter a color:");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(109, 127, 127, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblPleaseEnterA = new JLabel("Please enter a past tense verb:");
		lblPleaseEnterA.setHorizontalAlignment(SwingConstants.LEFT);
		lblPleaseEnterA.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblPleaseEnterA.setBounds(109, 152, 176, 14);
		getContentPane().add(lblPleaseEnterA);
		
		verb = new JTextField();
		verb.setColumns(10);
		verb.setBounds(294, 150, 86, 20);
		getContentPane().add(verb);
		
		JLabel lblPleaseEnterAn = new JLabel("Please enter an adjective:");
		lblPleaseEnterAn.setHorizontalAlignment(SwingConstants.LEFT);
		lblPleaseEnterAn.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblPleaseEnterAn.setBounds(109, 177, 176, 14);
		getContentPane().add(lblPleaseEnterAn);
		
		adjective1 = new JTextField();
		adjective1.setColumns(10);
		adjective1.setBounds(294, 175, 86, 20);
		getContentPane().add(adjective1);
		
		JLabel lblPleaseEnterA_1 = new JLabel("Please enter an animal:");
		lblPleaseEnterA_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPleaseEnterA_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblPleaseEnterA_1.setBounds(109, 227, 176, 14);
		getContentPane().add(lblPleaseEnterA_1);
		
		noun = new JTextField();
		noun.setColumns(10);
		noun.setBounds(294, 200, 86, 20);
		getContentPane().add(noun);
		
		JButton btnNewButton = new JButton("Get Story!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buildStory();
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(153, 255, 255));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnNewButton.setBounds(192, 302, 116, 23);
		getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("Please enter a noun:");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		label.setBounds(109, 202, 176, 14);
		getContentPane().add(label);
		
		animal = new JTextField();
		animal.setColumns(10);
		animal.setBounds(294, 225, 86, 20);
		getContentPane().add(animal);
		
		JLabel lblPleaseEnterAnother = new JLabel("Please enter another adjective:");
		lblPleaseEnterAnother.setHorizontalAlignment(SwingConstants.LEFT);
		lblPleaseEnterAnother.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblPleaseEnterAnother.setBounds(109, 252, 176, 14);
		getContentPane().add(lblPleaseEnterAnother);
		
		adjective2 = new JTextField();
		adjective2.setColumns(10);
		adjective2.setBounds(294, 250, 86, 20);
		getContentPane().add(adjective2);
	}
	

	public static void main(String[] args) {
		MadLibsGUI madlib = new MadLibsGUI();
		madlib.setSize(new Dimension(500,400));
		madlib.setVisible(true);

	}
}
