import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class ComputeBMI extends JFrame{

	public static void main(String[] args) {


	JFrame frame = new CBMI();
	frame.setSize(600,400);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}



JTextField jtf3;
JTextField jtf4;
JTextField jtf5;


	public CBMI(){

		JLabel jlbl1 = new JLabel("NAME:");
		add(jlbl1);
		JTextField jtf1 = new JTextField();
		jtf1.setForeground(Color.blue);
		add(jtf1);


		JLabel jlbl2 = new JLabel("AGE:");
		add(jlbl2);
		JTextField jtf2 = new JTextField();
		jtf2.setForeground(Color.blue);
		add(jtf2);

		JLabel jlbl3 = new JLabel("HEIGHT:");
		add(jlbl3);
		jtf3 = new JTextField();
		jtf3.setForeground(Color.blue);
		add(jtf3);

		JLabel jlbl4 = new JLabel("WEIGHT:");
		add(jlbl4);
		jtf4 = new JTextField();
		jtf4.setForeground(Color.blue);
		add(jtf4);

		JButton jbt = new JButton("Click it");
		add(jbt);
		add(jbt,BorderLayout.SOUTH);
		jbt.addActionListener ( new BMIListener () ) ;

       		jtf5 = new JTextField();
		jtf5.setForeground(Color.blue);
		add(jtf5);

		setLayout(new GridLayout(5,2,5,5));

		}





private class BMIListener implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent event){

		    double WEIGHT = Double.parseDouble(jtf3.getText());
	            double HEIGHT = Double.parseDouble(jtf4.getText());
	            double bmi = computeBMI(WEIGHT,  HEIGHT);
	            jtf5.setText(String.valueOf(bmi));

	           if (bmi < 18.5)
	            	jtf5.setText(String.valueOf("BMI =" +bmi+" ----> "+"Underweight"));
	           else if (bmi < 25)
	            	jtf5.setText(String.valueOf("BMI =" +bmi+" ----> "+"Normal"));

	           else if (bmi < 30)
	        	jtf5.setText(String.valueOf("BMI =" +bmi+" ----> "+"Overweight"));

	           else
	        	jtf5.setText(String.valueOf("BMI =" +bmi+" ----> "+"Obese"));

}



public double computeBMI(double WEIGHT, double HEIGHT) {
	        return Math.round((WEIGHT *  0.45359237 / ((HEIGHT* 0.0254) * (HEIGHT* 0.0254)))*100)/100.0;
	    }

	}

}
