package hk;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class GUI {

    public static void main(String[] args) {
        new GUI();
    }

    private final JFrame jFrame;

    private int space = 25;
    private int buff = 45;

    private final JPanel toolPanel;

    private final JLabel algLabel = new JLabel("Algorithms");
    private final JLabel toolLabel = new JLabel("Tools");
    private final JLabel sizeLabel = new JLabel("Size");

    public GUI() {

        // temp variables
        var width = 850;
        var height = 650;

        jFrame = new JFrame();
        jFrame.setTitle("Path finding algorithm application by Hassan K");
        jFrame.setVisible(true);
        jFrame.setResizable(true);
        jFrame.setSize(width, height);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().setLayout(null);

        toolPanel = new JPanel();
        toolPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "Controls"));
        toolPanel.setLayout(null);
        toolPanel.setBounds(10, 10, 210, 600);



        jFrame.add(toolPanel);

    }

    private void addButton(JButton button) {
        button.setBounds(40, space, 120, 25);
        toolPanel.add(button);
        space += buff;
    }

}
