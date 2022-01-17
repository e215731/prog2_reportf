package jp.ac.uryukyu.ie.e215731;

import java.util.Random;

public class Dice {
    public static int diceNum(){
        Random random = new Random();
        int dice_num = random.nextInt(6) + 1;
        return dice_num;
    }
}
