package com.example.krec;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AReceptActivity extends AppCompatActivity {

    protected ARecept recept;
    protected TextView prodCount;
    protected TextView timeCount;
    protected TextView receptName;
    protected TextView goodList;
    protected TextView stepList;
    public void InitActivity(TextView receptName, TextView timeCount, TextView prodCount, TextView goodList, TextView stepList){
        this.prodCount = prodCount;
        this.timeCount = timeCount;
        this.receptName = receptName;
        this.goodList = goodList;
        this.stepList = stepList;
        Init();
    }
    public ARecept RecieveRecept(){
        return (ARecept) getIntent().getExtras().getSerializable("Recept");
    }
    public void Init(){ // Стоит реализовать базу SQLite.
        recept = RecieveRecept();
        receptName.setText("Рецепт: " + recept.receptName);
        prodCount.setText("Количество порций: " + recept.prodCount);
        timeCount.setText("Время приготовления: " + recept.timeCount);

        for (String step : recept.stepList){
            stepList.setText(stepList.getText()+"\n\n"+step);
        }
        for (Good good : recept.goodList){
            goodList.setText(goodList.getText()+"\n"+good.returnName());
        }
    }
}
