package jp.ac.uryukyu.ie.e195719;
public class StrengthDiceEyes {
    private int magnification = 0;
    public void setMagnification(int magnification){
        this.magnification = magnification;
    }
    public int getMagnification(){
        return magnification;
    }
    public void strength_dice_eyes(){
        int i=1;
        while(i<4){
            DiceEyes dice_eyes = new DiceEyes();
            dice_eyes.DiceEyes();
            int a = dice_eyes.getDice_eyes().get(0);
            int b = dice_eyes.getDice_eyes().get(1);
            int c = dice_eyes.getDice_eyes().get(2);

            if(a + b + c == 3){
                setMagnification(5);
                System.out.println(i+"投目："+dice_eyes.getDice_eyes());
                break;
            }else if(a == b & b == c){
                setMagnification(3);
                System.out.println(i+"投目："+dice_eyes.getDice_eyes());
                break;
            }else if(a + b + c == 15 & a != 4 && b != 4 && c != 4){
                setMagnification(2);
                System.out.println(i+"投目："+dice_eyes.getDice_eyes());
                break;

            }else if(a + b + c == 6){
                setMagnification(-2);
                System.out.println(i+"投目："+dice_eyes.getDice_eyes());
                break;
            }else if(a != b & b != c & c != a){
                setMagnification(-1);
                System.out.println(i+"投目："+dice_eyes.getDice_eyes());
                i++;
            }else {
                setMagnification(1);
                System.out.println(i+"投目："+dice_eyes.getDice_eyes());
                break;
            }
        }
        System.out.println("倍率は"+magnification);
    }
}