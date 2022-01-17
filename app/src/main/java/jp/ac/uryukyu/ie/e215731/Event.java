package jp.ac.uryukyu.ie.e215731;


public class Event {
    public int existEvent(int masume){
        int event_num = 0;
            if(masume == 1){
                System.out.println("百円拾った。１マス進む");
                event_num = 1;
            }if(masume == 3){
                System.out.println("蛇に噛まれた。１マス戻る");
                event_num = -1;
            }if(masume == 4){
                System.out.println("散歩していると、鳥のフンが落ちてきた。１マス戻る");
                event_num = -1;
            }if(masume == 6){
                System.out.println("アイスの当たり棒が当たった。１マス進む");
                event_num = 1;
            }if(masume == 7){
                System.out.println("迷子になった。３マス戻る");
                event_num = -3;
            }if(masume == 9){
                System.out.println("３キロ痩せた！１マス進む");
                event_num = 1;
            }if(masume == 10){
                System.out.println("借金してバカンスに行く。５マス戻る");
                event_num = -5;
            }if(masume == 12){
                System.out.println("宝くじで１億円当たった。４マス進む");
                event_num = 4;
            }if(masume == 13){
                System.out.println("空に綺麗な虹を見つけた。２マス進む");
                event_num = 2;
            }if(masume == 15){
                System.out.println("学校まで行ったのに、休講だった。１マス戻る");
                event_num = -1;
            }if(masume == 16){
                System.out.println("好きな人と目があった。2マス進む");
                event_num = 2;
            }if(masume == 18){
                System.out.println("空き巣に入られた。２マス戻る");
                event_num = -2;
            }if(masume == 19){
                System.out.println("恋人の４又が発覚。４マス戻る");
                event_num = -4;
            }
        
    return event_num;
    }
}
