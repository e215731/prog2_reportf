package jp.ac.uryukyu.ie.e215731;

public class Ninja extends Player{
    public Ninja(String name, String skill){
        super(name, skill);
    }

    @Override
    public void playerSkill(int turn){
        System.out.println("忍者はスキルを使用した");
            
    }
        
}

