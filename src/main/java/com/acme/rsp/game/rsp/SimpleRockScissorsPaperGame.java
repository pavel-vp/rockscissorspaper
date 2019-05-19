package com.acme.rsp.game.rsp;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.Result;
import com.acme.rsp.service.ItemFabric;
import com.acme.rsp.service.Mover;
import com.acme.rsp.service.SimpleMoverImpl;
import com.acme.rsp.service.Statistic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleRockScissorsPaperGame  {

    private int state = 0;

    public SimpleRockScissorsPaperGame() {
    }

    public void start() {
        // Цикл игры
        state = 0;
        final BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        Mover mover = new SimpleMoverImpl();
        Statistic statistic = new Statistic();
        // обнуляем статистику
        while (state == 0) {
            // запросить ход игрока ЧЕЛОВЕКА
            System.out.println("Please enter move:");
            System.out.println(" 1 - rock, 2 - scissors, 3 - paper");
            System.out.println(" s - observe statistics,");
            System.out.println(" q - quit game.");
            String line = null;
            try {
                line = buffer.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }

            if (line.toLowerCase().equals("q") ) {
                break;
            }
            if (line.equals("1") || line.equals("2") || line.equals("3")) {
                // определить объект по ходу человека
                Item itemHuman = ItemFabric.getItemByConstant(line);
                if (itemHuman == null) {
                    System.out.println("error input");
                    continue;
                }
                // сгенерироать ход компьютера
                Item itemComputer = mover.makeMove();
                // определить победителя
                Result result  = statistic.checkAndSaveStat(itemHuman, itemComputer);

                // выводим результат текущий
                System.out.println("Your move - " + itemHuman.getDesc());
                System.out.println("Computer move - " + itemComputer.getDesc());
                System.out.println("Your result - " + result.getDesc());
            }
            // накопленный
            System.out.println("Total score:");
            System.out.println("You     :" + statistic.getWinsHuman());
            System.out.println("Computer:" + statistic.getWinsComputer());


        }
    }
}
