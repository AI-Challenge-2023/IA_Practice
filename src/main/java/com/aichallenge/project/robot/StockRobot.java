package com.aichallenge.project.robot;

import com.aichallenge.project.item.Product;
import fr.emse.fayol.maqit.simulator.robot.GridTurtlebot;


public class StockRobot extends GridTurtlebot {

    private Product order;
    private RobotState robotState;
    public StockRobot(int id, String name, int field, int debug, int[] pos, int r, int c) {
        super(id, name, field, debug, pos, r, c);
        order = null;
        robotState = RobotState.Resting;
    }
    @Override
    public void move(int step) {
        this.moveForward();
    }

    public RobotState getState(){
        return robotState;
    }

    /**
     * The method sets the robotState to Active
     * @param product product taken by the robot
     */
    public void feed(Product product){
        if (this.order != null){
            order = product;
        }
        robotState = RobotState.Active;
    }

    public Product deliver(){
        Product orderToGive = order;
        robotState = RobotState.Standby;
        order = null;
        return orderToGive;
    }

    public void rest(){
        robotState = RobotState.Resting;
    }
}
