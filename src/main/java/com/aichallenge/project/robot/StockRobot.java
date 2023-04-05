package com.aichallenge.project.robot;

import fr.emse.fayol.maqit.simulator.robot.GridTurtlebot;

public class StockRobot extends GridTurtlebot {
    public StockRobot(int id, String name, int field, int debug, int[] pos, int r, int c) {
        super(id, name, field, debug, pos, r, c);
    }

    @Override
    public void move(int step) {
        this.moveForward();
    }
}
