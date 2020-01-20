package jp.ac.uryukyu.ie.e195719;
/**
 * キャラクタークラス。
 * String name; //名前。
 * int strength_dice_eyes; //出目の強さ。
 * Created by e195719 on 2020/1/20.
 */
public class Character{
    String name;
    int strength_dice_eyes;
    /**
     * コンストラクタ。名前を指定する。
     *
     * @param name  名前
     */
    Character (String name){
        this.name = name;
    }
    /**
     * サイコロを3回投げて，出目の強さを判断し，出目に与えられている倍率の値をstrength_dice_eyesに代入する
     */
    public void  player_strong(){
        StrengthDiceEyes sde = new StrengthDiceEyes();
        sde.strength_dice_eyes();
        strength_dice_eyes = sde.getMagnification();
    }
}