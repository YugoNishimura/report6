package jp.ac.uryukyu.ie.e195719;
import java.util.ArrayList;
public class DiceEyes {
    private ArrayList<Integer> dice_eyes = new ArrayList<>();
    public ArrayList<Integer> getDice_eyes(){
        return dice_eyes;
    }
    public void DiceEyes(){
        Dice dice = new Dice();
        for(int i=0;i<3;i++){
            dice.play();
            dice_eyes.add(dice.getVal());
        }
    }
}