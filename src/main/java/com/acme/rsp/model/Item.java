package com.acme.rsp.model;

/**
 * Basic class, represents a chosen Item at the move.
 * Implementing an interface ItemFunction, with method compateToOther with each Item.
 */
public enum Item implements ItemFunction {

    ROCK {
        @Override
        public Result compareToOther(Item other) {
            switch (other) {
                case PAPER:
                    return Result.LOSE;
                case ROCK:
                    return Result.DRAW;
                case SCISSORS:
                    return Result.WIN;
            }
            return Result.DRAW;
        }

        @Override
        public String getDesc() {
            return "Rock";
        }
    },

    SCISSORS {
        @Override
        public Result compareToOther(Item other) {
            switch (other) {
                case PAPER:
                    return Result.WIN;
                case ROCK:
                    return Result.LOSE;
                case SCISSORS:
                    return Result.DRAW;
            }
            return Result.DRAW;
        }

        @Override
        public String getDesc() {
            return "Scissors";
        }
    },

    PAPER {
        @Override
        public Result compareToOther(Item other) {
            switch (other) {
                case PAPER:
                    return Result.DRAW;
                case ROCK:
                    return Result.WIN;
                case SCISSORS:
                    return Result.LOSE;
            }
            return Result.DRAW;
        }

        @Override
        public String getDesc() {
            return "Paper";
        }
    }

}
