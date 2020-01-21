package jp.ac.uryukyu.ie.e195719;
/**
 * プレイヤークラス。
 * Created by e195719 on 2020/1/20.
 */
public class Player extends Character{
    /**
     * コンストラクタ。名前を指定する。
     *
     * @param name      プレイヤーの名前
     */
    Player (String name){
        super(name); //カイジ
        System.out.println(name + "のターン！");
    }
}