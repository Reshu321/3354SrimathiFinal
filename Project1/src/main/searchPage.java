package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.json.JSONException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.BorderLayout;

public class searchPage extends JFrame
{
	
    Container container = getContentPane();
	JTextField textField = new JTextField();
	JLabel stock = new JLabel(); 
	JButton btnNewButton = new JButton("Search");
	JButton clear = new JButton("Clear");
	JLabel na ; 
	JLabel ceo ; 
	JLabel lblNewLabel_3; 
	JLabel lblNewLabel_3_1;
	JLabel lblNewLabel_3_1_1; 
	JLabel lblNewLabel_3_1_1_1 ; 
	JLabel lblNewLabel_2; 
	boolean check = false; 
	private final JLabel lblNewLabel = new JLabel("Stocks Search Page");
	searchPage()
	{
		
	
		
		/*getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		String [] arr = {"Stocks", "Educational Videos"}; 
		
		na = new JLabel("Name: " );//+ x[7] );
		na.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		na.setBounds(20, 240, 400, 16);
		getContentPane().add(na);
		
		//ceo of corp
		ceo = new JLabel("CEO: ");//+ x[0]);
		ceo.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		ceo.setBounds(20, 270, 400, 16);
		getContentPane().add(ceo);
		
		//sector of corp
		lblNewLabel_3 = new JLabel("Sector: ");// +x[8]);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_3.setBounds(20, 300, 400, 16);
		getContentPane().add(lblNewLabel_3);
		
		//exchange of corp
		lblNewLabel_3_1 = new JLabel("Exchange: ");//+ x[3]);
		lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(20, 330, 400, 16);
		getContentPane().add(lblNewLabel_3_1);
		
		lblNewLabel_3_1_1 = new JLabel("Market Capital: ");// + x[1]);
		lblNewLabel_3_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(20, 360, 400, 16);
		getContentPane().add(lblNewLabel_3_1_1);
		
		
		lblNewLabel_3_1_1_1 = new JLabel("Headquarters: ");// + x[4]+ " "+ x[5] );
		lblNewLabel_3_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_3_1_1_1.setBounds(20, 390, 400, 16);
		getContentPane().add(lblNewLabel_3_1_1_1);*/
		
		
		//empty constructor
	}
	
	searchPage(User person)
	{
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
			//String [] arr = {"Stocks", "Educational Videos"}; 
		
	
			JLabel lblNewLabel_1 = new JLabel("Enter Ticker: ");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			lblNewLabel_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_1.setBounds(20, 173, 104, 16);
			getContentPane().add(lblNewLabel_1);
			
			textField.setBounds(120, 168, 130, 26);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			
			btnNewButton.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					if(e.getSource()==btnNewButton) 
					{
						StocksApi obj = null;
						try {
							String ticker=textField.getText().toUpperCase(); 
							obj = new StocksApi(ticker);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} 
						String[] x = null;
						try {
							x = obj.getStockAPI();
						} catch (IOException | JSONException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} 
						
						
						if(x==null)
						{
							lblNewLabel_2 = new JLabel("Sorry Ticker is not valid or not found please try a different ticker. ");
							lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
							lblNewLabel_2.setForeground(Color.RED);
							lblNewLabel_2.setBounds(20, 330, 400, 16);
							getContentPane().add(lblNewLabel_2);
							check = true; 
						}
						if(check && x!=null) 
						{
							Container parentx = lblNewLabel_2.getParent();
							parentx.remove(lblNewLabel_2);
							parentx.validate();
							parentx.repaint();
							
							na = new JLabel("Name: " + x[7] );
							na.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							na.setBounds(20, 240, 400, 16);
							getContentPane().add(na);
							
							//ceo of corp
							ceo = new JLabel("CEO: "+ x[0]);
							ceo.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							ceo.setBounds(20, 270, 400, 16);
							getContentPane().add(ceo);
							
							//sector of corp
							lblNewLabel_3 = new JLabel("Sector: "+x[8]);
							lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							lblNewLabel_3.setBounds(20, 300, 400, 16);
							getContentPane().add(lblNewLabel_3);
							
							//exchange of corp
							lblNewLabel_3_1 = new JLabel("Exchange: "+ x[3]);
							lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							lblNewLabel_3_1.setBounds(20, 330, 400, 16);
							getContentPane().add(lblNewLabel_3_1);
							
							lblNewLabel_3_1_1 = new JLabel("Market Capital: " + x[1]);
							lblNewLabel_3_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							lblNewLabel_3_1_1.setBounds(20, 360, 400, 16);
							getContentPane().add(lblNewLabel_3_1_1);
							
							
							lblNewLabel_3_1_1_1 = new JLabel("Headquarters: " + x[4]+ " "+ x[5] );
							lblNewLabel_3_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							lblNewLabel_3_1_1_1.setBounds(20, 390, 400, 16);
							getContentPane().add(lblNewLabel_3_1_1_1);
							
							check = false; 
							
						}
						else
						{
							
							na = new JLabel("Name: " + x[7] );
							na.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							na.setBounds(20, 240, 400, 16);
							getContentPane().add(na);
							
							//ceo of corp
							ceo = new JLabel("CEO: "+ x[0]);
							ceo.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							ceo.setBounds(20, 270, 400, 16);
							getContentPane().add(ceo);
							
							//sector of corp
							lblNewLabel_3 = new JLabel("Sector: "+x[8]);
							lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							lblNewLabel_3.setBounds(20, 300, 400, 16);
							getContentPane().add(lblNewLabel_3);
							
							//exchange of corp
							lblNewLabel_3_1 = new JLabel("Exchange: "+ x[3]);
							lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							lblNewLabel_3_1.setBounds(20, 330, 400, 16);
							getContentPane().add(lblNewLabel_3_1);
							
							lblNewLabel_3_1_1 = new JLabel("Market Capital: " + x[1]);
							lblNewLabel_3_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							lblNewLabel_3_1_1.setBounds(20, 360, 400, 16);
							getContentPane().add(lblNewLabel_3_1_1);
							
							
							lblNewLabel_3_1_1_1 = new JLabel("Headquarters: " + x[4]+ " "+ x[5] );
							lblNewLabel_3_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
							lblNewLabel_3_1_1_1.setBounds(20, 390, 400, 16);
							getContentPane().add(lblNewLabel_3_1_1_1);
						}
							
					
					}
				}
			});
			btnNewButton.setForeground(new Color(0, 191, 255));
			btnNewButton.setBounds(250, 168, 117, 29);
			getContentPane().add(btnNewButton);
			
		
			
			
			clear.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					if(e.getSource() ==clear)
					{
						Container parent = ceo.getParent();
						parent.remove(ceo);
						parent.validate();
						parent.repaint();
						
						Container parent1 = na.getParent();
						parent1.remove(na);
						parent1.validate();
						parent1.repaint();
						
						Container parent2 = lblNewLabel_3.getParent();
						parent2.remove(lblNewLabel_3);
						parent2.validate();
						parent2.repaint();
						
						Container parent3 = lblNewLabel_3_1.getParent();
						parent3.remove(lblNewLabel_3_1);
						parent3.validate();
						parent3.repaint();
						
						Container parent4 = lblNewLabel_3_1_1.getParent();
						parent4.remove(lblNewLabel_3_1_1);
						parent4.validate();
						parent4.repaint();
						
						Container parent5 = lblNewLabel_3_1_1_1.getParent();
						parent5.remove(lblNewLabel_3_1_1_1);
						parent5.validate();
						parent5.repaint();
					}
				}
			});
			clear.setForeground(new Color(0, 191, 255));
			clear.setBounds(136, 510, 117, 29);
			getContentPane().add(clear);
			
			
			lblNewLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 19));
			lblNewLabel.setForeground(new Color(0, 191, 255));
			lblNewLabel.setBounds(89, 100, 221, 61);
			
			getContentPane().add(lblNewLabel);
			
			
			JButton btnNewButton1 = new JButton("Home");
			btnNewButton1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					if(e.getSource()==btnNewButton1) 
					{
						homePage hp = new homePage(person); 
						hp.setBounds(10, 10, 450, 600);
			            hp.setVisible(true);
								
					}
				}
			});
			btnNewButton1.setForeground(new Color(0, 191, 255));
			btnNewButton1.setBounds(327, 510, 117, 29);
			getContentPane().add(btnNewButton1);
			
			
		
	}
	
	
	
	
}
