package AramaBot;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class AnaEkran {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		JLabel label1=new JLabel("�r�n Giriniz");
		JLabel f�yatlabel=new JLabel("Min Fiyat Giriniz");
		JLabel label2=new JLabel("--Butona Bast�ktan Sonra �nternetinizin H�z�na G�re 10-20 Sn Bekleyiniz--");
		JFrame jf=new JFrame("Arama");
		jf.setLocation(250, 250);
		jf.setSize(500, 150);
		jf.getContentPane().setLayout(new FlowLayout());
		
		JTextField text1=new JTextField(35);
		JTextField text2=new JTextField(25);
		text2.setText("0");
		JButton buton1=new JButton("Ara");
		JRadioButton radio1=new JRadioButton(" Epey.com.tr");
		JRadioButton radio2=new JRadioButton(" Trendyol.com.tr");
		JRadioButton radio3=new JRadioButton(" N11.com.tr");
		JRadioButton radio4=new JRadioButton(" Ak�e.com.tr");
		
		jf.getContentPane().add(radio1);
		jf.getContentPane().add(radio2);
		jf.getContentPane().add(radio3);
		jf.getContentPane().add(radio4);
		jf.getContentPane().add(label1);
		jf.getContentPane().add(text1);
		jf.getContentPane().add(f�yatlabel);
		jf.getContentPane().add(text2);
		jf.getContentPane().add(buton1);
		jf.getContentPane().add(label2);
		
		jf.addWindowListener(new WindowListener() {
	        public void windowOpened(WindowEvent e) {
	            JOptionPane.showMessageDialog(jf, "Program Chome G�ncel (83.0.4103.97 ) Versiyonda �al�maktad�r L�tfen �al��mas� i�in Chrome G�ncelleyiniz");
	        }

	        public void windowClosing(WindowEvent e) {
	            JOptionPane.showMessageDialog(jf, "Bizi Tercih Etti�iniz i�in Te�ekk�rler");
	        }

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			} 
	    });
		radio1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				radio2.setSelected(false);
				radio3.setSelected(false);
				radio4.setSelected(false);
				text2.setEnabled(false);
				text2.setVisible(false);
				f�yatlabel.setEnabled(false);
				f�yatlabel.setVisible(false);
				text2.setText("0");
			}
		});
		radio2.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				radio1.setSelected(false);
				radio3.setSelected(false);
				radio4.setSelected(false);
				
				text2.setEnabled(true);
				text2.setVisible(true);
				f�yatlabel.setEnabled(true);
				f�yatlabel.setVisible(true);
				
			}
		});
		radio3.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				radio2.setSelected(false);
				radio1.setSelected(false);
				radio4.setSelected(false);
				
				text2.setEnabled(true);
				text2.setVisible(true);
				f�yatlabel.setEnabled(true);
				f�yatlabel.setVisible(true);
				
			}
		});
		radio4.addActionListener(new ActionListener() 

		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				radio2.setSelected(false);
				radio3.setSelected(false);
				radio1.setSelected(false);
				text2.setEnabled(true);
				text2.setVisible(true);
				f�yatlabel.setEnabled(true);
				f�yatlabel.setVisible(true);
				
			}
		});
		text2.addKeyListener(new KeyAdapter() {
			    public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if (!((c >= '0') && (c <= '9') ||
			         (c == KeyEvent.VK_BACK_SPACE) ||
			         (c == KeyEvent.VK_DELETE))) {
			       
			        e.consume();
			      }
			    }
			  });
		buton1.addActionListener(new ActionListener() 
		{
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (radio1.isSelected()&&text1.getText()!=null) 
				{

					if (text2.getText()=="")
					{
						text2.setText("0");
					}
					
					String g []=new String[2];
					g=	epey.run(text1.getText(),Integer.parseInt(text2.getText()));
					if (g[0]!="Aranan bilgilere g�re Uygun �r�n Yokrur") {
						
						int dialogResult = JOptionPane.showConfirmDialog(null, g[0]+"\n Adrese Gitmek �ster Misiniz?",null, JOptionPane.YES_NO_OPTION);
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here
							
							git.run(g[1]);
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Aranan Kriterler Uygun �run yoktur!");
					}
					
					radio1.setSelected(false);	
					
					
				}
				else if  (radio2.isSelected()&&text1.getText()!=null) 
				{
					if (text2.getText()=="")
					{
						text2.setText("0");
					}
					
					String g []=new String[2];
					g=	trendyol.run(text1.getText(),Integer.parseInt(text2.getText()));
					if (g[0]!="Aranan bilgilere g�re Uygun �r�n Yokrur") {
						
						int dialogResult = JOptionPane.showConfirmDialog(null, g[0]+"\n Adrese Gitmek �ster Misiniz?",null, JOptionPane.YES_NO_OPTION);
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here
							
							git.run(g[1]);
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Aranan Kriterler Uygun �run yoktur");
					}
					
					radio2.setSelected(false);		
				}	
				else if  (radio3.isSelected()&&text1.getText()!=null) 
				{
					if (text2.getText()=="")
					{
						text2.setText("0");
					}
					
					String g []=new String[2];
					g=	n11.run(text1.getText(),Integer.parseInt(text2.getText()));
					if (g[0]!="Aranan bilgilere g�re Uygun �r�n Yokrur") {
						
						int dialogResult = JOptionPane.showConfirmDialog(null, g[0]+"\n Adrese Gitmek �ster Misiniz?",null, JOptionPane.YES_NO_OPTION);
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here
							
							git.run(g[1]);
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Aranan Kriterler Uygun �run yoktur!");
					}
					
					radio3.setSelected(false);		
					
					
				}
				else if  (radio4.isSelected()&&text1.getText()!=null) 
				{

					if (text2.getText()=="")
					{
						text2.setText("0");
					}
					
					String g []=new String[2];
					g=	akce.run(text1.getText(),Integer.parseInt(text2.getText()));
					if (g[0]!="Aranan bilgilere g�re Uygun �r�n Yokrur") {
						
						int dialogResult = JOptionPane.showConfirmDialog(null, g[0]+"\n Adrese Gitmek �ster Misiniz?",null, JOptionPane.YES_NO_OPTION);
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here
							
							git.run(g[1]);
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Aranan Kriterler Uygun �run yoktur!");
					}
					
					radio4.setSelected(false);		
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Maa�aza Se�iniz");
				}
				
				
			}
		});
		
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
		
		
	}

}
