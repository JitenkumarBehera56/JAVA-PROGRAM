// import java.awt.Button;
// import java.awt.Frame;
// import java.awt.TextField;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// class Event1 extends Frame implements ActionListener
// {
//     TextField f;
//     Event1()
//     {
//         f=new TextField();
//         f.setBounds(60,50,170,20);
//         Button b=new Button("NOTICE");
//         b.setBounds(100,20,80,80);
//         b.addActionListener(this);;
//         add(b);
//         add(f);
//         setSize(300,300);
//         setLayout(null);
//         setVisible(true);
//     }
//     public void ActionPerformed(ActionEvent e)
//     {
//         f.setText("WELCOME");
//     }
//     public static void main(String[] args) 
//     {
//         new Event1();
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         throw new UnsupportedOperationException("Not supported yet.");
//     }
// }

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Event1 extends Frame implements ActionListener {
    TextField f;

    Event1() {  // Constructor name should match the class name
        f = new TextField();
        f.setBounds(60, 50, 170, 20);

        Button b = new Button("NOTICE");
        b.setBounds(100, 120, 80, 30);  // Adjusted coordinates for better layout
        b.addActionListener(this);

        add(b);
        add(f);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {  // Corrected method name
        f.setText("WELCOME");
    }

    public static void main(String[] args) {
        new Event1();
    }
}


    

