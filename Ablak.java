import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ablak extends JFrame implements  ActionListener {

    private JButton b1,b2;

    public Ablak() {
        this.setTitle("Ablak");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(0,0,320,240);
        setVisible(true);
        setLayout(new FlowLayout());

        JButton b1 = new JButton("bezár");
        JButton b2 = new JButton("megnyit");

        b1.addActionListener(this);
        b2.addActionListener(this);



        JButton b = new JButton();
        b.addActionListener(this);
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.dispose();// ha nincs akkor exit.onclose
//                System.exit(0);
//            }
//        });
        add(b);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if ( src == b1){
            dispose();
            System.exit(0);
        }else{
            System.out.println("megnyitas folyamatban");
        }


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new Ablak().setVisible(true);
        });
        }

    }

