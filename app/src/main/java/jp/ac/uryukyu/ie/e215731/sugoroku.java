package jp.ac.uryukyu.ie.e215731;

public class sugoroku {
    public static void main(String[] args) {
        int goal = 0;
        final int GOAL = 20;//ゴールまでのマス数
        //masume 初期化
        int masume[] = {0,0,0,0};
        String name[] = {"player1", "player2", "player3", "player4"};
        int turn = 1;
        while(goal == 0) {

            for (int i = 0; i < name.length; i++) {
                System.out.println("");
                if(i % 4 == 0){
                    System.out.println("========== " + turn + "ターン目です ==========");
                    turn += 1;
                }
                
                
                System.out.println(name[i] + "さんの番です");
                int result = Dice.diceNum();
                

                
                masume[i] = masume[i] + result;
                System.out.println(result + "つ進んでください");
                
                Event event = new Event();
                result = event.existEvent(masume[i]);
                masume[i] = masume[i] + result;

                
                //GOALの演出
                if (masume[i] >= GOAL) {
                    System.out.println("GOAL!" + name[i] + "さん、優勝です。");
                    goal = 1;
                    //優勝が決まったのでループを抜ける
                    break;
                }else {
                    System.out.println(name[i] +"さん" + masume[i] + "のマスに到着です。");
                }
            }
        }
    }

}

