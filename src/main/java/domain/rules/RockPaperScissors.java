package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        if (mine == theirs){
            return Result.DRAW;
        }
        switch (mine) {
            case PAPER:
                switch (theirs) {
                    case ROCK:
                        return Result.WIN;
                }
                break;

            case SCISSORS:
                switch (theirs) {
                    case PAPER:
                        return Result.WIN;
                }
                break;

            case ROCK:
                switch (theirs) {
                    case SCISSORS:
                        return Result.WIN;
                }
        }
        return Result.LOSE;
    }
}