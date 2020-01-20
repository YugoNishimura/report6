package jp.ac.uryukyu.ie.e195719;
/**
 * サイコロクラス。
 * int val; //サイコロの目の値。
 * Created by e195719 on 2020/1/20.
 */
public class Dice {
    private int val;
    public int getVal(){
        return val;
    }
    /**
     * サイコロの出目をvalに新しく代入する。
     */
    public void play(){
        val = (int)(Math.random()*6) + 1;
    }
}