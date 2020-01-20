package jp.ac.uryukyu.ie.e195719;
/**
 * 出目の強さ（地下チンチロリン出目順位表）クラス。 //原作参照
 * int magnification; //ペリカをもらう,払う倍率。倍率の値が高いほど強い出目
 * Created by e195719 on 2020/1/20.
 */
public class StrengthDiceEyes{
    private int magnification = 0;
    public int getMagnification(){
        return magnification;
    }
    public void setMagnification(int magnification){
        this.magnification = magnification;
    }
    /**
     * 目なし（[5, 6, 2]，[3, 1, 4]など）以外が出るまでサイコロを振る。 //3回まで
     * 出目に与えられる倍率の値をmagnificationに代入する。
     */
    public void strength_dice_eyes(){
        int i=0;
        while(i<3){
            DiceEyes dice_eyes = new DiceEyes();
            dice_eyes.DiceEyes();
            int a = dice_eyes.getDice_eyes().get(0);
            int b = dice_eyes.getDice_eyes().get(1);
            int c = dice_eyes.getDice_eyes().get(2); //[a, b, c]
            if(a + b + c == 3){           //重複組合せ{1, 1, 1}のとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                setMagnification(5);
                break;
            }else if(a == b & b == c){    //重複組合せ{2, 2, 2},{3, 3, 3}...のとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                setMagnification(3);
                break;
            }else if(a + b + c == 15 & a != 3 && b != 3 && c != 3){  //重複組合せ{4, 5, 6}
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                setMagnification(2);
                break;
            }else if(a + b + c == 6){    //重複組合せ{1, 2, 3}のとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                setMagnification(-2);
                break;
            }else if(a != b & b != c & c != a){  //出目なしのとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                setMagnification(-1);
                i++;
            }else {     //重複組合せ{1, 1, 4},{3, 5, 3}などのとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                setMagnification(1);
                break;
            }
        }
        System.out.println("倍率は"+magnification);
    }
}