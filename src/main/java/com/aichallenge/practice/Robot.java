package com.aichallenge.practice;

import fr.emse.fayol.maqit.simulator.robot.GridTurtlebot;

public class Robot extends GridTurtlebot {

    public Robot(int id,
                 String name,
                 int field,
                 int debug,
                 int[] pos,
                 int r,
                 int c){
        super(id, name, field, debug,pos, r, c);

    }

    public void move(int i){
        int j = 0;
        while (grid[0][1] == 0 && j<i){
            this.moveForward();
            this.updatePerception(this.getPerception());
        }
    }

    public int getRows(){ return this.rows;}
}
