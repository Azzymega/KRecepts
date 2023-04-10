package com.example.krec;

import java.io.Serializable;

public class Brownie extends ARecept implements Serializable {
    public Brownie() {
        super(6, 40, "Брауни");
        this.AppendGood(new Good("Тёмный шоколад 100 г."));
        this.AppendGood(new Good("Сливочное масло 180 г."));
        this.AppendGood(new Good("Коричневый сахар 200 г."));
        this.AppendGood(new Good("Куриное яйцо 4 штуки."));
        this.AppendGood(new Good("Пшеничная мука 100 г."));
        this.AppendGood(new Good("Грецекие орехи 100 г."));
        this.AppendStep("Шоколад разломать на кусочки и вместе со сливочным маслом растопить на водяной бане, не переставая все время помешивать лопаткой или деревянной ложкой. Получившийся густой шоколадный соус снять с водяной бани и оставить остывать.");
        this.AppendStep("Тем временем смешать яйца со ста граммами коричневого сахара: яйца разбить в отдельную миску и взбить, постепенно добавляя сахар. Взбивать можно при помощи миксера или вручную — как больше нравится, — но не меньше двух с половиной-трех минут.");
        this.AppendStep("Острым ножом на разделочной доске порубить грецкие орехи. Предварительно их можно поджарить на сухой сковороде до появления аромата, но это необязательная опция.");
        this.AppendStep("В остывший растопленный со сливочным маслом шоколад аккуратно добавить оставшийся сахар, затем муку и измельченные орехи и все хорошо перемешать венчиком.");
        this.AppendStep("Затем влить сахарно-яичную смесь и тщательно смешать с шоколадной массой. Цвет у теста должен получиться равномерным, без разводов.");
        this.AppendStep("Разогреть духовку до 200 градусов. Дно небольшой глубокой огнеупорной формы выстелить листом бумаги для выпечки или калькой. Перелить тесто в форму. Поставить в духовку и выпекать двадцать пять — тридцать минут до появления сахарной корочки.");
        this.AppendStep("Готовый пирог вытащить из духовки, дать остыть и нарезать на квадратики острым ножом или ножом для пиццы — так кусочки получатся особенно ровными.");
        this.AppendStep("Подавать брауни можно просто так, а можно посыпать сверху сахарной пудрой или разложить квадратики по тарелкам и украсить каждую порцию шариком ванильного мороженого.");
    }
}
