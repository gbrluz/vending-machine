package com.example.vendingmachine.machine;

import com.example.vendingmachine.ui.Machine;
import com.example.vendingmachine.ui.UI;

public class VendingMachine {

    public static void main(String[] args) {
        Machine machine = new Machine();
        UI ui = new UI(machine);
        ui.init();
    }
}
