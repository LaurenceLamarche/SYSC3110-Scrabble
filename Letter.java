
// the Game class will need to initialize all available letters. Their scores will be associated to them

/**
 * A letter is a character and a score.
 * The Game class will need to initialize all available letters. Their scores will be associated to them.
 * @author Laurence Lamarche-Cliche 101173070
 * @version 0.1
 */
public class Letter {

    public enum Character {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z}

    private final Character character;
    private final int value;
    private String premium;

    /**
     * The Game class will need to call this for every available letter in the game, this way
     * new Letter(A)
     */
    public Letter(Character character) {
        this.character = character;
        this.value = this.getValueFromCharacter(character);
    }

    private int getValueFromCharacter(Character c) {
        if (c == Character.A | c == Character.E | c == Character.I | c == Character.L | c == Character.N |
            c == Character.O | c == Character.R | c == Character.S | c == Character.T | c == Character.U) {
            return 1;
        }
        else if (c == Character.D | c == Character.G) {
            return 2;
        }
        else if (c == Character.B | c == Character.C | c == Character.M | c == Character.P) {
            return 3;
        }
        else if (c == Character.F | c == Character.H | c == Character.V | c == Character.W | c == Character.Y) {
            return 4;
        }
        else if (c == Character.K) {
            return 5;
        }
        else if (c == Character.J | c == Character.X) {
            return 8;
        }
        else if (c == Character.Q | c == Character.Z) {
            return 10;
        }
        else {
            // blank tile
            return 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    /**
     * This shall not be set in the constructor because the letters are created without a premium
     * Only letters that are placed can then have a premium set.
     * @param premium is one of
     *         NONE = "None";
     *         DL = "Double Letter";
     *         TL = "Triple Letter";
     *         DW = "Double Word";
     *         TW = "Triple Word";
     */
    public void setPremium(String premium){
        this.premium = premium;
    }

    public String getPremium(){
        return this.premium;
    }

    @Override
    public String toString() {
        return this.character.name();
    }
}
