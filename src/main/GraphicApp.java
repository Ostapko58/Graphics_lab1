package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicApp {
    private JFrame frame;
    private GraphicPanel graphicPanel;

    public GraphicApp(){
        createFrame();
        initElements();
    }

    private void createFrame() {
        frame = new JFrame("Lab");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void show(){
        frame.setVisible(true);
    }

    private void initElements() {
        Container mainContainer = frame.getContentPane();
        //mainContainer.setLayout(new BorderLayout());

        graphicPanel = new GraphicPanel();
        //graphicPanel.setBackground(Color.WHITE);
        mainContainer.add(graphicPanel);
    }
}