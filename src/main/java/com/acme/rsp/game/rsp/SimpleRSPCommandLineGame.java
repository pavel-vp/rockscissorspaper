package com.acme.rsp.game.rsp;

import com.acme.rsp.game.Game;
import com.acme.rsp.model.Item;
import com.acme.rsp.model.MoveRecord;
import com.acme.rsp.service.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleRSPCommandLineGame extends Game {

    public SimpleRSPCommandLineGame() {
        this.mover = new ComputerMoverImpl();
        this.statistic = new Statistic();
    }

    @Override
    public void play() {
        final BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
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
            MoveRecord moveRecord = move(itemHuman);

            System.out.println("Your move - " + moveRecord.getItemHuman().getDesc());
            System.out.println("Computer move - " + moveRecord.getItemComputer().getDesc());
            System.out.println("Your result - " + moveRecord.getResult().getDesc());
            System.out.println("Total score:");
            System.out.println("You     :" + statistic.getWinsHuman());
            System.out.println("Computer:" + statistic.getWinsComputer());
        }
    }
}
