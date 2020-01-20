package jp.ac.uryukyu.ie.e195719;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StrengthDiceEyesTest {
    /**
     * 重複組合せ{4, 5, 6}のときと，重複組合せ{3, 6, 6}ときを区別できているか確認。
     */
    @Test
    void strength_dice_eyes(){
        int m=2;
        int magnification=0;
        int i=0;
        while(i<3){
            DiceEyes dice_eyes = new DiceEyes();
            dice_eyes.getDice_eyes().add(5);
            dice_eyes.getDice_eyes().add(4);
            dice_eyes.getDice_eyes().add(6);
            int a = dice_eyes.getDice_eyes().get(0);
            int b = dice_eyes.getDice_eyes().get(1);
            int c = dice_eyes.getDice_eyes().get(2); //[a, b, c]
            if(a + b + c == 3){           //重複組合せ{1, 1, 1}のとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                magnification=5;
                break;
            }else if(a == b & b == c){    //重複組合せ{2, 2, 2},{3, 3, 3}...のとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                magnification=3;
                break;
            }else if(a + b + c == 15 & a != 3 && b != 3 && c != 3){  //重複組合せ{4, 5, 6}のとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                magnification=2;
                break;
            }else if(a + b + c == 6){    //重複組合せ{1, 2, 3}のとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                magnification=-2;
                break;
            }else if(a != b & b != c & c != a){  //出目なしのとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                magnification=-1;
                i++;
            }else {     //重複組合せ{1, 1, 4},{3, 5, 3}などのとき。
                System.out.println(i+1+"投目："+dice_eyes.getDice_eyes());
                magnification=1;
                break;
            }
        }
        System.out.println("倍率は"+magnification);
        assertEquals(m, magnification);
    }
}