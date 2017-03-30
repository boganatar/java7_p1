package com.luxoft.labyrinth;

/**
 * Created by grey5 on 3/30/2017.
 */
public enum WeekDay {
    MONDAY(1), TUSDAY(2);
    private int orderNum;

    WeekDay(int orderNum){
        this.orderNum = orderNum;
    }

    public int getOrderNum() {
        return orderNum;
    }
}
