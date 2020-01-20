package jp.ac.uryukyu.ie.e195719;
import java.util.ArrayList;
/**
 * チンチロリンの出目クラス。
 * ArrayList<Integer> dice_eyes; //サイコロの目の配列
 * Created by e195719 on 2020/1/20.
 */
public class DiceEyes{
    private ArrayList<Integer> dice_eyes = new ArrayList<>();
    public ArrayList<Integer> getDice_eyes(){
        return dice_eyes;
    }
    /**
     * dice_eyesにサイコロを三回投げたとき（サイコロを三つ投げたとき）の出目を代入する。
     */
    public void DiceEyes(){
        Dice dice = new Dice();
        for(int i=0;i<3;i++){
            dice.play();
            dice_eyes.add(dice.getVal());
        }
    }
}