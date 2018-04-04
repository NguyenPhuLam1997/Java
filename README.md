# Java
Bài Tập Java
package baith1;
import java.awt.TextField;
import java.awt.*;
import java.awt.Panel;
import java.awt.event.*;
public class BaiTH1 
{
    Button bnNhan,bnChia,bnCong,bnTru;
    TextField txtA, txtB, txtKQ;
    Label lbA, lbB, lbKQ, lbX;
    
    public BaiTH1()
    {
        
        Frame f = new Frame();
        f.setTitle("Bai 1");
        f.setBounds(200,200,300,300);
        f.setLayout(new GridLayout(4,2));
        lbA = new Label("A = ");
        f.add(lbA);
        txtA = new TextField(10);
        f.add(txtA);
        
        
        
        lbB = new Label("B = ");
        f.add(lbB);
        txtB = new TextField(10);
        f.add(txtB);
              
        
        lbKQ = new Label("KQ = ");
        f.add(lbKQ);
        txtKQ = new TextField(20);
        f.add(txtKQ);
        
        
        bnCong = new Button("+");
        bnCong.addActionListener(new LangNgheCong());
        //f.add(bnCong);
        bnNhan = new Button("x");
        bnNhan.addActionListener(new LangNgheNhan());
       // f.add(bnNhan);
        bnTru = new Button("-");
        bnTru.addActionListener(new LangNgheTru());
        //f.add(bnTru);
        bnChia = new Button("/");
        bnChia.addActionListener(new LangNgheChia());
        //f.add(bnChia);
        
        lbX = new Label("Chọn Phép Toán: ");
        f.add(lbX);
//        
        Panel a = new Panel();
        a.add(bnCong);
        a.add(bnNhan);
        a.add(bnChia);
        a.add(bnTru);        
        f.add(a);
        f.setVisible(true);
    }

    class LangNgheChia implements ActionListener
    {
       public void actionPerformed(ActionEvent e) 
        {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int KQ = a / b;
            txtKQ.setText(String.valueOf(KQ));
        }
    }
    class LangNgheTru  implements ActionListener
    {

        public void actionPerformed(ActionEvent e) 
        {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int KQ = a - b;
            txtKQ.setText(String.valueOf(KQ));
        }
    }
    
    class LangNgheCong implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                int KQ = a + b;
                txtKQ.setText(String.valueOf(KQ));
            }
            
        }   
    class LangNgheNhan implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int KQ = a * b;
            txtKQ.setText(String.valueOf(KQ));
        }
        
    }
    public static void main(String[] args) 
    {
        new BaiTH1();
    }
    
}
