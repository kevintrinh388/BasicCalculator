import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorPanel extends JPanel{
    public JLabel label;
    public JLabel labelMem;
    public String number="";
    public char memory=' ';
    public String memoryNumber="";
    public JButton one,two,three,four,five,six,seven,eight,nine,zero,add,subtract,multiply,divide,equal,clear;
	public JButton[] button;

    public CalculatorPanel() {
		number = "";
		label = new JLabel("0");
		labelMem = new JLabel("Memory is: ");
		one = new JButton("1");
		one.addActionListener(new OneListener());
		
		two = new JButton("2");
		two.addActionListener(new TwoListener());

		three = new JButton("3");
		three.addActionListener(new ThreeListener());

		four = new JButton("4");
		four.addActionListener(new FourListener());

		five = new JButton("5");
		five.addActionListener(new FiveListener());

		six = new JButton("6");
		six.addActionListener(new SixListener());

		seven = new JButton("7");
		seven.addActionListener(new SevenListener());

		eight = new JButton("8");
		eight.addActionListener(new EightListener());

		nine = new JButton("9");
		nine.addActionListener(new NineListener());

		zero = new JButton("0");
		zero.addActionListener(new ZeroListener());

		add = new JButton("+");
		add.addActionListener(new AddListener());
		
		subtract = new JButton("-");
		subtract.addActionListener(new SubtractListener());
		
		multiply = new JButton("x");
		multiply.addActionListener(new MultiplyListener());
		
		divide = new JButton("/");
		divide.addActionListener(new DivideListener());
		
		equal = new JButton("=");
		equal.addActionListener(new EqualListener());
		
		clear = new JButton("CLEAR");
		clear.addActionListener(new ClearListener());
		
		button = new JButton[] {one,two,three,four,five,six,seven,eight,nine,zero,add,subtract,multiply,divide,equal,clear};
		
		for(int i=0;i<button.length;i++) {
			this.add(button[i]);
		}
		this.add(label);
		this.add(labelMem);
		this.setBackground(Color.cyan);
	}
	
	
	private class OneListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("1");
			label.setText(number);
		}
		
	}
	private class TwoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("2");
			label.setText(number);
		}
		
	}
	private class ThreeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("3");
			label.setText(number);
		}
		
	}
	private class FourListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("4");
			label.setText(number);
		}
		
	}
	private class FiveListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("5");
			label.setText(number);
		}
		
	}
	private class SixListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("6");
			label.setText(number);
		}
		
	}
	private class SevenListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("7");
			label.setText(number);
		}
		
	}
	private class EightListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("8");
			label.setText(number);
		}
		
	}
	private class NineListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("9");
			label.setText(number);
		}
		
	}
	private class ZeroListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			number=number.concat("0");
			label.setText(number);
		}
		
	}
	private class AddListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            if(memory!=' '){
                label.setText("Another operator has already been chosen. Please select equals or clear.");
            }
            else{
                memory='+';
                memoryNumber=number;
                number="";
                labelMem.setText("Memory is "+memoryNumber);
                label.setText("0");
            }
            
            
		}
		
	}
	private class SubtractListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            if(memory!=' '){
                label.setText("Another operator has already been chosen. Please select equals or clear.");
            }
            else{
                memory='-';
                memoryNumber=number;
                number="";
                labelMem.setText("Memory is "+memoryNumber);
                label.setText("0");
            }
		}
		
	}
	private class MultiplyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            if(memory!=' '){
                label.setText("Another operator has already been chosen. Please select equals or clear.");
            }
            else{
                memory='*';
                memoryNumber=number;
                number="";
                labelMem.setText("Memory is "+memoryNumber);
                label.setText("0");
            }
		}
		
	}
	private class DivideListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(memory!=' '){
                label.setText("Another operator has already been chosen. Please select equals or clear.");
            }
            else{
                memory='/';
                memoryNumber=number;
                number="";
                labelMem.setText("Memory is "+memoryNumber);
                label.setText("0");
            }
        }

	}
		
	
	private class EqualListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            if(memory=='+'){
                double answer=Double.valueOf(memoryNumber)+Double.valueOf(number);
                number=String.valueOf(answer);
            }
            if(memory=='-'){
                double answer=Double.valueOf(memoryNumber)-Double.valueOf(number);
                number=String.valueOf(answer);
            }
            if(memory=='*'){
                double answer=Double.valueOf(memoryNumber)*Double.valueOf(number);
                number=String.valueOf(answer);
            }
            if(memory=='/'){
                double answer=Double.valueOf(memoryNumber)/Double.valueOf(number);
                number=String.valueOf(answer);
            }
            label.setText("Answer is: "+number);
            labelMem.setText("");
            number="";
            memory=' ';
            memoryNumber="";

		}
		
	}
	private class ClearListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            number="";
            memoryNumber="";
            memory=' ';
            label.setText("0");
            labelMem.setText("Memory is ");
		}
    }
}
		
	

