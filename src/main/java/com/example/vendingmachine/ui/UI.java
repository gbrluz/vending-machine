package com.example.vendingmachine.ui;


import javax.swing.*;
import java.awt.*;

public class UI {
    private Machine machine;
    private static JTextField textField = new JTextField();

    public UI(Machine machine){
        this.machine = machine;
    }

    public void init() {
        JFrame frame = new JFrame("Vending Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.PAGE_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        context.add(textField);
        context.add(buttons);

        JButton inserirMoeda = new JButton("Inserir Moeda");
        inserirMoeda.addActionListener(e -> textField.setText("Seu pagamento foi recebido, escolha seu produto"));
        frame.setVisible(true);
        frame.setSize(300, 700);
        buttons.add(inserirMoeda);
    }
}
