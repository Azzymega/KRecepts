package com.example.krec;

import java.io.Serializable;
import java.util.ArrayList;

public class ARecept implements Serializable {
    protected int prodCount;
    protected int timeCount;
    protected String receptName;
    protected ArrayList<Good> goodList;
    protected ArrayList<String> stepList;

    public ARecept(int prodCount, int timeCount, String receptName) {
        this.prodCount = prodCount;
        this.timeCount = timeCount;
        this.receptName = receptName;
        goodList = new ArrayList<Good>();
        stepList = new ArrayList<String>();
    }

    public void AppendGood(Good good) {
        goodList.add(good);
    }

    public void AppendStep(String step) {
        stepList.add(step);
    }
}

