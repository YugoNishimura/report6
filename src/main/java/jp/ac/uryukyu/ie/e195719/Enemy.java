package jp.ac.uryukyu.ie.e195719;
/**
 * 敵クラス。
 * Created by e195719 on 2020/1/20.
 */
public class Enemy extends Character{
    /**
     * コンストラクタ。名前を指定する。
     *
     * @param name      敵の名前
     */
    Enemy (String name){
        super(name); //班長
        System.out.println(name + "のターン！");
    }
}