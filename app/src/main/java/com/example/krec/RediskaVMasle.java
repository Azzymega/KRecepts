package com.example.krec;

import java.io.Serializable;

public class RediskaVMasle extends ARecept implements Serializable {
    public RediskaVMasle(){
        super(4, 20, "Редиска в сливочном масле");
        this.AppendGood(new Good("Редис 1 пучок."));
        this.AppendGood(new Good("Сливочное масло 180 г."));
        this.AppendGood(new Good("Морская соль по вкусу."));
        this.AppendStep("Подготовить все ингредиенты. Редиску хорошо вымыть.");
        this.AppendStep("Тщательно обсушить редиску, чтобы на ней не осталось капель воды и никакой влаги.");
        this.AppendStep("Ножницами обрезать тонкие корешки. При желании отрезать у редиски ботву.");
        this.AppendStep("Сливочное масло подтопить в микроволновке в течение 30–40 секунд. Оно должно растаять лишь частично.");
        this.AppendStep("Венчиком взбить подтаявшее масло до однородной массы, напоминающей растопленный шоколад.");
        this.AppendStep("Окунуть редиску в масло.");
        this.AppendStep("Выложить на пекарскую бумагу. Оставшееся масло можно охладить и пользоваться как обычно.");
        this.AppendStep("Убрать редиску в холодильник на 10–15 минут.");
        this.AppendStep("Выложить редиску на блюдо или доску.");
        this.AppendStep("Подавать редиску в сливочном масле с морской солью.");
    }
}
