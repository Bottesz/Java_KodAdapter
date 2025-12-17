import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        JFrame f = new JFrame("Ablak");
        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        f.setBounds(0,0,320,240);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JButton b = new JButton("bezár");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();// ha nincsakkor exit.onclose
                System.exit(0);
            }
        });
        f.add(b);



    }
}