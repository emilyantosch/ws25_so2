package Lecture06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    public HelloWorld() {
        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 1));

        JLabel label1 = new JLabel("Hello World!", JLabel.CENTER);

        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setVerticalAlignment(JLabel.BOTTOM);

        JLabel label2 = new JLabel("Goodbye World!");

        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setBorder(BorderFactory.createEtchedBorder(Color.ORANGE, Color.RED));

        Container contentPane = frame.getContentPane();
        contentPane.add(label1);
        contentPane.add(label2);

        Button testButton = new Button("Test");
        testButton.addActionListener(new ButtonEvent());
        contentPane.add(testButton);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem openFileMenuItem = new JMenuItem("Open File...");
        JMenuItem openOnlineHelpPageMenuItem = new JMenuItem("Open Online Help");

        fileMenu.add(openFileMenuItem);
        helpMenu.add(openOnlineHelpPageMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorld();

    }
}

class ButtonEvent implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("Button has been pressed");
    }
}
