package com.acme.rsp;

import com.acme.rsp.game.Game;
import com.acme.rsp.game.rsp.SimpleRSPCommandLineGame;

public class RockScissorsPaper {

    public static void main(String[] args) {
        Game game = new SimpleRSPCommandLineGame();
        game.play();
    }
}
