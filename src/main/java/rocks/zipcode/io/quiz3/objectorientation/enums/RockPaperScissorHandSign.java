package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    private RockPaperScissorHandSign sign;

    public RockPaperScissorHandSign getWinner() {
        switch (PAPER){
            case ROCK:
                return PAPER;
            case PAPER:
                return SCISSOR;
            case SCISSOR:
                return ROCK;
        }
        switch (ROCK){
            case ROCK:
                return PAPER;
            case PAPER:
                return SCISSOR;
            case SCISSOR:
                return ROCK;
        }

        return PAPER;
    }

    public RockPaperScissorHandSign getLoser() {
        switch (PAPER){
            case ROCK:
                return SCISSOR;
            case PAPER:
                return ROCK;
            case SCISSOR:
                return PAPER;
        }
        switch (ROCK){
            case ROCK:
                return SCISSOR;
            case PAPER:
                return ROCK;
            case SCISSOR:
                return PAPER;
        }
        return PAPER;
    }
}
