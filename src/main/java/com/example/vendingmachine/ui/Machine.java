package com.example.vendingmachine.ui;

import com.example.vendingmachine.machine.Product;
import com.example.vendingmachine.machine.Stock;

public class Machine {
    private Stock stock;

    private static final String START_UP_MESSAGE = "INSIRA MOEDA";
    private String message = START_UP_MESSAGE;

    public Machine(){
        this.stock = new Stock();
    }

    public void inserirProdutos(String name, int cansToAdd){
        inserirProduto();
    }

    public void comprarProduto(String produto){

    }

    public void inserirMoeda() {

    }

    public void despejarProduto() {

    }

    public void acionarManutencao() {

    }

    public void terminarManutencao() {

    }

    public void inserirProduto() {

    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
