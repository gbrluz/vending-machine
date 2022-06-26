package com.example.vendingmachine.machine;

import java.util.ArrayList;


public class Stock {
    ArrayList<Product> stock;
    Product cocaCola = new Product("Coca-Cola",1,15,15);
    Product guarana = new Product("Guaraná",1,15,15);
    Product sprite = new Product("Sprite",1,15,15);
    Product snack = new Product("Snack",1,15,15);

    public Stock() {
        stock = new ArrayList<Product>();
        stock.add(cocaCola);
        stock.add(guarana);
        stock.add(sprite);
        stock.add(snack);
    }

    public ArrayList<Product> listar() {
        return stock;
    }

    public Product get(String name)
    {
        for(Product product:stock)
        {
            if(product.getName().equals(name))
            {
                return product;
            }
        }
        return null;
    }

}
