package jp.ac.uryukyu.ie.e215731;

public class Player {
    String name;
    String skill;
    

    public Player(String name, String skill){
        this.name = name;
        this.skill = skill;
        System.out.println(name + " : " + skill);
    }

    public void playerSkill(int turn){
        int skill_number = 0;
        if (turn == 1){
        }else{
            if (turn % 4 == 0){
                
            }
        }
        System.out.println(name + "はスキルを使用した。");
    }
}
