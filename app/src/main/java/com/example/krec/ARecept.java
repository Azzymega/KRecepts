package com.example.krec;

import java.io.Serializable;
import java.util.ArrayList;

public class ARecept implements Serializable {
    int prodCount;
    int timeCount;
    String receptName;
    ArrayList<Good> goodList;
    ArrayList<String> stepList;
    public ARecept(int prodCount, int timeCount, String receptName){
        this.prodCount = prodCount;
        this.timeCount = timeCount;
        this.receptName = receptName;
        goodList = new ArrayList<Good>();
        stepList = new ArrayList<String>();
    }
    public void AppendGood(Good good){
        goodList.add(good);
    }
    public void AppendStep(String step){
        stepList.add(step);
    }
}

