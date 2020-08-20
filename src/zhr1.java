
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
	static JCheckBoxMenuItem cbmi1 = new JCheckBoxMenuItem("常规"); // 复选框菜单项
	static JCheckBoxMenuItem cbmi2 = new JCheckBoxMenuItem("粗体"); // 复选框菜单项
	static JCheckBoxMenuItem cbmi3 = new JCheckBoxMenuItem("斜体"); // 复选框菜单项
	static JMenuItem mi1=new JMenuItem("关闭");
	static JMenuItem mi2=new JMenuItem("查看点菜单");
	static JPanel p=new JPanel();                    //创建container北部的面板,用于加入餐厅名字
	static JLabel name=new JLabel("************洪瑞餐厅欢迎您************");
	static JPanel n1=new JPanel();                  //存放首页菜式信息的面板
	
	static JPanel panelA=new JPanel();
	static JButton chA= new JButton("001烧味拼盘￥39",new ImageIcon("images/烧味拼盘.jpg"));
	static JButton chB= new JButton("002酸菜鱼￥59",new ImageIcon("images/酸菜鱼.jpg"));
	static  JButton chC = new JButton("003白切鸡￥49",new ImageIcon("images/白切鸡.jpg"));
	static JButton chD = new JButton("004回锅肉￥28",new ImageIcon("images/回锅肉.jpg"));
	static JButton chE= new JButton("005糖醋排骨￥38",new ImageIcon("images/糖醋排骨.jpg"));
	static JButton chF = new JButton("006铁板牛肉￥39",new ImageIcon("images/铁板牛肉.jpg"));

	static JPanel panelB=new JPanel();
	static JButton chA1 = new JButton("007青椒炒牛肉￥29",new ImageIcon("images/青椒炒牛肉.jpg"));
	static JButton chB1= new JButton("008羊肉炒菜花￥39",new ImageIcon("images/羊肉炒菜花.jpg"));
	static  JButton chC1 = new JButton("009爆炒腊味￥19",new ImageIcon("images/爆炒腊味.jpg"));
	static JButton chD1 = new JButton("010韭菜炒蛋￥18",new ImageIcon("images/韭菜炒蛋.jpg"));
	static JButton chE1= new JButton("011番茄炒蛋￥28",new ImageIcon("images/番茄炒蛋.jpg"));
	static JButton chF1 = new JButton("012鱿鱼炒豆角￥38",new ImageIcon("images/鱿鱼炒豆角.jpg"));
	
	static JPanel panelC=new JPanel();
	static JButton chA2  = new JButton("013菜心￥18",new ImageIcon("images/菜心.jpg"));
	static JButton chB2 = new JButton("014菜花￥19",new ImageIcon("images/菜花.jpg"));
	static JButton chC2 = new JButton("015生菜￥18",new ImageIcon("images/生菜.jpg"));
	static JButton chD2 = new JButton("016韭菜￥18",new ImageIcon("images/韭菜.jpg"));
	static JButton chE2 = new JButton("017丝瓜 ￥18",new ImageIcon("images/丝瓜.jpg"));
	static JButton chF2 = new JButton("018豆角 ￥18",new ImageIcon("images/豆角.jpg"));
     
	static JPanel panelD=new JPanel();
	static JButton chA3  = new JButton("019白饭￥3",new ImageIcon("images/白饭.jpg"));
	static JButton chB3 = new JButton("020白粥￥2",new ImageIcon("images/白粥.jpg"));
	static JButton chC3 = new JButton("021面条￥8",new ImageIcon("images/面条.jpg"));
	static JButton chD3 = new JButton("022混沌￥9",new ImageIcon("images/混沌.jpg"));
	static JButton chE3= new JButton("023汤粉￥8",new ImageIcon("images/汤粉.jpg"));
	static JButton chF3 = new JButton("024扬州炒饭￥12",new ImageIcon("images/扬州炒饭.jpg"));
	
	static JPanel panelE=new JPanel();
	static JButton chA4  = new JButton("025冰镇绿豆沙￥18",new ImageIcon("images/冰镇绿豆沙.jpg"));
	static JButton chB4= new JButton("026椰汁西米露￥19",new ImageIcon("images/椰汁西米露.jpg"));
	static JButton chC4 = new JButton("027巧克力蛋糕￥18",new ImageIcon("images/巧克力蛋糕.jpg"));
	static JButton chD4 = new JButton("028超滑双皮奶￥8",new ImageIcon("images/超滑双皮奶.jpg"));
	static JButton chE4= new JButton("029银耳莲子羹￥18",new ImageIcon("images/银耳莲子羹.jpg"));
	static JButton chF4 = new JButton("030凉水荔枝膏￥9",new ImageIcon("images/凉水荔枝膏.jpg"));
	
	static JPanel panelF=new JPanel();
	static JButton chA5= new JButton("031波霸珍珠奶茶￥10",new ImageIcon("images/波霸珍珠奶茶.jpg"));
	static JButton chB5= new JButton("032特制烤奶￥8",new ImageIcon("images/特制烤奶.jpg"));
	static JButton chC5 = new JButton("033牛奶烧仙草￥8",new ImageIcon("images/牛奶烧仙草.jpg"));
	static JButton chD5 = new JButton("034蜜桃乌龙￥8",new ImageIcon("images/蜜桃乌龙.jpg"));
	static JButton chE5= new JButton("035卡布奇诺￥12",new ImageIcon("images/卡布奇诺.jpg"));
	static JButton chF5 = new JButton("036蜂蜜柚子茶￥9",new ImageIcon("images/蜂蜜柚子茶.jpg"));
	
	static JLabel Label3=new JLabel("账单总额：0￥");
	static JLabel Label=new JLabel("请选择桌号：");
	static JLabel Label1=new JLabel("请输入用餐人数：");
	static String[] data= {"桌1","桌2","桌3","桌4","桌5","桌6","桌7","桌8","桌9","桌10","桌11","桌12"};
	static JComboBox cbx=new JComboBox(data);  //创建具有12个选项的下拉列表框
    static List list = new List(10,true);    //创建一个展示特定行数以及可以选择多个项目的列表
    static List list1=new List(25,true);
    static List list2=new List(25,true);
	static JButton btn1=new JButton("取消");                               //创建四个操作按钮
	static JButton btn2=new JButton("下单");
	static JButton btn3=new JButton("加单");
	static JButton btn4=new JButton("结账");
	static JTextField tf=new JTextField();                                          //创建文本框
	static JLabel cot=new JLabel();                                                     //创建“本单编号”标签
	static JLabel label1=new JLabel("总金额：" +"元");                 //创建“总金额”标签
	public static void main(String[] args) {
		mainJFrame.setTitle("洪瑞餐厅点餐系统");
		mainJFrame.setSize(760,600);		
		mainJFrame.setLocationRelativeTo(null);
		mainJFrame.setResizable(false);
		mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭动作
		Container container=mainJFrame.getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel A=new JPanel(new BorderLayout());      //创建一个面板A,将面板n1加到A的东部,将分层面板tabbedPane1加到A的西部,再将面板A加到container的东部
		JTabbedPane tabbedPane=new JTabbedPane();     //创建一个分层面板tabbedPane,用于存放container东部的按钮
		Component panel=makeMenuPanel();      //调用方法返回一个具有6个选择按钮的面板
		tabbedPane.addTab("菜式导航", panel);
		tabbedPane.setPreferredSize(new Dimension(150,400));//用维度设置tabbedPane的大小
		container.add(tabbedPane,BorderLayout.WEST);       //将tabbedPane加到container的东部
				
		GridBagLayout gridbag=new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		n1.setLayout(gridbag);                                          //设置n1的布局方式
		constraints.fill = GridBagConstraints.BOTH;   //两个方向都可以拉伸
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
		n1.add(Label1);                     //将“请输入用餐人数”标签加入
		
		tf.setColumns(10);                               //设置文本框占10列
		constraints.weightx =1;
		constraints.weighty =0.01;
		gridbag.setConstraints(tf, constraints);
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		n1.add(tf);
		
		JLabel Label2=new JLabel("已点菜式列表：");
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weighty =0.01;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(Label2, constraints);
		n1.add(Label2);
		
        list.setFont( new Font("楷体", Font.BOLD, 20));
   	    list.setForeground(Color.CYAN);
	    JScrollPane scrollpane=new JScrollPane(list);//使list在上下滚动的基础上再添加左右滚动（list只能上下滚动,JScrollPane可以上下左右滚动）
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
		
		panelA.setLayout(new GridLayout(3,2));                       //将panelA设置为网格布局
		chA.setHorizontalTextPosition(JButton.CENTER);      //设置文本相对于图标的水平位置
	    chA.setVerticalTextPosition(JButton.BOTTOM);         //设置文本相对于图标的垂直位置
	    
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
					// TODO 自动生成的方法存根
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("001烧味拼盘")) {       //第二次点按钮时执行
			                index = i;
			                flag = true;
			                break;
			            }
			        }
			        if (flag) {
			            String item = list.getItem(index);
			            int x_index = item.indexOf("X");//将符号"X"的下标获取出来
			            String value = item.substring(x_index + 1);//再获取"X"的下一个子串
			            item = item.substring(0, x_index + 1)+ (Integer.parseInt(value) + 1);//实现菜式数量的显示
			            list.remove(index);
			            list.add(item, index);
			        } else {
			            list.add("001烧味拼盘￥39  X1");		//第一次点按钮时执行
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
					// TODO 自动生成的方法存根
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("002酸菜鱼")) {
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
			            list.add("002酸菜鱼￥59  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
					// TODO 自动生成的方法存根
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("003白切鸡")) {
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
			            list.add("003白切鸡￥49  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
					// TODO 自动生成的方法存根
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("004回锅肉")) {
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
			            list.add("004回锅肉￥28  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
					// TODO 自动生成的方法存根
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("005糖醋排骨")) {
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
			            list.add("005糖醋排骨￥38  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
					// TODO 自动生成的方法存根
					String[] items = list.getItems();
			        boolean flag = false;
			        int index = 0;
			        for (int i = 0; i < items.length; i++) {
			            if (items[i].contains("006铁板牛肉")) {
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
			            list.add("006铁板牛肉￥39  X1");
			        }
			        String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("007青椒炒牛肉")) {
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
	                    list.add("007青椒炒牛肉￥29  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("008羊肉炒菜花")) {
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
	                    list.add("008羊肉炒菜花￥39  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("009爆炒腊味")) {
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
	                    list.add("009爆炒腊味￥19  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("010韭菜炒蛋")) {
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
	                    list.add("010韭菜炒蛋￥18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("011番茄炒蛋")) {
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
	                    list.add("011番茄炒蛋￥28  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("012鱿鱼炒豆角")) {
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
	                    list.add("012鱿鱼炒豆角￥38  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
		                    if (items[i].contains("013 菜心￥18")) {
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
		                    list.add("013 菜心￥18  X1");
		                }
		                String s=Label3.getText();
						s=s.trim();
						String s1="";
						for(int i=0;i<s.length();i++) {
							if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("014 菜花￥19")) {
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
	                    list.add("014 菜花￥19  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("015 生菜￥18")) {
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
	                    list.add("015 生菜￥18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("016 韭菜￥18")) {
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
	                    list.add("016 韭菜￥18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("017 丝瓜￥18")) {
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
	                    list.add("017 丝瓜￥18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("018 豆角￥18")) {
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
	                    list.add("018 豆角￥18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
		                    if (items[i].contains("019白饭￥3")) {
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
		                    list.add("019白饭￥3  X1");
		                }
		                String s=Label3.getText();
						s=s.trim();
						String s1="";
						for(int i=0;i<s.length();i++) {
							if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("020白粥￥2")) {
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
	                    list.add("020白粥￥2  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("021面条￥8")) {
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
	                    list.add("021面条￥8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("022混沌￥9")) {
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
	                    list.add("022混沌￥9  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("023汤粉￥8")) {
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
	                    list.add("023汤粉￥8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("024扬州炒饭￥12")) {
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
	                    list.add("024扬州炒饭￥12  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
		                    if (items[i].contains("025冰镇绿豆沙￥18")) {
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
		                    list.add("025冰镇绿豆沙￥18  X1");
		                }
		                String s=Label3.getText();
						s=s.trim();
						String s1="";
						for(int i=0;i<s.length();i++) {
							if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("026椰汁西米露￥19")) {
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
	                    list.add("026椰汁西米露￥19 X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("027巧克力蛋糕￥18")) {
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
	                    list.add("027巧克力蛋糕￥18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("028超滑双皮奶￥8")) {
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
	                    list.add("028超滑双皮奶￥8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("029银耳莲子羹￥18")) {
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
	                    list.add("029银耳莲子羹￥18  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("030凉水荔枝膏￥9")) {
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
	                    list.add("030凉水荔枝膏￥9  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 9));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
	        panelF.setLayout(new GridLayout(3,2));
		
			 chA5.setHorizontalTextPosition(JButton.CENTER);//设置文本相对于图标的水平位置
		     chA5.setVerticalTextPosition(JButton.BOTTOM);//设置文本相对于图标的垂直位置
		     
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
		                    if (items[i].contains("031波霸珍珠奶茶￥10")) {
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
		                    list.add("031波霸珍珠奶茶￥10  X1");
		                }
		                String s=Label3.getText();
						s=s.trim();
						String s1="";
						for(int i=0;i<s.length();i++) {
							if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("032特制烤奶￥8")) {
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
	                    list.add("032特制烤奶￥8 X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("033牛奶烧仙草￥8")) {
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
	                    list.add("033牛奶烧仙草￥8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("034蜜桃乌龙￥8")) {
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
	                    list.add("034蜜桃乌龙￥8  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("035卡布奇诺￥12")) {
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
	                    list.add("035卡布奇诺￥12  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
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
	                    if (items[i].contains("036蜂蜜柚子茶￥9")) {
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
	                    list.add("036蜂蜜柚子茶￥9  X1");
	                }
	                String s=Label3.getText();
					s=s.trim();
					String s1="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
							s1=s1+s.charAt(i);					
					}
					}       
					 String newValue = String.valueOf((Integer.parseInt(s1) + 9));
			       s = s.replaceAll(s1, newValue);
			       Label3.setText(s);   
	            }
	        });	
		tabbedPane1.addTab("热销类", panelA);
	
		tabbedPane1.addTab("小炒类", panelB);
	
		tabbedPane1.addTab("蔬菜类", panelC);
		
		tabbedPane1.addTab("主食类",panelD);
	
		tabbedPane1.addTab("甜品类",panelE);
	
		tabbedPane1.addTab("饮品类",panelF);
		tabbedPane1.setPreferredSize(new Dimension(400,400));//设置tabbedPane1的大小
		A.add(tabbedPane1,BorderLayout.WEST);       //将分层面板tabbedPane1加到A的西部
	    container.add(A,BorderLayout.EAST);               //将面板A加到container的东部
		
		JPanel n2=new JPanel();
		n2.add(btn1);
		n2.add(btn2);
		n2.add(btn3);
		n2.add(btn4);
		container.add(n2,BorderLayout.SOUTH);   //将面板n2加到container的南部
		btn1.addActionListener(new MybtnActionListener());
		btn2.addActionListener(new MybtnActionListener());
		btn3.addActionListener(new MybtnActionListener());
		btn4.addActionListener(new MybtnActionListener());
		
		p.setSize(800,200);
		p.setBackground(Color.PINK);
		name.setSize(400,150);
		name.setForeground(Color.BLUE);
		p.add(name);
		container.add(p,BorderLayout.NORTH);       //将面板p加到container的北部
		JMenuBar mb = new JMenuBar(); 
		JMenu mn1 = new JMenu("设置餐厅名称字体样式");
		JMenu mn2 = new JMenu("窗口");
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
				state = Font.PLAIN;     //常规
			 if (yn2)
				state = state + Font.BOLD;             //粗体
			 if (yn3)
				state = state + Font.ITALIC;            //斜体
			if (yn1 || yn2 || yn3)
				name.setFont(new Font("楷体_GB2312", state, 30));
			else
				name.setFont(new Font("宋体", Font.PLAIN, 30));
		}
	}
	static class MyZhangActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { // 处理事件的程序代码
			JMenuItem mi = (JMenuItem) e.getSource(); // 取得引发事件的对象
			if (mi==mi1) {
				mainJFrame.dispose(); // 关闭窗口，释放资源
			     System.exit(0);
		}
			if(mi==mi2) {
				Frame f=new Frame("我的点菜单");
				f.setBounds(300, 100, 650, 600);
				TextArea ta=new TextArea();		
				FileDialog open=new FileDialog(mainJFrame,"打开",FileDialog.LOAD);        //查看文件
				open.setVisible(true);
				String dirpath=open.getDirectory();
				String filename=open.getFile();
				if(dirpath==null||filename==null) 
					return;      //空操作
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
							// TODO 自动生成的方法存根
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
		menu[0].setText("热销菜式");
		menu[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("热销类", panelA);
				tabbedPane1.addTab("小炒类", panelB);
				tabbedPane1.addTab("蔬菜类", panelC);
				tabbedPane1.addTab("主食类", panelD);
				tabbedPane1.addTab("甜品类", panelE);
				tabbedPane1.addTab("饮品类", panelF);
			}
		});
		menu[1].setText("  小炒类  ");
		menu[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("小炒类", panelB);
				tabbedPane1.addTab("热销类", panelA);			
				tabbedPane1.addTab("蔬菜类", panelC);
				tabbedPane1.addTab("主食类", panelD);
				tabbedPane1.addTab("甜品类", panelE);
				tabbedPane1.addTab("饮品类", panelF);
			}
		});
		menu[2].setText("  蔬菜类  ");
		menu[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("蔬菜类", panelC);
				tabbedPane1.addTab("热销类", panelA);
				tabbedPane1.addTab("小炒类", panelB);			
				tabbedPane1.addTab("主食类", panelD);
				tabbedPane1.addTab("甜品类", panelE);
				tabbedPane1.addTab("饮品类", panelF);
			}
		});
		menu[3].setText("  主食类  ");
		menu[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("主食类", panelD);
				tabbedPane1.addTab("热销类", panelA);
				tabbedPane1.addTab("小炒类", panelB);
				tabbedPane1.addTab("蔬菜类", panelC);		
				tabbedPane1.addTab("甜品类", panelE);
				tabbedPane1.addTab("饮品类", panelF);
			}
		});
		menu[4].setText("  甜品类  ");
		menu[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("甜品类", panelE);
				tabbedPane1.addTab("热销类", panelA);
				tabbedPane1.addTab("小炒类",panelB);
				tabbedPane1.addTab("蔬菜类", panelC);
				tabbedPane1.addTab("主食类", panelD);	
				tabbedPane1.addTab("饮品类", panelF);
			}
		});
		menu[5].setText("  饮品类  ");
		menu[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.removeAll();
				tabbedPane1.addTab("饮品类", panelF);
				tabbedPane1.addTab("热销类", panelA);
				tabbedPane1.addTab("小炒类", panelB);
				tabbedPane1.addTab("蔬菜类", panelC);
				tabbedPane1.addTab("主食类", panelD);
				tabbedPane1.addTab("甜品类", panelE);			
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
			// TODO 自动生成的方法存根
			JButton bt=(JButton)e.getSource();
			if(bt==btn1) {
				JDialog log=new JDialog(mainJFrame,"取消",true);
				log.setSize(400,400);
				log.setLocationRelativeTo(null);
				log.setResizable(true);
				log.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				Container container=log.getContentPane();
				container.setLayout(new BorderLayout());
				
				JLabel label=new JLabel("是否取消",JLabel.CENTER);
				label.setFont(new Font("宋体",Font.BOLD,50)); 			
				label.setForeground(Color.red);
				container.add(label,BorderLayout.NORTH);
			
				JPanel Pan=new JPanel();			
				JButton btu1=new JButton("是");		
				btu1.setBackground(Color.CYAN);
				btu1.setForeground(Color.red);
				btu1.setMargin(new Insets(20,40,20,40));            //设置按钮的大小
				
				JButton btu2=new JButton("否");			
				btu2.setBackground(Color.CYAN);	
				btu2.setForeground(Color.red);
				btu2.setMargin(new Insets(20,40,20,40));
				Pan.add(btu1);
				Pan.add(btu2);
				container.add(Pan,BorderLayout.SOUTH);
				btu1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						 cbx.setSelectedItem("桌1");
						 tf.setText("");       //tf.setText(null);
						 list.removeAll(); 
						 Label3.setText("账单总额：0￥");
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
		if((tf.getText().equals(""))||(list.getItemCount()==0)) {                           //如果文本框为空或没选择菜式则显示“错误”对话框（没输入用餐人数或没有选择菜式）
			   JDialog log2=new JDialog(mainJFrame,"错误提示",true);
				log2.setSize(400,280);
				log2.setLocationRelativeTo(null);
				log2.setResizable(true);
				log2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				Container container2=log2.getContentPane();	
				container2.setLayout(new BorderLayout());
				
				JLabel text=new JLabel("用餐人数为空或菜单为空,请重新选择",JLabel.CENTER);
				text.setFont(new Font("宋体",Font.BOLD,20));
				text.setForeground(Color.RED);
				container2.add(text,BorderLayout.CENTER);
						
				JPanel rui=new JPanel();
			
				JButton btn2=new JButton("确定");			
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
		        JDialog log1=new JDialog(mainJFrame,"点菜单",true);
				log1.setSize(600,600);
				log1.setLocationRelativeTo(null);
				log1.setResizable(true);
				log1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				
				Container container=log1.getContentPane();	
				GridBagLayout gridbag=new GridBagLayout();
				GridBagConstraints constraints = new GridBagConstraints();
				container.setLayout(gridbag);
				
				constraints.fill = GridBagConstraints.BOTH;                    //两个方向都可以拉伸
				constraints.anchor=GridBagConstraints.NORTH;
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(container, constraints);			     
				
				JLabel mei=new JLabel("本单编号："+cotmethod());                            //获取单号的方法		
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(mei, constraints);
				container.add(mei);
				
				JLabel ting=new JLabel("您的桌号："+cosmethod());            
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(ting, constraints);
				container.add(ting);
				
				JLabel wang=new JLabel("用餐人数："+tanmethod());
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(wang, constraints);
				container.add(wang);
				
				JLabel text=new JLabel("已点菜式列表：");
				constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(text, constraints);
				container.add(text);
				
				for(int i=0;i<list.getItemCount();i++) {
	    			list2.add(list.getItem(i));			//把list里的所有项目获取出来加到list2中,实现菜式信息的添加
	    		}
				list2.setFont( new Font("楷体", Font.BOLD, 20));
		   	    list2.setForeground(Color.CYAN);
				constraints.weightx =0.1;
				constraints.weighty =1.5;
				constraints.fill = GridBagConstraints.BOTH;   //两个方向都可以拉伸
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
				
				int free=Integer.parseInt(tf.getText())*10;                                      //计算茶位费
				JLabel label=new JLabel("茶位费："+free+"元"+"(每人10元)");
			    constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(label, constraints);
				container.add(label);
				
				int sum=method()+free;				 //计算总金额(账单总额+茶位费)
				JLabel label1=new JLabel("总金额："+sum+"元");
			    constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(label1, constraints);
				container.add(label1);	
				
				Date date=new Date();
				DateFormat time=DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
				String abs=time.format(date);                  //将time格式化为时间字符串
				JLabel ing=new JLabel(abs);		
			    constraints.gridwidth = GridBagConstraints.REMAINDER;
				gridbag.setConstraints(ing, constraints);
				container.add(ing);	
				
				JPanel bos=new JPanel();
				bos.setLayout(new FlowLayout());
				JButton btu1=new JButton("确定");
				btu1.setBackground(Color.pink);
				bos.add(btu1);
				JButton btu2=new JButton("返回");
				btu2.setBackground(Color.pink);
				bos.add(btu2);
				container.add(bos);
						
				btu1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							BufferedWriter bf=new BufferedWriter(new FileWriter(cbx.getSelectedItem()+".txt"));      //默认执行覆盖操作
							bf.write(mei.getText()+"\r\n");      //本单编号，"\r\n"表示换行					  
							bf.write(ting.getText()+"\r\n");                             //您的桌号					   
							bf.write(wang.getText()+"\r\n");                           //用餐人数						 
							bf.write(text.getText()+"\r\n");                              //已点菜式列表
						for(int i=0;i<=list.getItemCount()-1;i++)         //行索引和列索引都是从0开始的
						bf.write(list.getItem(i)+"\r\n");                   //获取项目
							bf.write(text1.getText()+"\r\n");               //账单总额
							bf.write(label.getText()+"\r\n");                  //茶位费  
							bf.write(label1.getText()+"\r\n");               //总金额
							bf.write(abs+"\r\n");                                                 //时间		  
						    bf.close();					
						    //保存成功对话框
							JDialog dialog=new JDialog(mainJFrame,"保存成功",true);
							dialog.setSize(620,500);
							dialog.setLocationRelativeTo(null);
							dialog.setResizable(true);
							dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							Container container=dialog.getContentPane();
							
							JPanel zhang=new JPanel(new BorderLayout());
							zhang.setBackground(Color.CYAN);
							
							JLabel meiting=new JLabel(new ImageIcon("C:\\resource\\欢迎光临.jpg"));
							zhang.add(meiting,BorderLayout.NORTH);
							JLabel label2=new JLabel("亲,菜单已为您保存成功！请耐心等待,菜式马上为您做好！",JLabel.CENTER);
							label2.setFont(new Font("宋体",Font.BOLD,22));
							label2.setForeground(Color.blue);
							zhang.add(label2,BorderLayout.CENTER);
							
							 JPanel rui=new JPanel();
							 JButton hong=new JButton("确定");
				             hong.setForeground(Color.blue);
						     hong.setBackground(Color.pink);
						     hong.setMargin(new Insets(20,30,20,30));                    //设置按钮大小
							 rui.add(hong);
							 zhang.add(rui,BorderLayout.SOUTH);
							container.add(zhang);
							hong.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {						
										cbx.setSelectedItem("桌1");
										 tf.setText(null);       //tf.setText("");
										 list.removeAll(); 
										 Label3.setText("账单总额：0￥");
										dialog.dispose();
										log1.dispose();											
								}				
							});
							list.removeAll();
							cbx.setSelectedItem("桌1");
							tf.setText("");       //tf.setText(null);
							Label3.setText("账单总额：0￥");
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
			 JDialog zhr=new JDialog(mainJFrame,"请选择桌号",true);
		        zhr.setSize(320,300);
		        zhr.setLocationRelativeTo(null);
		        zhr.setResizable(true);
				zhr.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				Container container1=zhr.getContentPane();	
				container1.setLayout(new BorderLayout());
				container1.setBackground(Color.CYAN);
			
				JLabel zhr1=new JLabel("请选择桌号:",JLabel.CENTER);			
				zhr1.setFont(new Font("宋体",Font.BOLD,20));
				zhr1.setForeground(Color.blue);
				container1.add(zhr1,BorderLayout.NORTH);
				
				JPanel love=new JPanel();
				love.setLayout(null);
				cbx.setSize(280, 50);
				love.add(cbx);                                                                        //复选框              
				container1.add(love,BorderLayout.CENTER);
				
				JPanel meiting=new JPanel();
				JButton zhr2=new JButton("确定");
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
							list2.removeAll();                               //先移除list2原有的项目再加入新的项目
							BufferedReader bf=new BufferedReader(new FileReader(cbx.getSelectedItem()+".txt"));
							while((s=bf.readLine())!=null) {                 //确定加单时从文件中读取菜式信息出来
								list2.add(s);						
							}		
							     //确定加单时产生的对话框
								JDialog log1=new JDialog(mainJFrame,"点菜单",false);
								log1.setSize(450,500);
								log1.setLocationRelativeTo(null);
								log1.setResizable(true);
								log1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);							
								Container container=log1.getContentPane();									
								container.setLayout(new BorderLayout());
								
								JLabel mei=new JLabel("您的菜单：");
								mei.setFont(new Font("宋体",Font.BOLD,20)); 
								mei.setForeground(Color.CYAN);
								container.add(mei,BorderLayout.NORTH);
								
								JScrollPane scrollpane=new JScrollPane(list2);
							    scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
							    container.add(list2,BorderLayout.CENTER);
															
								tf.setEditable(false);           //加单时文本框状态为不可编辑,加菜不加位
								
								JPanel bos=new JPanel();
								bos.setLayout(new FlowLayout());
								
								JButton btu1=new JButton("确定");
								btu1.setBackground(Color.pink);
								bos.add(btu1);											
								JButton btu2=new JButton("完成加单");
								btu2.setBackground(Color.pink);
								bos.add(btu2);
								container.add(bos,BorderLayout.SOUTH);			
								btu1.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent arg0) {
										// TODO 自动生成的方法存根
								    	if(list.getItemCount()==0) {                        //未加菜式时显示的对话框
								    		JDialog log1=new JDialog(mainJFrame,"错误提示",true);
											log1.setSize(300,300);
											log1.setLocationRelativeTo(null);
											log1.setResizable(true);
											log1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);	 
											Container container=log1.getContentPane();	
											container.setLayout(new BorderLayout());
											
											JLabel zhang=new JLabel("请选择菜品",JLabel.CENTER);
											zhang.setFont(new Font("宋体",Font.BOLD,30));
											zhang.setForeground(Color.blue);							     		
											container.add(zhang,BorderLayout.CENTER);
											
											JPanel ong=new JPanel();
											JButton btn=new JButton("确定");			
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
								    	else {                                                         //追加菜式
								    		String s1="";
								    		String s2="";
								    		int a1=0,a2=0;
								    		list2.add("\r\n");
								    		list2.add("您加单的菜单为：");	
								    		for(int i=0;i<list.getItemCount();i++) {
								    			list2.add(list.getItem(i));			//把list里的所有项目获取出来加到list中,实现菜式信息的添加
								    		}
								    		for(int i=0;i<list2.getItemCount();i++) {
								    		   if(list2.getItem(i).contains("总金额：")==true) {
								    			   String s=list2.getItem(i);         //把包含字符串"总金额："的项目获取出来
													s=s.trim();			
													for(int j=0;j<s.length();j++) {
														if(s.charAt(j)>=48&&s.charAt(j)<=57) {                //获取总金额,如果数字在0-9之间，则获取出来
															s1=s1+s.charAt(j);			
															a1=Integer.parseInt(s1);
													}
													}    				
								    		   }					
								    		}
								    		list2.add("加单的"+Label3.getText());//把"加单的账单总额："标签加入
								    		list.removeAll();
								    		tf.setText("");
								    		Label3.setText("账单总额：0￥");
								    		
								    		for(int k=0;k<list2.getItemCount();k++) {
								     		   if(list2.getItem(k).contains("加单的账单总额：")==true) {
								     			   String s=list2.getItem(k);      //把包含字符串"加单的账单总额："的项目获取出来
								 					s=s.trim();		
								 					for(int j=0;j<s.length();j++) {
								 						if(s.charAt(j)>=48&&s.charAt(j)<=57) {                     //如果数字在0-9之间，则获取出来
								 							s2=s2+s.charAt(j);				
								 						    a2=Integer.parseInt(s2);
								 					}
								 					}    				
								     		   }					
								     		}
								    		int a=a1+a2;  // 加单后的账单总金额=原菜单的总金额+加单的账单总额             
								    		String ting="加单后的账单总金额为："+a;
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
												
												BufferedWriter bf=new BufferedWriter(new FileWriter(cbx.getSelectedItem()+".txt"));      //默认执行覆盖操作
											for(int i=0;i<list2.getItemCount();i++) 												
												bf.write(list2.getItem(i)+"\r\n");			//更新文件信息
											    bf.write("加单时间："+abs+"\r\n");  
												bf.close();                               //关闭输入流
												//更新完毕,显示“保存成功”对话框
												JDialog dialog=new JDialog(mainJFrame,"保存成功",true);
												dialog.setSize(620,500);
												dialog.setLocationRelativeTo(null);
												dialog.setResizable(true);
												dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
												Container container=dialog.getContentPane();
												
												JPanel zhang=new JPanel(new BorderLayout());
												zhang.setBackground(Color.CYAN);
												
												ImageIcon wang=new ImageIcon("images/欢迎光临.jpg");
												JLabel meiting=new JLabel(wang);
												zhang.add(meiting,BorderLayout.NORTH);
												
												JLabel label2=new JLabel("亲,菜单已为您加单成功！请耐心等待,菜式马上为您做好！",JLabel.CENTER);
												label2.setFont(new Font("宋体",Font.BOLD,22));
												label2.setForeground(Color.blue);				
												zhang.add(label2,BorderLayout.CENTER);
												
												 JPanel rui=new JPanel();
												 JButton hong=new JButton("确定");
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
														cbx.setSelectedItem("桌1");
														tf.setText("");       //tf.setText(null);
														Label3.setText("账单总额：0￥");
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
								bf.close();                                 //关闭输出流
															
						} catch (FileNotFoundException e1) {                                        //此try-catch语句是指读入数据到list2的try-catch语句			
							    JDialog zhr=new JDialog(mainJFrame,"文件找不到异常",true);         //若没有需加单的桌号,则显示对话框
						        zhr.setSize(320,300);
						        zhr.setLocationRelativeTo(null);
						        zhr.setResizable(true);
								zhr.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
								Container container1=zhr.getContentPane();	
								container1.setLayout(new BorderLayout());
								
								JLabel text=new JLabel("文件找不到异常",JLabel.CENTER);
								text.setFont(new Font("宋体",Font.BOLD,30)); 
								text.setForeground(Color.red);
								container1.add(text, BorderLayout.NORTH);
								
								JPanel meiting=new JPanel();
								JButton zhr2=new JButton("确定");
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
						catch (IOException e1) {                      //此try-catch语句是指读入数据到list1的try-catch语句					
							e1.printStackTrace();							
						}
					}
				});	
				zhr.setVisible(true);
		}		
		else if(bt==btn4) {                                        //结账按钮
			JDialog log=new JDialog(mainJFrame,"请选择桌号",true);    //进入第一个对话框
			log.setSize(320,300);
			log.setLocationRelativeTo(null);
			log.setResizable(true);
			log.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			Container meiting=log.getContentPane();
			meiting.setLayout(new BorderLayout());
			
			JLabel wang=new JLabel("请选择桌号",JLabel.CENTER);
			wang.setFont(new Font("宋体",Font.BOLD,30)); 
			wang.setForeground(Color.blue);
			meiting.add(wang,BorderLayout.NORTH);
			
			JPanel love=new JPanel();
			love.setLayout(null);
			cbx.setSize(280,50);
			love.add(cbx);                                                                        //复选框              
			meiting.add(love,BorderLayout.CENTER);
			
			JPanel hongrui=new JPanel();
			JButton zhr=new JButton("确定");
			zhr.setMargin(new Insets(10,20,10,20));
			zhr.setBackground(Color.CYAN);
			zhr.setForeground(Color.blue);
			hongrui.add(zhr);
			meiting.add(hongrui,BorderLayout.SOUTH);  
				
			zhr.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO 自动生成的方法存根
					try {
						log.dispose();                                 //进入第二个对话框,关闭第一个对话框
						String s2="";
						int a=0;
						String s;		
						BufferedReader bf=new BufferedReader(new FileReader(cbx.getSelectedItem()+".txt"));
						while((s=bf.readLine())!=null) {
							list1.add(s);						
						}
					for(int k=0;k<list1.getItemCount();k++) {                                      //获取加单后的账单总金额
			     		   if(list1.getItem(k).contains("加单后的账单总金额为：")==true) {
			     			   String s1=list1.getItem(k);
			 					s1=s1.trim();	 				
			 					for(int j=0;j<s1.length();j++) {
			 						if(s1.charAt(j)>=48&&s1.charAt(j)<=57) {                     //如果数字在0-9之间，则获取出来
			 							s2=s2+s1.charAt(j);				
			 						    a=Integer.parseInt(s2);
			 					}
			 					}    				
			     		   }					
			     		}			
					JDialog log1=new JDialog(mainJFrame,"账单总额",true);          //进入第二个对话框
					log1.setSize(500,550);
					log1.setLocationRelativeTo(null);
					log1.setResizable(true);
					log1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					Container meiting=log1.getContentPane();
					meiting.setLayout(new BorderLayout());
					
					JLabel mei=new JLabel("您的菜单：");
					mei.setFont(new Font("宋体",Font.BOLD,20)); 
					mei.setForeground(Color.CYAN);
					meiting.add(mei,BorderLayout.NORTH);
					
					JPanel p=new JPanel();
					p.add(list1);                                                       //显示菜式信息
					meiting.add(p,BorderLayout.CENTER);
					
					JPanel pan=new JPanel(new BorderLayout());
					
					JLabel wang=new JLabel("您的账单总金额为："+a,JLabel.CENTER);
					wang.setFont(new Font("宋体",Font.BOLD,20)); 
					wang.setForeground(Color.blue);
					pan.add(wang,BorderLayout.CENTER);
									
					JPanel hongrui=new JPanel();
					JButton zhr=new JButton("确定");
					zhr.setMargin(new Insets(10,30,10,30));
					zhr.setBackground(Color.pink);
					zhr.setForeground(Color.CYAN);
					hongrui.add(zhr);
					pan.add(hongrui,BorderLayout.SOUTH);
					meiting.add(pan,BorderLayout.SOUTH);  		
					zhr.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							// TODO 自动生成的方法存根
							log1.dispose();                                 //进入第三个结账对话框,关闭第二个对话框
							JDialog dialog=new JDialog(mainJFrame,"结账",true);       //进入第三个对话框
							dialog.setSize(450,600);
							dialog.setLocationRelativeTo(null);
							dialog.setResizable(true);
							dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							Container container=dialog.getContentPane();
							container.setLayout(new BorderLayout());
							
							JPanel zhang=new JPanel();
							zhang.setBackground(Color.pink);
							JLabel label=new JLabel("请扫码完成结账,谢谢惠顾,欢迎下次光临",JLabel.CENTER);
							label.setFont(new Font("宋体",Font.BOLD,20));
							label.setForeground(Color.blue);
							zhang.add(label);
							container.add(zhang,BorderLayout.NORTH);
							
							JButton picture=new JButton(new ImageIcon("images/二维码.jpg"));
							container.add(picture,BorderLayout.CENTER);
							
							JPanel rui=new JPanel();
							JButton hong=new JButton("完成支付");
							hong.setMargin(new Insets(10,30,10,30));
							hong.setBackground(Color.pink);
							hong.setForeground(Color.CYAN);
							rui.add(hong);
							container.add(rui,BorderLayout.SOUTH);
							hong.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									cbx.setSelectedItem("桌1");
									tf.setText(null);       //tf.setText("");
									list1.removeAll(); 
									Label3.setText("账单总额：0￥");
									dialog.dispose();                                          //关闭第三个对话框
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
			String str=(String)cbx.getSelectedItem();     //返回下拉列表框中被选中项目的名称
			return str;
		}
		private String tanmethod() {
			return tf.getText();
		}
		private int method() {                          //计算账单总额
			// TODO 自动生成的方法存根
			String s=Label3.getText();
			s=s.trim();
			String s1="";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>=48&&s.charAt(i)<=57) {                     //如果数字在0-9之间，则获取出来
					s1=s1+s.charAt(i);					
			}
			}       
			int sum=Integer.parseInt(s1);
			return sum;
		}
	}
}
		
	

