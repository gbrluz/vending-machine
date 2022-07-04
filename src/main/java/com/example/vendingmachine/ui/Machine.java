package com.example.vendingmachine.ui;

import com.example.vendingmachine.machine.Charge;
import com.example.vendingmachine.machine.Product;
import com.example.vendingmachine.machine.Stock;

public class Machine {
    private Stock stock = new Stock();
    private Charge charge;

    private static final String START_UP_MESSAGE = "INSIRA MOEDA";
    private String message = START_UP_MESSAGE;
    private String coinsMessage = "NUMERO DE MOEDAS NA MÁQUINA: 0";

    private String cocaColaStock= "ESTOQUE ATUAL: "+ stock.get(0).getStockAmount();
    private String cocaColaSold="PRODUTOS VENDIDOS: "+stock.get(0).getProductsSold();

    private String guranaStock="ESTOQUE ATUAL: "+ stock.get(1).getStockAmount();
    private String guaranaSold="PRODUTOS VENDIDOS: "+stock.get(1).getProductsSold();

    private String spriteStock="ESTOQUE ATUAL: "+ stock.get(2).getStockAmount();
    private String spriteSold="PRODUTOS VENDIDOS: "+stock.get(2).getProductsSold();

    private String snackStock="ESTOQUE ATUAL: "+ stock.get(3).getStockAmount();
    private String snackSold="PRODUTOS VENDIDOS: "+stock.get(3).getProductsSold();

    public String getCocaColaStock() {
        return cocaColaStock;
    }

    public void setCocaColaStock(String cocaColaStock) {
        this.cocaColaStock = cocaColaStock;
    }

    public String getCocaColaSold() {
        return cocaColaSold;
    }

    public void setCocaColaSold(String cocaColaSold) {
        this.cocaColaSold = cocaColaSold;
    }

    public String getGuranaStock() {
        return guranaStock;
    }

    public void setGuranaStock(String guranaStock) {
        this.guranaStock = guranaStock;
    }

    public String getGuaranaSold() {
        return guaranaSold;
    }

    public void setGuaranaSold(String guaranaSold) {
        this.guaranaSold = guaranaSold;
    }

    public String getSpriteStock() {
        return spriteStock;
    }

    public void setSpriteStock(String spriteStock) {
        this.spriteStock = spriteStock;
    }

    public String getSpriteSold() {
        return spriteSold;
    }

    public void setSpriteSold(String spriteSold) {
        this.spriteSold = spriteSold;
    }

    public String getSnackStock() {
        return snackStock;
    }

    public void setSnackStock(String snackStock) {
        this.snackStock = snackStock;
    }

    public String getSnackSold() {
        return snackSold;
    }

    public void setSnackSold(String snackSold) {
        this.snackSold = snackSold;
    }

    public String getCoinsMessage() {
        return coinsMessage;
    }

    public void setCoinsMessage(String coinsMessage) {
        this.coinsMessage = coinsMessage;
    }



    public Machine(){
        this.stock = new Stock();
        this.charge = new Charge();
    }

    public String getMessage(){
        return message;
    }

    public Product getProduct(int index){
        return stock.get(index);
    }

    public Product getProduct(String nome){
        return stock.get(nome);
    }

    public int getCoins(){
        return charge.getCoin();
    }

    public void inserirProdutos(String name, int cansToAdd){
        stock.get(name).incrementProduct();
        this.cocaColaStock= "ESTOQUE ATUAL: "+ stock.get(0).getStockAmount();
        this.cocaColaSold="PRODUTOS VENDIDOS: "+stock.get(0).getProductsSold();

        this.guranaStock="ESTOQUE ATUAL: "+ stock.get(1).getStockAmount();
        this.guaranaSold="PRODUTOS VENDIDOS: "+stock.get(1).getProductsSold();

        this.spriteStock="ESTOQUE ATUAL: "+ stock.get(2).getStockAmount();
        this.spriteSold="PRODUTOS VENDIDOS: "+stock.get(2).getProductsSold();

        this.snackStock="ESTOQUE ATUAL: "+ stock.get(3).getStockAmount();
        this.snackSold="PRODUTOS VENDIDOS: "+stock.get(3).getProductsSold();

    }

    public void comprarProduto(String produto){
        Product p = stock.get(produto);
        if (charge.hasCoin() && p.getStockAmount()>0){
            p.decrementProduct();
            p.productSold();
            charge.removeCoin();
            this.message= "Compra realizada com sucesso. Pegue o seu produto abaixo.";
            this.coinsMessage=("NUMERO DE MOEDAS NA MÁQUINA: "+ charge.getCoin());
            this.cocaColaStock= "ESTOQUE ATUAL: "+ stock.get(0).getStockAmount();
            this.cocaColaSold="PRODUTOS VENDIDOS: "+stock.get(0).getProductsSold();

            this.guranaStock="ESTOQUE ATUAL: "+ stock.get(1).getStockAmount();
            this.guaranaSold="PRODUTOS VENDIDOS: "+stock.get(1).getProductsSold();

            this.spriteStock="ESTOQUE ATUAL: "+ stock.get(2).getStockAmount();
            this.spriteSold="PRODUTOS VENDIDOS: "+stock.get(2).getProductsSold();

            this.snackStock="ESTOQUE ATUAL: "+ stock.get(3).getStockAmount();
            this.snackSold="PRODUTOS VENDIDOS: "+stock.get(3).getProductsSold();
        }else if(charge.hasCoin()==false && p.getStockAmount()>0){
            this.message= "Não há moedas na máquina. " +
                    "Por favor, insira uma moeda antes de soliciar seu produto.";
            this.coinsMessage=("NUMERO DE MOEDAS NA MÁQUINA: "+ charge.getCoin());
        }else if((charge.hasCoin() && p.getStockAmount()<1)){
            this.message= "Produto em falta. Por favor, selecione outro produto ou retire sua moeda.";
            this.coinsMessage=("NUMERO DE MOEDAS NA MÁQUINA: "+ charge.getCoin());
        }
    }

    public void inserirMoeda() {
        charge.addCoin();
        this.coinsMessage=("NUMERO DE MOEDAS NA MÁQUINA: "+ charge.getCoin());
        this.message =("MOEDA INSERIDA. ESCOLHA SEU PRODUTO ABAIXO.");
    }

    public void despejarProduto() {

    }

    public void acionarManutencao() {
        this.message="Máquina está em manutenção. Por favor não use.";
    }

    public void terminarManutencao() {
        this.message="Manutenção finalizada. Uso liberado.";
    }


    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
