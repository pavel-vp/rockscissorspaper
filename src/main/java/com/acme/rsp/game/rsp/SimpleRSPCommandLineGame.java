package com.acme.rsp.game.rsp;

import com.acme.rsp.game.Game;
import com.acme.rsp.model.Item;
import com.acme.rsp.model.Result;
import com.acme.rsp.service.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleRSPCommandLineGame implements Game {

    @Override
    public void start() {
        final BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        Mover mover = new ComputerMoverImpl();
        Statistic statistic = new Statistic();
        while (true) {
            System.out.println("Please enter move:");
            System.out.println(" 1 - rock, 2 - scissors, 3 - paper");
            System.out.println(" q - quit game.");
            String line;
            try {
                line = buffer.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }

            if (line.toLowerCase().equals("q") ) {
                break;
            }
            Item itemHuman = ItemFabric.getItemByConstant(line);
            if (itemHuman == null) {
                System.out.println("Wrong input!");
                continue;
            }
            Item itemComputer = mover.makeMove(statistic);
            Result result  = statistic.checkAndSaveStat(itemHuman, itemComputer);

            System.out.println("Your move - " + itemHuman.getDesc());
            System.out.println("Computer move - " + itemComputer.getDesc());
            System.out.println("Your result - " + result.getDesc());
            System.out.println("Total score:");
            System.out.println("You     :" + statistic.getWinsHuman());
            System.out.println("Computer:" + statistic.getWinsComputer());
        }
    }
}
