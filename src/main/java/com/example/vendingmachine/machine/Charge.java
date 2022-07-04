package com.example.vendingmachine.machine;

public class Charge {

    private int coin = 0;

    public Charge (){
        this.coin = 0;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public void addCoin (){
        coin++;
    }

    public void removeCoin(){
        coin--;
    }

    public void removeAllCoins(){
        coin = 0;
    }

    public boolean hasCoin (){
        if (coin>0){
            return true;
        }else{
            return false;
        }
    }
}
