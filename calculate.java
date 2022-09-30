import java.util.*;
import java.lang.String.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class calculate extends JFrame{
			
		private static JFrame  F1 = new JFrame("Calculate ACS108129何孟謙");	
		
		private static JButton BC = new JButton("C");
		private static JButton BB = new JButton("Del");
		private static JButton BE = new JButton("=");
		private static JButton Bpow = new JButton("^");
		private static JButton Bdot = new JButton("( )");
		private static JButton Bmod = new JButton("%");
		
		private static JButton B0 = new JButton("0");	// 0
		private static JButton B1 = new JButton("1");
		private static JButton B2 = new JButton("2");
		private static JButton B3 = new JButton("3");
		private static JButton B4 = new JButton("4");
		private static JButton B5 = new JButton("5");
		private static JButton B6 = new JButton("6");
		private static JButton B7 = new JButton("7");
		private static JButton B8 = new JButton("8");
		private static JButton B9 = new JButton("9");	// 9
		
		private static JButton Bp = new JButton("+");	// +
		private static JButton Bs = new JButton("-");	// -
		private static JButton Bm = new JButton("*");	// *
		private static JButton Bd = new JButton("/");	// /
		
		private static JLabel text = new JLabel("0");  	// 輸出框
		
		private static int index = 0;
		private static int ans = 0;
		private static boolean bra = false;
		
//Main		
	public static void main(String[] args){
			exe();
	}

//Run
	private static void exe(){
		
		BC.setBounds(210,100,75,40);	//210,100,75,40
			BC.setFont(new Font("Arial", Font.BOLD, 25));				
				BC.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						index = 0;
						text.setText("0");} 
			}); 
		B0.setBounds(130,300,75,40);
			B0.setFont(new Font("Arial", Font.BOLD, 25));					
				B0.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "0";
							index++;}
						else{
							input = input + "0";}
						text.setText(input);} 
			}); 
		BE.setBounds(210,300,75,40);
			BE.setFont(new Font("Arial", Font.BOLD, 25));				
				BE.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){
						
							String input = text.getText()+"=";
					while(input.indexOf("(") != -1){		
						if(input.indexOf("(") != -1){
							String tempstring = input.substring((input.indexOf("(")+1) , input.indexOf(")"));
							
							int tempans =toAnswer(tempstring+"=");
							String temps = Integer.toString(tempans);
							tempstring = input.substring(input.indexOf("(") ,( input.indexOf(")")+1));
							input = input.replace(tempstring,temps);
						}	
					}
						ans = toAnswer(input);
						text.setText(Integer.toString(ans));
						index = 0;}
			}); 
			
		
		B1.setBounds(50,250,75,40);
			B1.setFont(new Font("Arial", Font.BOLD, 25));				
				B1.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "1";
							index++;}
						else{
							input = input + "1";}
						text.setText(input);} 
			}); 
		B2.setBounds(130,250,75,40);
			B2.setFont(new Font("Arial", Font.BOLD, 25));				
				B2.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "2";
							index++;}
						else{
							input = input + "2";}
						text.setText(input);} 
			}); 
		B3.setBounds(210,250,75,40);
			B3.setFont(new Font("Arial", Font.BOLD, 25));				
				B3.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "3";
							index++;}
						else{
							input = input + "3";}
						text.setText(input);} 
			}); 
		
		B4.setBounds(50,200,75,40);
			B4.setFont(new Font("Arial", Font.BOLD, 25));				
				B4.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "4";
							index++;}
						else{
							input = input + "4";}
						text.setText(input);} 
			}); 
		B5.setBounds(130,200,75,40);
			B5.setFont(new Font("Arial", Font.BOLD, 25));				
				B5.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "5";
							index++;}
						else{
							input = input + "5";}
						text.setText(input);} 
			}); 
		B6.setBounds(210,200,75,40);
			B6.setFont(new Font("Arial", Font.BOLD, 25));				
				B6.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "6";
							index++;}
						else{
							input = input + "6";}
						text.setText(input);} 
			}); 
		
		B7.setBounds(50,150,75,40);
			B7.setFont(new Font("Arial", Font.BOLD, 25));				
				B7.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "7";
							index++;}
						else{
							input = input + "7";}
						text.setText(input);} 
			}); 
		B8.setBounds(130,150,75,40);
			B8.setFont(new Font("Arial", Font.BOLD, 25));				
				B8.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "8";
							index++;}
						else{
							input = input + "8";}
						text.setText(input);} 
			}); 
		B9.setBounds(210,150,75,40);
			B9.setFont(new Font("Arial", Font.BOLD, 25));				
				B9.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index == 0){
							input = "9";
							index++;}
						else{
							input = input + "9";}
						text.setText(input);} 
			}); 
			
		Bp.setBounds(290,300,75,40);
			Bp.setFont(new Font("Arial", Font.BOLD, 25));			
				Bp.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index != 0 && input.charAt(input.length()-1)!='+' && input.charAt(input.length()-1)!='-' && input.charAt(input.length()-1)!='*' && input.charAt(input.length()-1)!='/' && input.charAt(input.length()-1)!='%' && input.charAt(input.length()-1)!='^' && input.charAt(input.length()-1)!='('){
							input = input + "+";}
						text.setText(input);} 
			}); 
		Bs.setBounds(290,250,75,40);
			Bs.setFont(new Font("Arial", Font.BOLD, 25));			
				Bs.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index != 0 && input.charAt(input.length()-1)!='+' && input.charAt(input.length()-1)!='-' && input.charAt(input.length()-1)!='*' && input.charAt(input.length()-1)!='/' && input.charAt(input.length()-1)!='%' && input.charAt(input.length()-1)!='^' && input.charAt(input.length()-1)!='('){
							input = input + "-";}
						text.setText(input);} 
			}); 
		Bm.setBounds(290,200,75,40);
			Bm.setFont(new Font("Arial", Font.BOLD, 25));		
				Bm.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index != 0 && input.charAt(input.length()-1)!='+' && input.charAt(input.length()-1)!='-' && input.charAt(input.length()-1)!='*' && input.charAt(input.length()-1)!='/' && input.charAt(input.length()-1)!='%' && input.charAt(input.length()-1)!='^' && input.charAt(input.length()-1)!='('){
							input = input + "*";}
						text.setText(input);} 
			}); 
		Bd.setBounds(290,150,75,40);
			Bd.setFont(new Font("Arial", Font.BOLD, 25));		
				Bd.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index != 0 && input.charAt(input.length()-1)!='+' && input.charAt(input.length()-1)!='-' && input.charAt(input.length()-1)!='*' && input.charAt(input.length()-1)!='/' && input.charAt(input.length()-1)!='%' && input.charAt(input.length()-1)!='^' && input.charAt(input.length()-1)!='('){
							input = input + "/";}
						text.setText(input);} 
			}); 
		
		Bmod.setBounds(50,100,75,40);
			Bmod.setFont(new Font("Arial", Font.BOLD, 25));		
				Bmod.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index != 0 && input.charAt(input.length()-1)!='+' && input.charAt(input.length()-1)!='-' && input.charAt(input.length()-1)!='*' && input.charAt(input.length()-1)!='/' && input.charAt(input.length()-1)!='%' && input.charAt(input.length()-1)!='^' && input.charAt(input.length()-1)!='('){
							input = input + "%";}
						text.setText(input);} 
			}); 
		Bdot.setBounds(50,300,75,40);	//50,300,75,40
			Bdot.setFont(new Font("Arial", Font.BOLD, 15));
				Bdot.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index != 0 &&( input.charAt(input.length()-1)=='+' || input.charAt(input.length()-1)=='-' || input.charAt(input.length()-1)=='*' || input.charAt(input.length()-1)=='/' || input.charAt(input.length()-1)=='%' || input.charAt(input.length()-1)=='^')){
							if(!bra){
								input = input + "(";
								bra = true;}				
						}
						else{						
							if(bra){
								input = input + ")";
								bra = false;
							}	
						}
						text.setText(input);} 
			}); 
		Bpow.setBounds(130,100,75,40);	//130,100,75,40
			Bpow.setFont(new Font("Arial", Font.BOLD, 25));
				Bpow.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
						if(index != 0 && input.charAt(input.length()-1)!='+' && input.charAt(input.length()-1)!='-' && input.charAt(input.length()-1)!='*' && input.charAt(input.length()-1)!='/' && input.charAt(input.length()-1)!='%' && input.charAt(input.length()-1)!='^' && input.charAt(input.length()-1)!='(' && input.charAt(input.length()-1)!=')'){
							input = input + "^";}
						text.setText(input);} 
			}); 
		BB.setBounds(290,100,75,40);
			BB.setFont(new Font("Arial", Font.BOLD, 25));
				BB.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){ 
						String input = text.getText();
							String ze = "0";
								if(input.equals(ze)){
									index = 0;
								}
							if(input.length() > 1){
								if(input.charAt(input.length()-1) == ')'){
									bra = true;
								}
								input = input.replaceFirst(".$","");
							}
							else{
								input = "0";
							}
						text.setText(input);}
			}); 
		
        text.setBounds(50,62, 315,30); 	
		text.setForeground(Color.blue); 	
		text.setBackground(Color.white);	//輸出框背景顏色
		text.setFont(new Font("Arial", Font.BOLD, 30));
		text.setOpaque(true);				//顯示
		
		F1.add(text);
		F1.add(BC);
		F1.add(BB);
		F1.add(B0);
		F1.add(B1);
		F1.add(B2);
		F1.add(B3);
		F1.add(B4);
		F1.add(B5);
		F1.add(B6);
		F1.add(B7);
		F1.add(B8);
		F1.add(B9);
		F1.add(Bp);
		F1.add(Bs);
		F1.add(Bm);
		F1.add(Bd);
		F1.add(Bmod);
		F1.add(Bdot);
		F1.add(BE);
		F1.add(Bpow);
		
		
        F1.getContentPane().setBackground( Color.PINK );
		F1.setBounds(420,50,420,400);
		F1.setSize(420,400);
		F1.setLayout(null);
		F1.setVisible(true);
		
        F1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
/*	TEST	
		String input = text.getText();
		input = input + "123";
		text.setText(input);
		F1.add(text);
*/
		
	}
	
	public static int toAnswer(String input){
		int temp1 = 0 , temp2 = 0 , index = 0;
		boolean[] op = {false,false,false,false,false,false};
		
		
		for(int i = 0 ; i < input.length() ; i++){
	//*		
			
//-------------------------------------------------------------------------------	*/		
			switch(input.charAt(i)){
				case'=':
						temp2 = Integer.parseInt(input.substring(index , i));				
						index = i + 1;
						
					if(op[0])
						temp1 += temp2;
					else if(op[1])
						temp1 -= temp2;
					else if(op[2])
						temp1 *= temp2;
					else if(op[3])
						temp1 = (int)(temp1 / temp2);
					else if(op[4])
						temp1 %= temp2;
					else if(op[5])
						temp1 = (int)(Math.pow(temp1,temp2));
					else
						temp1 = temp2;
					
					for(int q = 0 ; q < 6 ; q++)
						op[q] = false;
					break;
				case'+':
						temp2 = Integer.parseInt(input.substring(index , i));
						index = i + 1;
						
					if(op[0])
						temp1 += temp2;
					else if(op[1])
						temp1 -= temp2;
					else if(op[2])
						temp1 *= temp2;
					else if(op[3])
						temp1 = (int)(temp1 / temp2);
					else if(op[4])
						temp1 %= temp2;
					else if(op[5])
						temp1 = (int)(Math.pow(temp1,temp2));
					else
						temp1 = temp2;
					
					for(int q = 0 ; q < 6 ; q++)
						op[q] = false;
					op[0] = true;
					break;
					
				case'-':
						temp2 = Integer.parseInt(input.substring(index , i));
						index = i + 1;
						
					if(op[0])
						temp1 += temp2;
					else if(op[1])
						temp1 -= temp2;
					else if(op[2])
						temp1 *= temp2;
					else if(op[3])
						temp1 = (int)(temp1 / temp2);
					else if(op[4])
						temp1 %= temp2;
					else if(op[5])
						temp1 = (int)(Math.pow(temp1,temp2));
					else
						temp1 = temp2;
					
					for(int q = 0 ; q < 6 ; q++)
						op[q] = false;
					op[1] = true;
					break;	
				case'*':
						temp2 = Integer.parseInt(input.substring(index , i));
						index = i + 1;
						
					if(op[0])
						temp1 += temp2;
					else if(op[1])
						temp1 -= temp2;
					else if(op[2])
						temp1 *= temp2;
					else if(op[3])
						temp1 = (int)(temp1 / temp2);
					else if(op[4])
						temp1 %= temp2;
					else if(op[5])
						temp1 = (int)(Math.pow(temp1,temp2));
					else
						temp1 = temp2;
					
					for(int q = 0 ; q < 6 ; q++)
						op[q] = false;
					op[2] = true;
					break;	
				case'/':
						temp2 = Integer.parseInt(input.substring(index , i));
						index = i + 1;
						
					if(op[0])
						temp1 += temp2;
					else if(op[1])
						temp1 -= temp2;
					else if(op[2])
						temp1 *= temp2;
					else if(op[3])
						temp1 = (int)(temp1 / temp2);
					else if(op[4])
						temp1 %= temp2;
					else if(op[5])
						temp1 = (int)(Math.pow(temp1,temp2));
					else
						temp1 = temp2;
					
					for(int q = 0 ; q < 6 ; q++)
						op[q] = false;
					op[3] = true;
					break;	
				case'%':
						temp2 = Integer.parseInt(input.substring(index , i));
						index = i + 1;
						
					if(op[0])
						temp1 += temp2;
					else if(op[1])
						temp1 -= temp2;
					else if(op[2])
						temp1 *= temp2;
					else if(op[3])
						temp1 = (int)(temp1 / temp2);
					else if(op[4])
						temp1 %= temp2;
					else if(op[5])
						temp1 = (int)(Math.pow(temp1,temp2));
					else
						temp1 = temp2;
					
					for(int q = 0 ; q < 6 ; q++)
						op[q] = false;
					op[4] = true;
					break;	
				case'^':
						temp2 = Integer.parseInt(input.substring(index , i));
						index = i + 1;
						
					if(op[0])
						temp1 += temp2;
					else if(op[1])
						temp1 -= temp2;
					else if(op[2])
						temp1 *= temp2;
					else if(op[3])
						temp1 = (int)(temp1 / temp2);
					else if(op[4])
						temp1 %= temp2;
					else if(op[5])
						temp1 = (int)(Math.pow(temp1,temp2));
					else
						temp1 = temp2;
					
					for(int q = 0 ; q < 6 ; q++)
						op[q] = false;
					op[5] = true;
					break;	
				default:break;
			}
		}	
		return temp1;		
	}
	
}
