package jp.ac.uryukyu.ie.e195719;
public class Enemy {
    String name;
    int strong;
    public void  player_strong(){
        StrengthDiceEyes sd = new StrengthDiceEyes();
        sd.strength_dice_eyes();
        strong = sd.getMagnification();
    }
    Enemy (String name){
        this.name = name; //班長
    }
}