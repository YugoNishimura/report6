package jp.ac.uryukyu.ie.e195719;
public class GameMaster {
    GameMaster(){
        Player p = new Player("カイジ");
        p.player_strong();
        Enemy e = new Enemy("班長");
        e.player_strong();
        if(p.strong>e.strong){
            System.out.println(p.name+"の勝利！");
        }else if(p.strong==e.strong){
            System.out.println("両者引き分け！");
        }else{
            System.out.println(e.name+"の勝利！");
        }
    }
}