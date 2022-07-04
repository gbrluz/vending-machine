package com.example.vendingmachine.ui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UI extends JFrame {
    Machine machine = new Machine();
    JTextField messageField = new JTextField(machine.getMessage());
    JTextField coinsMessageField = new JTextField((machine.getCoinsMessage()));
    JTextField cocaStockField = new JTextField(machine.getCocaColaStock());
    JTextField cocaSoldField = new JTextField(machine.getCocaColaSold());
    JTextField guaranaStockField = new JTextField(machine.getGuranaStock());
    JTextField guaranaSoldField = new JTextField(machine.getGuaranaSold());
    JTextField spriteStockField = new JTextField(machine.getSpriteStock());
    JTextField spriteSoldField = new JTextField(machine.getSpriteSold());
    JTextField snackStockField = new JTextField(machine.getSnackStock());
    JTextField snackSoldField = new JTextField(machine.getSnackSold());

    public UI(Machine machine){
        this.machine=machine;
    }

    public void init (){
        updateFields();
        JFrame frame = new JFrame("Vending Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel context = new JPanel();
        context.setLayout(new GridLayout(7,1 ));
        frame.getContentPane().add(context);
        context.setBackground(Color.LIGHT_GRAY);

        JButton cocaCola = new JButton("COCA-COLA");
        cocaCola.addActionListener(e -> {
            machine.comprarProduto(machine.getProduct(0).getName());
            updateFields();
        });


        JButton guarana = new JButton("GUARANÁ");
        guarana.addActionListener(e -> {
            machine.comprarProduto(machine.getProduct(1).getName());
            updateFields();
        });

        JButton sprite = new JButton("SPRITE");
        sprite.addActionListener(e -> {
            machine.comprarProduto(machine.getProduct(2).getName());
            updateFields();
        });

        JButton snack = new JButton("SNACK");
        snack.addActionListener(e -> {
            machine.comprarProduto(machine.getProduct(3).getName());
            updateFields();
        });

        cocaCola.setBounds(200,40,100,40);
        guarana.setBounds(200,80,100,40);
        sprite.setBounds(200,120,100,40);
        snack.setBounds(200,160,100,40);

        JButton inserirMoeda = new JButton("INSERIR MOEDA");
        inserirMoeda.addActionListener(e -> {
            machine.inserirMoeda();
            updateFields();
        });

        JButton modoAdmin = new JButton("Entrar no modo administrador");
        modoAdmin.addActionListener(e -> {
            createAdminPanel();
        });

        messageField.setHorizontalAlignment(JTextField.CENTER);
        messageField.setFont(new Font("Tahoma", Font.BOLD, 15));
        messageField.setBackground(null);
        messageField.setBorder(null);
        coinsMessageField.setHorizontalAlignment(JTextField.CENTER);
        coinsMessageField.setFont(new Font("Tahoma", Font.BOLD, 15));

        JPanel buttons = new JPanel();

        buttons.add(cocaCola);
        buttons.add(guarana);
        buttons.add(sprite);
        buttons.add(snack);

        context.add(messageField);
        context.add(buttons);
        context.add(new JLabel(""));
        context.add(inserirMoeda);
        context.add(coinsMessageField);
        context.add(new JLabel(""));
        context.add(modoAdmin);





        frame.setSize(900,800);
        frame.setVisible(true);




    }

    public JPanel createAdminPanel(){
        JFrame frame = new JFrame("Modo ADMINISTRADOR");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel admin = new JPanel();
        admin.setLayout(new GridLayout(10,3 ));
        admin.setBackground(Color.blue);

        frame.add(admin);
        frame.setVisible(true);
        frame.pack();
        frame.setSize(600,600);


        JTextField cocaCola = new JTextField(machine.getStock().get(0).getName());
        JTextField cocaColaStock = new JTextField(machine.getCocaColaStock());
        JTextField cocaColaSold = new JTextField(machine.getCocaColaSold());
        cocaCola.setFont(new Font("Tahoma", Font.BOLD, 20));

        cocaCola.setHorizontalAlignment(SwingConstants.CENTER);
        cocaColaStock.setHorizontalAlignment(SwingConstants.CENTER);
        cocaColaSold.setHorizontalAlignment(SwingConstants.CENTER);

        admin.add(cocaCola);
        admin.add(cocaColaStock);
        admin.add(cocaColaSold);

        JTextField guarana = new JTextField(machine.getStock().get(1).getName());
        JTextField guaranaStock = new JTextField(machine.getGuranaStock());
        JTextField guaranaSold = new JTextField(machine.getGuaranaSold());
        guarana.setFont(new Font("Tahoma", Font.BOLD, 20));

        guarana.setHorizontalAlignment(SwingConstants.CENTER);
        guaranaStock.setHorizontalAlignment(SwingConstants.CENTER);
        guaranaSold.setHorizontalAlignment(SwingConstants.CENTER);

        admin.add(guarana);
        admin.add(guaranaStock);
        admin.add(guaranaSold);

        JTextField sprite = new JTextField(machine.getStock().get(2).getName());
        JTextField spriteStock = new JTextField(machine.getSpriteStock());
        JTextField spriteSold = new JTextField(machine.getSpriteSold());
        sprite.setFont(new Font("Tahoma", Font.BOLD, 20));

        sprite.setHorizontalAlignment(SwingConstants.CENTER);
        spriteStock.setHorizontalAlignment(SwingConstants.CENTER);
        spriteSold.setHorizontalAlignment(SwingConstants.CENTER);

        admin.add(sprite);
        admin.add(spriteStock);
        admin.add(spriteSold);

        JTextField snack = new JTextField(machine.getStock().get(3).getName());
        JTextField snackStock = new JTextField(machine.getSnackStock());
        JTextField snackSold = new JTextField(machine.getSnackSold());
        snack.setFont(new Font("Tahoma", Font.BOLD, 20));

        snack.setHorizontalAlignment(SwingConstants.CENTER);
        snackStock.setHorizontalAlignment(SwingConstants.CENTER);
        snackSold.setHorizontalAlignment(SwingConstants.CENTER);

        admin.add(snack);
        admin.add(snackStock);
        admin.add(snackSold);

        JButton acionarManutencao = new JButton("Acionar Manutenção");
        acionarManutencao.addActionListener(e -> {
            machine.acionarManutencao();
            updateFields();
        });

        JButton terminarManutencao = new JButton("Finalizar Manutenção");
        terminarManutencao.addActionListener(e -> {
            machine.terminarManutencao();
            updateFields();
        });

        JButton inserirCocaCola = new JButton("Inserir Coca-Cola");
        inserirCocaCola.addActionListener(e -> {
            machine.inserirProdutos(machine.getProduct(0).getName(),1);
            updateFields();
        });

        JButton inserirGuarana = new JButton("Inserir Guaraná");
        inserirGuarana.addActionListener(e -> {
            machine.inserirProdutos(machine.getProduct(1).getName(),1);
            updateFields();
        });

        JButton inserirSprite = new JButton("Inserir Sprite");
        inserirSprite.addActionListener(e -> {
            machine.inserirProdutos(machine.getProduct(2).getName(),1);
            updateFields();
        });

        JButton inserirSnack = new JButton("Inserir Snack");
        inserirSnack.addActionListener(e -> {
            machine.inserirProdutos(machine.getProduct(3).getName(),1);
            updateFields();
        });

        admin.add(new JLabel(""));
        admin.add(new JLabel(""));
        admin.add(new JLabel(""));

        admin.add(acionarManutencao);
        admin.add(new JLabel(""));
        admin.add(terminarManutencao);
        admin.add(new JLabel(""));
        admin.add(inserirCocaCola);
        admin.add(new JLabel(""));
        admin.add(new JLabel(""));
        admin.add(inserirGuarana);
        admin.add(new JLabel(""));
        admin.add(new JLabel(""));
        admin.add(inserirSprite);
        admin.add(new JLabel(""));
        admin.add(new JLabel(""));
        admin.add(inserirSnack);
        admin.add(new JLabel(""));

        return admin;
    }

    public void updateFields(){
        messageField.setText(machine.getMessage());
        coinsMessageField.setText(machine.getCoinsMessage());
        cocaSoldField.setText(machine.getCocaColaSold());
        cocaStockField.setText(machine.getCocaColaStock());
        guaranaStockField.setText(machine.getGuranaStock());
        guaranaSoldField.setText(machine.getGuaranaSold());
        spriteStockField.setText(machine.getSpriteStock());
        spriteSoldField.setText(machine.getSpriteSold());
        snackStockField.setText(machine.getSnackStock());
        snackSoldField.setText(machine.getSnackSold());

    }

}
