
import java.awt.*;
import java.awt.List;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import java.util.*;
public class zhr1 extends JFrame{
	static zhr1 mainJFrame=new zhr1();
	static JTabbedPane tabbedPane1=new JTabbedPane();
	static JCheckBoxMenuItem cbmi1 = new JCheckBoxMenuItem("����"); // ��ѡ��˵���
	static JCheckBoxMenuItem cbmi2 = new JCheckBoxMenuItem("����"); // ��ѡ��˵���
	static JCheckBoxMenuItem cbmi3 = new JCheckBoxMenuItem("б��"); // ��ѡ��˵���
	static JMenuItem mi1=new JMenuItem("�ر�");
	static JMenuItem mi2=new JMenuItem("�鿴��˵�");
	static JPanel p=new JPanel();                    //����container���������,���ڼ����������
	static JLabel name=new JLabel("************���������ӭ��************");
	static JPanel n1=new JPanel();                  //�����ҳ��ʽ��Ϣ�����
	
	static JPanel panelA=new JPanel();
	static JButton chA= new JButton("001��ζƴ�̣�39",new ImageIcon("images/��ζƴ��.jpg"));
	static JButton chB= new JButton("002����㣤59",new ImageIcon("images/�����.jpg"));
	static  JButton chC = new JButton("003���м���49",new ImageIcon("images/���м�.jpg"));
	static JButton chD = new JButton("004�ع��⣤28",new ImageIcon("images/�ع���.jpg"));
	static JButton chE= new JButton("005�Ǵ��Źǣ�38",new ImageIcon("images/�Ǵ��Ź�.jpg"));
	static JButton chF = new JButton("006����ţ�⣤39",new ImageIcon("images/����ţ��.jpg"));

	static JPanel panelB=new JPanel();
	static JButton chA1 = new JButton("007�ཷ��ţ�⣤29",new ImageIcon("images/�ཷ��ţ��.jpg"));
	static JButton chB1= new JButton("008���⳴�˻���39",new ImageIcon("images/���⳴�˻�.jpg"));
	static  JButton chC1 = new JButton("009������ζ��19",new ImageIcon("images/������ζ.jpg"));
	static JButton chD1 = new JButton("010�²˳�����18",new ImageIcon("images/�²˳���.jpg"));
	static JButton chE1= new JButton("011���ѳ�����28",new ImageIcon("images/���ѳ���.jpg"));
	static JButton chF1 = new JButton("012���㳴���ǣ�38",new ImageIcon("images/���㳴����.jpg"));
	
	static JPanel panelC=new JPanel();
	static JButton chA2  = new JButton("013���ģ�18",new ImageIcon("images/����.jpg"));
	static JButton chB2 = new JButton("014�˻���19",new ImageIcon("images/�˻�.jpg"));
	static JButton chC2 = new JButton("015���ˣ�18",new ImageIcon("images/����.jpg"));
	static JButton chD2 = new JButton("016�²ˣ�18",new ImageIcon("images/�²�.jpg"));
	static JButton chE2 = new JButton("017˿�� ��18",new ImageIcon("images/˿��.jpg"));
	static JButton chF2 = new JButton("018���� ��18",new ImageIcon("images/����.jpg"));
     
	static JPanel panelD=new JPanel();
	static JButton chA3  = new JButton("019�׷���3",new ImageIcon("images/�׷�.jpg"));
	static JButton chB3 = new JButton("020���ࣤ2",new ImageIcon("images/����.jpg"));
	static JButton chC3 = new JButton("021������8",new ImageIcon("images/����.jpg"));
	static JButton chD3 = new JButton("022���磤9",new ImageIcon("images/����.jpg"));
	static JButton chE3= new JButton("023���ۣ�8",new ImageIcon("images/����.jpg"));
	static JButton chF3 = new JButton("024���ݳ�����12",new ImageIcon("images/���ݳ���.jpg"));
	
	static JPanel panelE=new JPanel();
	static JButton chA4  = new JButton("025�����̶�ɳ��18",new ImageIcon("images/�����̶�ɳ.jpg"));
	static JButton chB4= new JButton("026Ҭ֭����¶��19",new ImageIcon("images/Ҭ֭����¶.jpg"));
	static JButton chC4 = new JButton("027�ɿ������⣤18",new ImageIcon("images/�ɿ�������.jpg"));
	static JButton chD4 = new JButton("028����˫Ƥ�̣�8",new ImageIcon("images/����˫Ƥ��.jpg"));
	static JButton chE4= new JButton("029�������Ӹ���18",new ImageIcon("images/�������Ӹ�.jpg"));
	static JButton chF4 = new JButton("030��ˮ��֦�ࣤ9",new ImageIcon("images/��ˮ��֦��.jpg"));
	
	static JPanel panelF=new JPanel();
	static JButton chA5= new JButton("031���������̲裤10",new ImageIcon("images/���������̲�.jpg"));
	static JButton chB5= new JButton("032���ƿ��̣�8",new ImageIcon("images/���ƿ���.jpg"));
	static JButton chC5 = new JButton("033ţ�����ɲݣ�8",new ImageIcon("images/ţ�����ɲ�.jpg"));
	static JButton chD5 = new JButton("034����������8",new ImageIcon("images/��������.jpg"));
	static JButton chE5= new JButton("035������ŵ��12",new ImageIcon("images/������ŵ.jpg"));
	static JButton chF5 = new JButton("036�������Ӳ裤9",new ImageIcon("images/�������Ӳ�.jpg"));
	
	static JLabel Label3=new JLabel("�˵��ܶ0��");
	static JLabel Label=new JLabel("��ѡ�����ţ�");
	static JLabel Label1=new JLabel("�������ò�������");
	static String[] data= {"��1","��2","��3","��4","��5","��6","��7","��8","��9","��10","��11","��12"};
	static JComboBox cbx=new JComboBox(data);  //��������12��ѡ��������б��
    static List list = new List(10,true);    //����һ��չʾ�ض������Լ�����ѡ������Ŀ���б�
    static List list1=new List(25,true);
    static List list2=new List(25,true);
	static JButton btn1=new JButton("ȡ��");                               //�����ĸ�������ť
	static JButton btn2=new JButton("�µ�");
	static JButton btn3=new JButton("�ӵ�");
	static JButton btn4=new JButton("����");
	static JTextField tf=new JTextField();                                          //�����ı���
	static JLabel cot=new JLabel();                                                     //������������š���ǩ
	static JLabel label1=new JLabel("�ܽ�" +"Ԫ");                 //�������ܽ���ǩ
	public static void main(String[] args) {
		mainJFrame.setTitle("����������ϵͳ");
		mainJFrame.setSize(760,600);		
		mainJFrame.setLocationRelativeTo(null);
		mainJFrame.setResizable(false);
		mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ùرն���
		Container container=mainJFrame.getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel A=new JPanel(new BorderLayout());      //����һ�����A,�����n1�ӵ�A�Ķ���,���ֲ����tabbedPane1�ӵ�A������,�ٽ����A�ӵ�container�Ķ���
		JTabbedPane tabbedPane=new JTabbedPane();     //����һ���ֲ����tabbedPane,���ڴ��container�����İ�ť
		Component panel=makeMenuPanel();      //���÷�������һ������6��ѡ��ť�����
		tabbedPane.addTab("��ʽ����", panel);
		tabbedPane.setPreferredSize(new Dimension(150,400));//��ά������tabbedPane�Ĵ�С
		container.add(tabbedPane,BorderLayout.WEST);       //��tabbedPane�ӵ�container�Ķ���
				
		GridBagLayout gridbag=new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		n1.setLayout(gridbag);                                          //����n1�Ĳ��ַ�ʽ
		constraints.fill = GridBagConstraints.BOTH;   //�������򶼿�������
		constraints.anchor=GridBagConstraints.CENTER;
		gridbag.setConstraints(n1, constraints);
		
		constraints.weightx = 0;
		constraints.weighty =0.01;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(Label, constraints);
		n1.add(Label);
		
		constraints.weightx =0.5;
		constraints.weighty =0.01;	
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(cbx, constraints);
		n1.add(cbx);
		
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weighty =0.01;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(Label1, constraints);
		n1.add(Label1);                     //�����������ò���������ǩ����
		
		tf.setColumns(10);                               //�����ı���ռ10��
		constraints.weightx =1;
		constraints.weighty =0.01;
		gridbag.setConstraints(tf, constraints);
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		n1.add(tf);
		
		JLabel Label2=new JLabel("�ѵ��ʽ�б�");
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weighty =0.01;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(Label2, constraints);
		n1.add(Label2);
		
        list.setFont( new Font("����", Font.BOLD, 20));
   	    list.setForeground(Color.CYAN);
	    JScrollPane scrollpane=new JScrollPane(list);//ʹlist�����¹����Ļ�������������ҹ�����listֻ�����¹���,JScrollPane�����������ҹ�����
		constraints.weightx =1;
		constraints.weighty =0.5;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(scrollpane, constraints);
		n1.add(scrollpane);
		
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weighty =0.01;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(Label3, constraints);
		n1.add(Label3);
		
		A.add(n1,BorderLayout.EAST);
		
		panelA.setLayout(new GridLayout(3,2));                       //��panelA����Ϊ���񲼾�
		chA.setHorizontalTextPosition(JButton.CENTER);      //�����ı������ͼ���ˮƽλ��
	    chA.setVerticalTextPosition(JButton.BOTTOM);         //�����ı������ͼ��Ĵ�ֱλ��
	    
		chB.setHorizontalTextPosition(JButton.CENTER);
	    chB.setVerticalTextPosition(JButton.BOTTOM);	
	    
		chC.setHorizontalTextPosition(JButton.CENTER);
	    chC.setVerticalTextPosition(JButton.BOTTOM);	
	    
		 chD.setHorizontalTextPosition(JButton.CENTER);
	     chD.setVerticalTextPosition(JButton.BOTTOM);
	     
		 chE.setHorizontalTextPosition(JButton.CENTER);
	     chE.setVerticalTextPosition(JButton.BOTTOM);	 
	     
		 chF.setHorizontalTextPosition(JButton.CENTER);
	     chF.setVerticalTextPosition(JButton.BOTTOM);
			panelA.add(chA);
			panelA.add(chB);
			panelA.add(chC);
			panelA.add(chD);
			panelA.add(chE);
			panelA.add(chF);
		chA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("001��ζƴ��")) {       //�ڶ��ε㰴ťʱִ��
			                index = i;
			                flag = true;
			                break;
			            }
			        }
			        if (flag) {
			            String item = list.getItem(index);
			            int x_index = item.indexOf("X");//������"X"���±��ȡ����
			            String value = item.substring(x_index + 1);//�ٻ�ȡ"X"����һ���Ӵ�
			            item = item.substring(0, x_index + 1)+ (Integer.parseInt(value) + 1);//ʵ�ֲ�ʽ��������ʾ
			            list.remove(index);
			            list.add(item, index);
			        } else {
			            list.add("001��ζƴ�̣�39  X1");		//��һ�ε㰴ťʱִ��
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 39));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
				}
			});
			chB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("002�����")) {
			                index = i;
			                flag = true;
			                break;
			            }
			        }
			        if (flag) {
			            String item = list.getItem(index);
			            int x_index = item.indexOf("X");
			            String value = item.substring(x_index + 1);
			            item = item.substring(0, x_index + 1)+ (Integer.parseInt(value) + 1);
		                list.remove(index);
			            list.add(item, index);
			        } else {
			            list.add("002����㣤59  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 59));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
				}
			});
			chC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("003���м�")) {
			                index = i;
			                flag = true;
			                break;
			            }
			        }
			        if (flag) {
			            String item = list.getItem(index);
			            int x_index = item.indexOf("X");
			            String value = item.substring(x_index + 1);
			            item = item.substring(0, x_index + 1)+ (Integer.parseInt(value) + 1);
			            list.remove(index);
			            list.add(item, index);
			        } else {
			            list.add("003���м���49  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 49));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
				}
			});
			chD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("004�ع���")) {
			                index = i;
			                flag = true;
			                break;
			            }
			        }
			        if (flag) {
			            String item = list.getItem(index);
			            int x_index = item.indexOf("X");
			            String value = item.substring(x_index + 1);
			            item = item.substring(0, x_index + 1)+ (Integer.parseInt(value) + 1);
			            list.remove(index);
			            list.add(item, index);
			        } else {
			            list.add("004�ع��⣤28  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 28));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
				}
			});
			chE.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("005�Ǵ��Ź�")) {
			                index = i;
			                flag = true;
			                break;
			            }
			        }
			        if (flag) {
			            String item = list.getItem(index);
			            int x_index = item.indexOf("X");
			            String value = item.substring(x_index + 1);
			            item = item.substring(0, x_index + 1)+ (Integer.parseInt(value) + 1);
			            list.remove(index);
			            list.add(item, index);
			        } else {
			            list.add("005�Ǵ��Źǣ�38  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 38));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
				}
			});
			chF.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("006����ţ��")) {
			                index = i;
			                flag = true;
			                break;
			            }
			        }
			        if (flag) {
			            String item = list.getItem(index);
			            int x_index = item.indexOf("X");
			            String value = item.substring(x_index + 1);
			            item = item.substring(0, x_index + 1)+ (Integer.parseInt(value) + 1);
			            list.remove(index);
			            list.add(item, index);
			        } else {
			            list.add("006����ţ�⣤39  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 39));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
				}
			});
			panelB.setLayout(new GridLayout(3,2));
			
			 chA1.setHorizontalTextPosition(JButton.CENTER);
		     chA1.setVerticalTextPosition(JButton.BOTTOM);
		
			 chB1.setHorizontalTextPosition(JButton.CENTER);
		     chB1.setVerticalTextPosition(JButton.BOTTOM);
		  
			 chC1.setHorizontalTextPosition(JButton.CENTER);
		     chC1.setVerticalTextPosition(JButton.BOTTOM);
		    
			 chD1.setHorizontalTextPosition(JButton.CENTER);
		     chD1.setVerticalTextPosition(JButton.BOTTOM);
		   
			 chE1.setHorizontalTextPosition(JButton.CENTER);
		     chE1.setVerticalTextPosition(JButton.BOTTOM);
		   
			 chF1.setHorizontalTextPosition(JButton.CENTER);
		     chF1.setVerticalTextPosition(JButton.BOTTOM);
				panelB.add(chA1);
				panelB.add(chB1);
				panelB.add(chC1);
				panelB.add(chD1);
				panelB.add(chE1);
				panelB.add(chF1);
	       chA1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("007�ཷ��ţ��")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("007�ཷ��ţ�⣤29  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 29));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });
	        chB1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("008���⳴�˻�")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("008���⳴�˻���39  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 39));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chC1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("009������ζ")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("009������ζ��19  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 19));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chD1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("010�²˳���")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("010�²˳�����18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 18));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });		
	        chE1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("011���ѳ���")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("011���ѳ�����28  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 28));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });			
	        chF1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("012���㳴����")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("012���㳴���ǣ�38  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 38));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        panelC.setLayout(new GridLayout(3,2));
		
			 chA2.setHorizontalTextPosition(JButton.CENTER);
		     chA2.setVerticalTextPosition(JButton.BOTTOM);
		 
			 chB2.setHorizontalTextPosition(JButton.CENTER);
		     chB2.setVerticalTextPosition(JButton.BOTTOM);
		   
			 chC2.setHorizontalTextPosition(JButton.CENTER);
		     chC2.setVerticalTextPosition(JButton.BOTTOM);
	
			 chD2.setHorizontalTextPosition(JButton.CENTER);
		     chD2.setVerticalTextPosition(JButton.BOTTOM);
	
			 chE2.setHorizontalTextPosition(JButton.CENTER);
		     chE2.setVerticalTextPosition(JButton.BOTTOM);
	
			 chF2.setHorizontalTextPosition(JButton.CENTER);
		     chF2.setVerticalTextPosition(JButton.BOTTOM);
				panelC.add(chA2);
				panelC.add(chB2);
				panelC.add(chC2);
				panelC.add(chD2);
				panelC.add(chE2);
				panelC.add(chF2);
			chA2.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String[] items = list.getItems();
		                boolean flag = false;
		                int index = 0;
		                for (int i = 0; i < items.length; i++) {
		                    if (items[i].contains("013 ���ģ�18")) {
		                        index = i;
		                        flag = true;
		                        break;
		                    }
		                }
		                if (flag) {
		                    String item = list.getItem(index);
		                    int x_index = item.indexOf("X");
		                    String value = item.substring(x_index + 1);
		                    item = item.substring(0, x_index + 1)
		                            + (Integer.parseInt(value) + 1);
		                    list.remove(index);
		                    list.add(item, index);
		                } else {
		                    list.add("013 ���ģ�18  X1");
		                }
		                String s=Label3.getText();
						s=s.trim();
						String s1="";
						for(int i=0;i<s.length();i++) {
							if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
								s1=s1+s.charAt(i);					
						}
						}       
						 String newValue = String.valueOf((Integer.parseInt(s1) + 18));
				       s = s.replaceAll(s1, newValue);
				       Label3.setText(s);   
		            }
		        });	
	        chB2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("014 �˻���19")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("014 �˻���19  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 19));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chC2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("015 ���ˣ�18")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("015 ���ˣ�18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 18));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chD2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("016 �²ˣ�18")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("016 �²ˣ�18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 18));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });		
	        chE2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("017 ˿�ϣ�18")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("017 ˿�ϣ�18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 18));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });			
	        chF2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("018 ���ǣ�18")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("018 ���ǣ�18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 18));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        panelD.setLayout(new GridLayout(3,2));
		
			 chA3.setHorizontalTextPosition(JButton.CENTER);
		     chA3.setVerticalTextPosition(JButton.BOTTOM);
		
			 chB3.setHorizontalTextPosition(JButton.CENTER);
		     chB3.setVerticalTextPosition(JButton.BOTTOM);
		 
			 chC3.setHorizontalTextPosition(JButton.CENTER);
		     chC3.setVerticalTextPosition(JButton.BOTTOM);
		 
			 chD3.setHorizontalTextPosition(JButton.CENTER);
		     chD3.setVerticalTextPosition(JButton.BOTTOM);
	
			 chE3.setHorizontalTextPosition(JButton.CENTER);
		     chE3.setVerticalTextPosition(JButton.BOTTOM);
	
			 chF3.setHorizontalTextPosition(JButton.CENTER);
		     chF3.setVerticalTextPosition(JButton.BOTTOM);
				panelD.add(chA3);
				panelD.add(chB3);
				panelD.add(chC3);
				panelD.add(chD3);
				panelD.add(chE3);
				panelD.add(chF3);
		chA3.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String[] items = list.getItems();
		                boolean flag = false;
		                int index = 0;
		                for (int i = 0; i < items.length; i++) {
		                    if (items[i].contains("019�׷���3")) {
		                        index = i;
		                        flag = true;
		                        break;
		                    }
		                }
		                if (flag) {
		                    String item = list.getItem(index);
		                    int x_index = item.indexOf("X");
		                    String value = item.substring(x_index + 1);
		                    item = item.substring(0, x_index + 1)
		                            + (Integer.parseInt(value) + 1);
		                    list.remove(index);
		                    list.add(item, index);
		                } else {
		                    list.add("019�׷���3  X1");
		                }
		                String s=Label3.getText();
						s=s.trim();
						String s1="";
						for(int i=0;i<s.length();i++) {
							if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
								s1=s1+s.charAt(i);					
						}
						}       
						 String newValue = String.valueOf((Integer.parseInt(s1) + 3));
				       s = s.replaceAll(s1, newValue);
				       Label3.setText(s);   
		            }
		        });	
	        chB3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("020���ࣤ2")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("020���ࣤ2  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 2));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chC3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("021������8")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("021������8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 8));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chD3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("022���磤9")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("022���磤9  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 9));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });		
	        chE3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("023���ۣ�8")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("023���ۣ�8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 8));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });			
	        chF3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("024���ݳ�����12")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("024���ݳ�����12  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 12));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        panelE.setLayout(new GridLayout(3,2));
			
			 chA4.setHorizontalTextPosition(JButton.CENTER);
		     chA4.setVerticalTextPosition(JButton.BOTTOM);
	
			 chB4.setHorizontalTextPosition(JButton.CENTER);
		     chB4.setVerticalTextPosition(JButton.BOTTOM);
		    
			 chC4.setHorizontalTextPosition(JButton.CENTER);
		     chC4.setVerticalTextPosition(JButton.BOTTOM);
		   
			 chD4.setHorizontalTextPosition(JButton.CENTER);
		     chD4.setVerticalTextPosition(JButton.BOTTOM);
		   
			 chE4.setHorizontalTextPosition(JButton.CENTER);
		     chE4.setVerticalTextPosition(JButton.BOTTOM);
		   
			 chF4.setHorizontalTextPosition(JButton.CENTER);
		     chF4.setVerticalTextPosition(JButton.BOTTOM);
				panelE.add(chA4);
				panelE.add(chB4);
				panelE.add(chC4);
				panelE.add(chD4);
				panelE.add(chE4);
				panelE.add(chF4);
		chA4.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String[] items = list.getItems();
		                boolean flag = false;
		                int index = 0;
		                for (int i = 0; i < items.length; i++) {
		                    if (items[i].contains("025�����̶�ɳ��18")) {
		                        index = i;
		                        flag = true;
		                        break;
		                    }
		                }
		                if (flag) {
		                    String item = list.getItem(index);
		                    int x_index = item.indexOf("X");
		                    String value = item.substring(x_index + 1);
		                    item = item.substring(0, x_index + 1)
		                            + (Integer.parseInt(value) + 1);
		                    list.remove(index);
		                    list.add(item, index);
		                } else {
		                    list.add("025�����̶�ɳ��18  X1");
		                }
		                String s=Label3.getText();
						s=s.trim();
						String s1="";
						for(int i=0;i<s.length();i++) {
							if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
								s1=s1+s.charAt(i);					
						}
						}       
						 String newValue = String.valueOf((Integer.parseInt(s1) + 18));
				       s = s.replaceAll(s1, newValue);
				       Label3.setText(s);   
		            }
		        });	
	        chB4.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("026Ҭ֭����¶��19")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("026Ҭ֭����¶��19 X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 19));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chC4.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("027�ɿ������⣤18")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("027�ɿ������⣤18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 18));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chD4.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("028����˫Ƥ�̣�8")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("028����˫Ƥ�̣�8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 8));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });		
	        chE4.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("029�������Ӹ���18")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("029�������Ӹ���18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) +18));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });			
	        chF4.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("030��ˮ��֦�ࣤ9")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("030��ˮ��֦�ࣤ9  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 9));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        panelF.setLayout(new GridLayout(3,2));
		
			 chA5.setHorizontalTextPosition(JButton.CENTER);//�����ı������ͼ���ˮƽλ��
		     chA5.setVerticalTextPosition(JButton.BOTTOM);//�����ı������ͼ��Ĵ�ֱλ��
		     
			 chB5.setHorizontalTextPosition(JButton.CENTER);
		     chB5.setVerticalTextPosition(JButton.BOTTOM);
		   
			 chC5.setHorizontalTextPosition(JButton.CENTER);
		     chC5.setVerticalTextPosition(JButton.BOTTOM);
		  
			 chD5.setHorizontalTextPosition(JButton.CENTER);
		     chD5.setVerticalTextPosition(JButton.BOTTOM);
		  
			 chE5.setHorizontalTextPosition(JButton.CENTER);
		     chE5.setVerticalTextPosition(JButton.BOTTOM);
		
			 chF5.setHorizontalTextPosition(JButton.CENTER);
		     chF5.setVerticalTextPosition(JButton.BOTTOM);
				panelF.add(chA5);
				panelF.add(chB5);
				panelF.add(chC5);
				panelF.add(chD5);
				panelF.add(chE5);
				panelF.add(chF5);
		chA5.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String[] items = list.getItems();
		                boolean flag = false;
		                int index = 0;
		                for (int i = 0; i < items.length; i++) {
		                    if (items[i].contains("031���������̲裤10")) {
		                        index = i;
		                        flag = true;
		                        break;
		                    }
		                }
		                if (flag) {
		                    String item = list.getItem(index);
		                    int x_index = item.indexOf("X");
		                    String value = item.substring(x_index + 1);
		                    item = item.substring(0, x_index + 1)
		                            + (Integer.parseInt(value) + 1);
		                    list.add(item, index);
		                } else {
		                    list.add("031���������̲裤10  X1");
		                }
		                String s=Label3.getText();
						s=s.trim();
						String s1="";
						for(int i=0;i<s.length();i++) {
							if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
								s1=s1+s.charAt(i);					
						}
						}       
						 String newValue = String.valueOf((Integer.parseInt(s1) + 10));
				       s = s.replaceAll(s1, newValue);
				       Label3.setText(s);   
		            }
		        });	
	        chB5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("032���ƿ��̣�8")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("032���ƿ��̣�8 X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 8));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chC5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("033ţ�����ɲݣ�8")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("033ţ�����ɲݣ�8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 8));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        chD5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("034����������8")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("034����������8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 8));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });		
	        chE5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("035������ŵ��12")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("035������ŵ��12  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) +12));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });			
	        chF5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String[] items = list.getItems();
	                boolean flag = false;
	                int index = 0;
	                for (int i = 0; i < items.length; i++) {
	                    if (items[i].contains("036�������Ӳ裤9")) {
	                        index = i;
	                        flag = true;
	                        break;
	                    }
	                }
	                if (flag) {
	                    String item = list.getItem(index);
	                    int x_index = item.indexOf("X");
	                    String value = item.substring(x_index + 1);
	                    item = item.substring(0, x_index + 1)
	                            + (Integer.parseInt(value) + 1);
	                    list.remove(index);
	                    list.add(item, index);
	                } else {
	                    list.add("036�������Ӳ裤9  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 9));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
		tabbedPane1.addTab("������", panelA);
	
		tabbedPane1.addTab("С����", panelB);
	
		tabbedPane1.addTab("�߲���", panelC);
		
		tabbedPane1.addTab("��ʳ��",panelD);
	
		tabbedPane1.addTab("��Ʒ��",panelE);
	
		tabbedPane1.addTab("��Ʒ��",panelF);
		tabbedPane1.setPreferredSize(new Dimension(400,400));//����tabbedPane1�Ĵ�С
		A.add(tabbedPane1,BorderLayout.WEST);       //���ֲ����tabbedPane1�ӵ�A������
	    container.add(A,BorderLayout.EAST);               //�����A�ӵ�container�Ķ���
		
		JPanel n2=new JPanel();
		n2.add(btn1);
		n2.add(btn2);
		n2.add(btn3);
		n2.add(btn4);
		container.add(n2,BorderLayout.SOUTH);   //�����n2�ӵ�container���ϲ�
		btn1.addActionListener(new MybtnActionListener());
		btn2.addActionListener(new MybtnActionListener());
		btn3.addActionListener(new MybtnActionListener());
		btn4.addActionListener(new MybtnActionListener());
		
		p.setSize(800,200);
		p.setBackground(Color.PINK);
		name.setSize(400,150);
		name.setForeground(Color.BLUE);
		p.add(name);
		container.add(p,BorderLayout.NORTH);       //�����p�ӵ�container�ı���
		JMenuBar mb = new JMenuBar(); 
		JMenu mn1 = new JMenu("���ò�������������ʽ");
		JMenu mn2 = new JMenu("����");
		mb.add(mn1);
		mb.add(mn2);
		mn1.addSeparator();
		cbmi1.addItemListener(new MyZhangMenuListener());
		mn1.add(cbmi1);
		cbmi1.setState(true);
		cbmi2.addItemListener(new MyZhangMenuListener());
		mn1.add(cbmi2);
		cbmi3.addItemListener(new MyZhangMenuListener());
		mn1.add(cbmi3);
		mn1.addSeparator();
		mn2.addSeparator();
		mn2.add(mi1);
		mi1.addActionListener(new MyZhangActionListener());
		mn2.add(mi2);
		mi2.addActionListener(new MyZhangActionListener());
		mn2.addSeparator();
		container.add(mb);
		mainJFrame.setJMenuBar(mb);
		list.setVisible(true);
		mainJFrame.setVisible(true);
	}
	static class MyZhangMenuListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			boolean yn1 = cbmi1.getState();
			boolean yn2 = cbmi2.getState();
			boolean yn3 = cbmi3.getState();
			int state = 0;
			if (yn1)
				state = Font.PLAIN;     //����
			 if (yn2)
				state = state + Font.BOLD;             //����
			 if (yn3)
				state = state + Font.ITALIC;            //б��
			if (yn1 || yn2 || yn3)
				name.setFont(new Font("����_GB2312", state, 30));
			else
				name.setFont(new Font("����", Font.PLAIN, 30));
		}
	}
	static class MyZhangActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { // �����¼��ĳ������
			JMenuItem mi = (JMenuItem) e.getSource(); // ȡ�������¼��Ķ���
			if (mi==mi1) {
				mainJFrame.dispose(); // �رմ��ڣ��ͷ���Դ
			     System.exit(0);
		}
			if(mi==mi2) {
				Frame f=new Frame("�ҵĵ�˵�");
				f.setBounds(300, 100, 650, 600);
				TextArea ta=new TextArea();		
				FileDialog open=new FileDialog(mainJFrame,"��",FileDialog.LOAD);        //�鿴�ļ�
				open.setVisible(true);
				String dirpath=open.getDirectory();
				String filename=open.getFile();
				if(dirpath==null||filename==null) 
					return;      //�ղ���
				else
					ta.setText(null);
				File file=new File(dirpath,filename);
				try {
					BufferedReader buf=new BufferedReader(new FileReader(file));	
					String s=null;
					while((s=buf.readLine())!=null) {
						ta.append(s+"\r");
					}
					f.add(ta);
					f.setVisible(true);
					buf.close();
					f.addWindowListener(new WindowAdapter(){
						@Override
						public void windowClosing(WindowEvent e) {
							// TODO �Զ����ɵķ������
							f.dispose();
						}
					} );
				}
				catch(FileNotFoundException e1) {
					e1.printStackTrace();
				}
				catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	protected static  Component makeMenuPanel() {
		JPanel panel=new JPanel(new FlowLayout());
		JButton[] menu=new JButton[6];
		for(int i=0;i<menu.length;i++) {
			menu[i]=new JButton();
		}
		menu[0].setText("������ʽ");
		menu[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("������", panelA);
				tabbedPane1.addTab("С����", panelB);
				tabbedPane1.addTab("�߲���", panelC);
				tabbedPane1.addTab("��ʳ��", panelD);
				tabbedPane1.addTab("��Ʒ��", panelE);
				tabbedPane1.addTab("��Ʒ��", panelF);
			}
		});
		menu[1].setText("  С����  ");
		menu[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("С����", panelB);
				tabbedPane1.addTab("������", panelA);			
				tabbedPane1.addTab("�߲���", panelC);
				tabbedPane1.addTab("��ʳ��", panelD);
				tabbedPane1.addTab("��Ʒ��", panelE);
				tabbedPane1.addTab("��Ʒ��", panelF);
			}
		});
		menu[2].setText("  �߲���  ");
		menu[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("�߲���", panelC);
				tabbedPane1.addTab("������", panelA);
				tabbedPane1.addTab("С����", panelB);			
				tabbedPane1.addTab("��ʳ��", panelD);
				tabbedPane1.addTab("��Ʒ��", panelE);
				tabbedPane1.addTab("��Ʒ��", panelF);
			}
		});
		menu[3].setText("  ��ʳ��  ");
		menu[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("��ʳ��", panelD);
				tabbedPane1.addTab("������", panelA);
				tabbedPane1.addTab("С����", panelB);
				tabbedPane1.addTab("�߲���", panelC);		
				tabbedPane1.addTab("��Ʒ��", panelE);
				tabbedPane1.addTab("��Ʒ��", panelF);
			}
		});
		menu[4].setText("  ��Ʒ��  ");
		menu[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("��Ʒ��", panelE);
				tabbedPane1.addTab("������", panelA);
				tabbedPane1.addTab("С����",panelB);
				tabbedPane1.addTab("�߲���", panelC);
				tabbedPane1.addTab("��ʳ��", panelD);	
				tabbedPane1.addTab("��Ʒ��", panelF);
			}
		});
		menu[5].setText("  ��Ʒ��  ");
		menu[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("��Ʒ��", panelF);
				tabbedPane1.addTab("������", panelA);
				tabbedPane1.addTab("С����", panelB);
				tabbedPane1.addTab("�߲���", panelC);
				tabbedPane1.addTab("��ʳ��", panelD);
				tabbedPane1.addTab("��Ʒ��", panelE);			
			}
		});
		for(int i=0;i<menu.length;i++) {
			panel.add(menu[i]);
		}
		return panel;
	}
	
	static class MybtnActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			JButton bt=(JButton)e.getSource();
			if(bt==btn1) {
				JDialog log=new JDialog(mainJFrame,"ȡ��",true);
				log.setSize(400,400);
				log.setLocationRelativeTo(null);
				log.setResizable(true);
				log.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				Container container=log.getContentPane();
				container.setLayout(new BorderLayout());
				
				JLabel label=new JLabel("�Ƿ�ȡ��",JLabel.CENTER);
				label.setFont(new Font("����",Font.BOLD,50)); 			
				label.setForeground(Color.red);
				container.add(label,BorderLayout.NORTH);
			
				JPanel Pan=new JPanel();			
				JButton btu1=new JButton("��");		
				btu1.setBackground(Color.CYAN);
				btu1.setForeground(Color.red);
				btu1.setMargin(new Insets(20,40,20,40));            //���ð�ť�Ĵ�С
				
				JButton btu2=new JButton("��");			
				btu2.setBackground(Color.CYAN);	
				btu2.setForeground(Color.red);
				btu2.setMargin(new Insets(20,40,20,40));
				Pan.add(btu1);
				Pan.add(btu2);
				container.add(Pan,BorderLayout.SOUTH);
				btu1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						 cbx.setSelectedItem("��1");
						 tf.setText("");       //tf.setText(null);
						 list.removeAll(); 
						 Label3.setText("�˵��ܶ0��");
						 log.dispose();
					}
				});
				btu2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {												
							log.dispose();						
					}					
				});
				log.setVisible(true);
			}
	else if(bt==btn2) {      
		if((tf.getText().equals(""))||(list.getItemCount()==0)) {                           //����ı���Ϊ�ջ�ûѡ���ʽ����ʾ�����󡱶Ի���û�����ò�������û��ѡ���ʽ��
			   JDialog log2=new JDialog(mainJFrame,"������ʾ",true);
				log2.setSize(400,280);
				log2.setLocationRelativeTo(null);
				log2.setResizable(true);
				log2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				Container container2=log2.getContentPane();	
				container2.setLayout(new BorderLayout());
				
				JLabel text=new JLabel("�ò�����Ϊ�ջ�˵�Ϊ��,������ѡ��",JLabel.CENTER);
				text.setFont(new Font("����",Font.BOLD,20));
				text.setForeground(Color.RED);
				container2.add(text,BorderLayout.CENTER);
						
				JPanel rui=new JPanel();
			
				JButton btn2=new JButton("ȷ��");			
				btn2.setBackground(Color.CYAN);
				btn2.setMargin(new Insets(20,30,20,30));
				rui.add(btn2);
				container2.add(rui,BorderLayout.SOUTH);
				btn2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {	
						log2.dispose();
					}					
				});
				log2.setVisible(true);
		} 
		else {
		        JDialog log1=new JDialog(mainJFrame,"��˵�",true);
				log1.setSize(600,600);
				log1.setLocationRelativeTo(null);
				log1.setResizable(true);
				log1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				
				Container container=log1.getContentPane();	
				GridBagLayout gridbag=new GridBagLayout();
				GridBagConstraints constraints = new GridBagConstraints();
				container.setLayout(gridbag);
				
				constraints.fill = GridBagConstraints.BOTH;                    //�������򶼿�������
				constraints.anchor=GridBagConstraints.NORTH;
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(container, constraints);			     
				
				JLabel mei=new JLabel("������ţ�"+cotmethod());                            //��ȡ���ŵķ���		
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(mei, constraints);
				container.add(mei);
				
				JLabel ting=new JLabel("�������ţ�"+cosmethod());            
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(ting, constraints);
				container.add(ting);
				
				JLabel wang=new JLabel("�ò�������"+tanmethod());
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(wang, constraints);
				container.add(wang);
				
				JLabel text=new JLabel("�ѵ��ʽ�б�");
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(text, constraints);
				container.add(text);
				
				for(int i=0;i<list.getItemCount();i++) {
	    			list2.add(list.getItem(i));			//��list���������Ŀ��ȡ�����ӵ�list2��,ʵ�ֲ�ʽ��Ϣ�����
	    		}
				list2.setFont( new Font("����", Font.BOLD, 20));
		   	    list2.setForeground(Color.CYAN);
				constraints.weightx =0.1;
				constraints.weighty =1.5;
				constraints.fill = GridBagConstraints.BOTH;   //�������򶼿�������
				constraints.anchor=GridBagConstraints.CENTER;
				constraints.gridwidth = GridBagConstraints.REMAINDER;	
				gridbag.setConstraints(list2, constraints);
				container.add(list2);
				
				JLabel text1=new JLabel(Label3.getText());
				constraints.fill = GridBagConstraints.BOTH;
				constraints.weighty =0.01;
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(text1, constraints);
				container.add(text1);
				
				int free=Integer.parseInt(tf.getText())*10;                                      //�����λ��
				JLabel label=new JLabel("��λ�ѣ�"+free+"Ԫ"+"(ÿ��10Ԫ)");
			    constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(label, constraints);
				container.add(label);
				
				int sum=method()+free;				 //�����ܽ��(�˵��ܶ�+��λ��)
				JLabel label1=new JLabel("�ܽ�"+sum+"Ԫ");
			    constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(label1, constraints);
				container.add(label1);	
				
				Date date=new Date();
				DateFormat time=DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
				String abs=time.format(date);                  //��time��ʽ��Ϊʱ���ַ���
				JLabel ing=new JLabel(abs);		
			    constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(ing, constraints);
				container.add(ing);	
				
				JPanel bos=new JPanel();
				bos.setLayout(new FlowLayout());
				JButton btu1=new JButton("ȷ��");
				btu1.setBackground(Color.pink);
				bos.add(btu1);
				JButton btu2=new JButton("����");
				btu2.setBackground(Color.pink);
				bos.add(btu2);
				container.add(bos);
						
				btu1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							BufferedWriter bf=new BufferedWriter(new FileWriter(cbx.getSelectedItem()+".txt"));      //Ĭ��ִ�и��ǲ���
							bf.write(mei.getText()+"\r\n");      //������ţ�"\r\n"��ʾ����					  
							bf.write(ting.getText()+"\r\n");                             //��������					   
							bf.write(wang.getText()+"\r\n");                           //�ò�����						 
							bf.write(text.getText()+"\r\n");                              //�ѵ��ʽ�б�
						for(int i=0;i<=list.getItemCount()-1;i++)         //�����������������Ǵ�0��ʼ��
						bf.write(list.getItem(i)+"\r\n");                   //��ȡ��Ŀ
							bf.write(text1.getText()+"\r\n");               //�˵��ܶ�
							bf.write(label.getText()+"\r\n");                  //��λ��  
							bf.write(label1.getText()+"\r\n");               //�ܽ��
							bf.write(abs+"\r\n");                                                 //ʱ��		  
						    bf.close();					
						    //����ɹ��Ի���
							JDialog dialog=new JDialog(mainJFrame,"����ɹ�",true);
							dialog.setSize(620,500);
							dialog.setLocationRelativeTo(null);
							dialog.setResizable(true);
							dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							Container container=dialog.getContentPane();
							
							JPanel zhang=new JPanel(new BorderLayout());
							zhang.setBackground(Color.CYAN);
							
							JLabel meiting=new JLabel(new ImageIcon("C:\\resource\\��ӭ����.jpg"));
							zhang.add(meiting,BorderLayout.NORTH);
							JLabel label2=new JLabel("��,�˵���Ϊ������ɹ��������ĵȴ�,��ʽ����Ϊ�����ã�",JLabel.CENTER);
							label2.setFont(new Font("����",Font.BOLD,22));
							label2.setForeground(Color.blue);
							zhang.add(label2,BorderLayout.CENTER);
							
							 JPanel rui=new JPanel();
							 JButton hong=new JButton("ȷ��");
				             hong.setForeground(Color.blue);
						     hong.setBackground(Color.pink);
						     hong.setMargin(new Insets(20,30,20,30));                    //���ð�ť��С
							 rui.add(hong);
							 zhang.add(rui,BorderLayout.SOUTH);
							container.add(zhang);
							hong.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {						
										cbx.setSelectedItem("��1");
										 tf.setText(null);       //tf.setText("");
										 list.removeAll(); 
										 Label3.setText("�˵��ܶ0��");
										dialog.dispose();
										log1.dispose();											
								}				
							});
							list.removeAll();
							cbx.setSelectedItem("��1");
							tf.setText("");       //tf.setText(null);
							Label3.setText("�˵��ܶ0��");
					        dialog.setVisible(true);	
						}catch(IOException e1) {
							e1.printStackTrace();
						}
					}					
				});
				btu2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {					
							log1.dispose();										
					}				
				});
				log1.setVisible(true);
				}
	}
		else if(bt==btn3) {
			 JDialog zhr=new JDialog(mainJFrame,"��ѡ������",true);
		        zhr.setSize(320,300);
		        zhr.setLocationRelativeTo(null);
		        zhr.setResizable(true);
				zhr.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				Container container1=zhr.getContentPane();	
				container1.setLayout(new BorderLayout());
				container1.setBackground(Color.CYAN);
			
				JLabel zhr1=new JLabel("��ѡ������:",JLabel.CENTER);			
				zhr1.setFont(new Font("����",Font.BOLD,20));
				zhr1.setForeground(Color.blue);
				container1.add(zhr1,BorderLayout.NORTH);
				
				JPanel love=new JPanel();
				love.setLayout(null);
				cbx.setSize(280, 50);
				love.add(cbx);                                                                        //��ѡ��              
				container1.add(love,BorderLayout.CENTER);
				
				JPanel meiting=new JPanel();
				JButton zhr2=new JButton("ȷ��");
				zhr2.setMargin(new Insets(10,20,10,20));
				zhr2.setBackground(Color.CYAN);
				zhr2.setForeground(Color.blue);
				meiting.add(zhr2);
				container1.add(meiting,BorderLayout.SOUTH);         
				
				zhr2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							zhr.dispose();
							String s;
							list2.removeAll();                               //���Ƴ�list2ԭ�е���Ŀ�ټ����µ���Ŀ
							BufferedReader bf=new BufferedReader(new FileReader(cbx.getSelectedItem()+".txt"));
							while((s=bf.readLine())!=null) {                 //ȷ���ӵ�ʱ���ļ��ж�ȡ��ʽ��Ϣ����
								list2.add(s);						
							}		
							     //ȷ���ӵ�ʱ�����ĶԻ���
								JDialog log1=new JDialog(mainJFrame,"��˵�",false);
								log1.setSize(450,500);
								log1.setLocationRelativeTo(null);
								log1.setResizable(true);
								log1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);							
								Container container=log1.getContentPane();									
								container.setLayout(new BorderLayout());
								
								JLabel mei=new JLabel("���Ĳ˵���");
								mei.setFont(new Font("����",Font.BOLD,20)); 
								mei.setForeground(Color.CYAN);
								container.add(mei,BorderLayout.NORTH);
								
								JScrollPane scrollpane=new JScrollPane(list2);
							    scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
							    container.add(list2,BorderLayout.CENTER);
															
								tf.setEditable(false);           //�ӵ�ʱ�ı���״̬Ϊ���ɱ༭,�Ӳ˲���λ
								
								JPanel bos=new JPanel();
								bos.setLayout(new FlowLayout());
								
								JButton btu1=new JButton("ȷ��");
								btu1.setBackground(Color.pink);
								bos.add(btu1);											
								JButton btu2=new JButton("��ɼӵ�");
								btu2.setBackground(Color.pink);
								bos.add(btu2);
								container.add(bos,BorderLayout.SOUTH);			
								btu1.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent arg0) {
										// TODO �Զ����ɵķ������
								    	if(list.getItemCount()==0) {                        //δ�Ӳ�ʽʱ��ʾ�ĶԻ���
								    		JDialog log1=new JDialog(mainJFrame,"������ʾ",true);
											log1.setSize(300,300);
											log1.setLocationRelativeTo(null);
											log1.setResizable(true);
											log1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);	 
											Container container=log1.getContentPane();	
											container.setLayout(new BorderLayout());
											
											JLabel zhang=new JLabel("��ѡ���Ʒ",JLabel.CENTER);
											zhang.setFont(new Font("����",Font.BOLD,30));
											zhang.setForeground(Color.blue);							     		
											container.add(zhang,BorderLayout.CENTER);
											
											JPanel ong=new JPanel();
											JButton btn=new JButton("ȷ��");			
											btn.setBackground(Color.CYAN);
											btn.setMargin(new Insets(20,30,20,30));
											ong.add(btn);
											container.add(ong,BorderLayout.SOUTH);
											btn.addActionListener(new ActionListener() {
												@Override
												public void actionPerformed(ActionEvent e) {																
														log1.dispose();													
												}					
											});
											log1.setVisible(true);
								    	}
								    	else {                                                         //׷�Ӳ�ʽ
								    		String s1="";
								    		String s2="";
								    		int a1=0,a2=0;
								    		list2.add("\r\n");
								    		list2.add("���ӵ��Ĳ˵�Ϊ��");	
								    		for(int i=0;i<list.getItemCount();i++) {
								    			list2.add(list.getItem(i));			//��list���������Ŀ��ȡ�����ӵ�list��,ʵ�ֲ�ʽ��Ϣ�����
								    		}
								    		for(int i=0;i<list2.getItemCount();i++) {
								    		   if(list2.getItem(i).contains("�ܽ�")==true) {
								    			   String s=list2.getItem(i);         //�Ѱ����ַ���"�ܽ�"����Ŀ��ȡ����
													s=s.trim();			
													for(int j=0;j<s.length();j++) {
														if(s.charAt(j)>=48&&s.charAt(j)<=57) {                //��ȡ�ܽ��,���������0-9֮�䣬���ȡ����
															s1=s1+s.charAt(j);			
															a1=Integer.parseInt(s1);
													}
													}    				
								    		   }					
								    		}
								    		list2.add("�ӵ���"+Label3.getText());//��"�ӵ����˵��ܶ"��ǩ����
								    		list.removeAll();
								    		tf.setText("");
								    		Label3.setText("�˵��ܶ0��");
								    		
								    		for(int k=0;k<list2.getItemCount();k++) {
								     		   if(list2.getItem(k).contains("�ӵ����˵��ܶ")==true) {
								     			   String s=list2.getItem(k);      //�Ѱ����ַ���"�ӵ����˵��ܶ"����Ŀ��ȡ����
								 					s=s.trim();		
								 					for(int j=0;j<s.length();j++) {
								 						if(s.charAt(j)>=48&&s.charAt(j)<=57) {                     //���������0-9֮�䣬���ȡ����
								 							s2=s2+s.charAt(j);				
								 						    a2=Integer.parseInt(s2);
								 					}
								 					}    				
								     		   }					
								     		}
								    		int a=a1+a2;  // �ӵ�����˵��ܽ��=ԭ�˵����ܽ��+�ӵ����˵��ܶ�             
								    		String ting="�ӵ�����˵��ܽ��Ϊ��"+a;
								    		list2.add(ting);
								    		}	
								    	}
								});										
								btu2.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										JButton bt=(JButton)e.getSource();
										if(bt==btu2) {
											try {
												Date date=new Date();
												DateFormat time=DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
												String abs=time.format(date);			
												
												BufferedWriter bf=new BufferedWriter(new FileWriter(cbx.getSelectedItem()+".txt"));      //Ĭ��ִ�и��ǲ���
											for(int i=0;i<list2.getItemCount();i++) 												
												bf.write(list2.getItem(i)+"\r\n");			//�����ļ���Ϣ
											    bf.write("�ӵ�ʱ�䣺"+abs+"\r\n");  
												bf.close();                               //�ر�������
												//�������,��ʾ������ɹ����Ի���
												JDialog dialog=new JDialog(mainJFrame,"����ɹ�",true);
												dialog.setSize(620,500);
												dialog.setLocationRelativeTo(null);
												dialog.setResizable(true);
												dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
												Container container=dialog.getContentPane();
												
												JPanel zhang=new JPanel(new BorderLayout());
												zhang.setBackground(Color.CYAN);
												
												ImageIcon wang=new ImageIcon("images/��ӭ����.jpg");
												JLabel meiting=new JLabel(wang);
												zhang.add(meiting,BorderLayout.NORTH);
												
												JLabel label2=new JLabel("��,�˵���Ϊ���ӵ��ɹ��������ĵȴ�,��ʽ����Ϊ�����ã�",JLabel.CENTER);
												label2.setFont(new Font("����",Font.BOLD,22));
												label2.setForeground(Color.blue);				
												zhang.add(label2,BorderLayout.CENTER);
												
												 JPanel rui=new JPanel();
												 JButton hong=new JButton("ȷ��");
									             hong.setForeground(Color.blue);
											     hong.setBackground(Color.pink);
											     hong.setMargin(new Insets(20,30,20,30));
												 rui.add(hong);
												 zhang.add(rui,BorderLayout.SOUTH);
												container.add(zhang);
												hong.addActionListener(new ActionListener() {
													@Override
													public void actionPerformed(ActionEvent e) {	
														list.removeAll();
														cbx.setSelectedItem("��1");
														tf.setText("");       //tf.setText(null);
														Label3.setText("�˵��ܶ0��");
													    log1.dispose();
														dialog.dispose();			
														mainJFrame.dispose();
													}				
												});
												dialog.setVisible(true);
											}catch (IOException e1) {							
												e1.printStackTrace();
											}
										}					
									}				
								});		
							    cbx.setVisible(true);
								log1.setVisible(true);
								bf.close();                                 //�ر������
															
						} catch (FileNotFoundException e1) {                                        //��try-catch�����ָ�������ݵ�list2��try-catch���			
							    JDialog zhr=new JDialog(mainJFrame,"�ļ��Ҳ����쳣",true);         //��û����ӵ�������,����ʾ�Ի���
						        zhr.setSize(320,300);
						        zhr.setLocationRelativeTo(null);
						        zhr.setResizable(true);
								zhr.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
								Container container1=zhr.getContentPane();	
								container1.setLayout(new BorderLayout());
								
								JLabel text=new JLabel("�ļ��Ҳ����쳣",JLabel.CENTER);
								text.setFont(new Font("����",Font.BOLD,30)); 
								text.setForeground(Color.red);
								container1.add(text, BorderLayout.NORTH);
								
								JPanel meiting=new JPanel();
								JButton zhr2=new JButton("ȷ��");
								zhr2.setMargin(new Insets(10,20,10,20));
								zhr2.setBackground(Color.CYAN);
								zhr2.setForeground(Color.blue);
								meiting.add(zhr2);
								container1.add(meiting,BorderLayout.SOUTH);          
								
								zhr2.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e2) {										
											zhr.dispose();															
									}				
								});
								zhr.setVisible(true);
						}		
						catch (IOException e1) {                      //��try-catch�����ָ�������ݵ�list1��try-catch���					
							e1.printStackTrace();							
						}
					}
				});	
				zhr.setVisible(true);
		}		
		else if(bt==btn4) {                                        //���˰�ť
			JDialog log=new JDialog(mainJFrame,"��ѡ������",true);    //�����һ���Ի���
			log.setSize(320,300);
			log.setLocationRelativeTo(null);
			log.setResizable(true);
			log.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			Container meiting=log.getContentPane();
			meiting.setLayout(new BorderLayout());
			
			JLabel wang=new JLabel("��ѡ������",JLabel.CENTER);
			wang.setFont(new Font("����",Font.BOLD,30)); 
			wang.setForeground(Color.blue);
			meiting.add(wang,BorderLayout.NORTH);
			
			JPanel love=new JPanel();
			love.setLayout(null);
			cbx.setSize(280,50);
			love.add(cbx);                                                                        //��ѡ��              
			meiting.add(love,BorderLayout.CENTER);
			
			JPanel hongrui=new JPanel();
			JButton zhr=new JButton("ȷ��");
			zhr.setMargin(new Insets(10,20,10,20));
			zhr.setBackground(Color.CYAN);
			zhr.setForeground(Color.blue);
			hongrui.add(zhr);
			meiting.add(hongrui,BorderLayout.SOUTH);  
				
			zhr.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO �Զ����ɵķ������
					try {
						log.dispose();                                 //����ڶ����Ի���,�رյ�һ���Ի���
						String s2="";
						int a=0;
						String s;		
						BufferedReader bf=new BufferedReader(new FileReader(cbx.getSelectedItem()+".txt"));
						while((s=bf.readLine())!=null) {
							list1.add(s);						
						}
					for(int k=0;k<list1.getItemCount();k++) {                                      //��ȡ�ӵ�����˵��ܽ��
			     		   if(list1.getItem(k).contains("�ӵ�����˵��ܽ��Ϊ��")==true) {
			     			   String s1=list1.getItem(k);
			 					s1=s1.trim();	 				
			 					for(int j=0;j<s1.length();j++) {
			 						if(s1.charAt(j)>=48&&s1.charAt(j)<=57) {                     //���������0-9֮�䣬���ȡ����
			 							s2=s2+s1.charAt(j);				
			 						    a=Integer.parseInt(s2);
			 					}
			 					}    				
			     		   }					
			     		}			
					JDialog log1=new JDialog(mainJFrame,"�˵��ܶ�",true);          //����ڶ����Ի���
					log1.setSize(500,550);
					log1.setLocationRelativeTo(null);
					log1.setResizable(true);
					log1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					Container meiting=log1.getContentPane();
					meiting.setLayout(new BorderLayout());
					
					JLabel mei=new JLabel("���Ĳ˵���");
					mei.setFont(new Font("����",Font.BOLD,20)); 
					mei.setForeground(Color.CYAN);
					meiting.add(mei,BorderLayout.NORTH);
					
					JPanel p=new JPanel();
					p.add(list1);                                                       //��ʾ��ʽ��Ϣ
					meiting.add(p,BorderLayout.CENTER);
					
					JPanel pan=new JPanel(new BorderLayout());
					
					JLabel wang=new JLabel("�����˵��ܽ��Ϊ��"+a,JLabel.CENTER);
					wang.setFont(new Font("����",Font.BOLD,20)); 
					wang.setForeground(Color.blue);
					pan.add(wang,BorderLayout.CENTER);
									
					JPanel hongrui=new JPanel();
					JButton zhr=new JButton("ȷ��");
					zhr.setMargin(new Insets(10,30,10,30));
					zhr.setBackground(Color.pink);
					zhr.setForeground(Color.CYAN);
					hongrui.add(zhr);
					pan.add(hongrui,BorderLayout.SOUTH);
					meiting.add(pan,BorderLayout.SOUTH);  		
					zhr.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// TODO �Զ����ɵķ������
							log1.dispose();                                 //������������˶Ի���,�رյڶ����Ի���
							JDialog dialog=new JDialog(mainJFrame,"����",true);       //����������Ի���
							dialog.setSize(450,600);
							dialog.setLocationRelativeTo(null);
							dialog.setResizable(true);
							dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							Container container=dialog.getContentPane();
							container.setLayout(new BorderLayout());
							
							JPanel zhang=new JPanel();
							zhang.setBackground(Color.pink);
							JLabel label=new JLabel("��ɨ����ɽ���,лл�ݹ�,��ӭ�´ι���",JLabel.CENTER);
							label.setFont(new Font("����",Font.BOLD,20));
							label.setForeground(Color.blue);
							zhang.add(label);
							container.add(zhang,BorderLayout.NORTH);
							
							JButton picture=new JButton(new ImageIcon("images/��ά��.jpg"));
							container.add(picture,BorderLayout.CENTER);
							
							JPanel rui=new JPanel();
							JButton hong=new JButton("���֧��");
							hong.setMargin(new Insets(10,30,10,30));
							hong.setBackground(Color.pink);
							hong.setForeground(Color.CYAN);
							rui.add(hong);
							container.add(rui,BorderLayout.SOUTH);
							hong.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									cbx.setSelectedItem("��1");
									tf.setText(null);       //tf.setText("");
									list1.removeAll(); 
									Label3.setText("�˵��ܶ0��");
									dialog.dispose();                                          //�رյ������Ի���
//									mainJFrame.dispose();
								}
							});
							dialog.setVisible(true);
						}
					});									
					log1.setVisible(true);
				}catch(IOException e) {
					e.printStackTrace();
					}
				}
			});
			log.setVisible(true);
			}
		}
		private String cotmethod() {	
			Date date=new Date();
			SimpleDateFormat time=new SimpleDateFormat("yyyyMMddHHmmss");
			return time.format(date);	
		}
		private String cosmethod() {
			String str=(String)cbx.getSelectedItem();     //���������б���б�ѡ����Ŀ������
			return str;
		}
		private String tanmethod() {
			return tf.getText();
		}
		private int method() {                          //�����˵��ܶ�
			// TODO �Զ����ɵķ������
			String s=Label3.getText();
			s=s.trim();
			String s1="";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //���������0-9֮�䣬���ȡ����
					s1=s1+s.charAt(i);					
			}
			}       
			int sum=Integer.parseInt(s1);
			return sum;
		}
	}
}
		
	

