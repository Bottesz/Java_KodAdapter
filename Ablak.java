import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ablak extends JFrame implements  ActionListener {
    public Ablak() {
        this.setTitle("Ablak");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(0,0,320,240);
        setVisible(true);
        setLayout(new FlowLayout());

        JButton b = new JButton("bezár");
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
        dispose();
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new Ablak().setVisible(true);
        });
        }

    }

