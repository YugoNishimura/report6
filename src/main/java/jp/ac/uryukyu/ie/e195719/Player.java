package jp.ac.uryukyu.ie.e195719;
public class Player {
    String name;
    int strong;
    public void  player_strong(){
        StrengthDiceEyes sd = new StrengthDiceEyes();
        sd.strength_dice_eyes();
        strong = sd.getMagnification();
    }
    Player (String name){
        this.name = name; //カイジ
    }
}