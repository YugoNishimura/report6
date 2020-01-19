package jp.ac.uryukyu.ie.e195719;
public class Dice {
    private int val;
    public int getVal(){
        return val;
    }
    public void play(){
        val = (int)(Math.random()*6) + 1;
    }
}