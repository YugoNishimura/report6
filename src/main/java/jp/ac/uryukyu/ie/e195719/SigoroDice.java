package jp.ac.uryukyu.ie.e195719;
/**
 * シゴロ賽クラス。
 * int val; //シゴロ賽の目の値。
 * Created by e195719 on 2020/1/21.
 */
public class SigoroDice {
    private int val;
    public int getVal(){
        return val;
    }
    /**
     * シゴロ賽の出目をvalに新しく代入する。 //valには4,5,6しか代入されない。
     */
    public void play(){
        while(getVal() >= 4){
            val = (int)(Math.random()*6) + 1;
        }
    }
}
