package com.example.krec;

import java.io.Serializable;

public class KulichShuchenka extends ARecept implements Serializable {
    public KulichShuchenka(){
        super(8, 40, "Кулич с вареной сгущенкой и грецкими орехами");
        this.AppendGood(new Good("Творог 9%-ный 350 г."));
        this.AppendGood(new Good("Сметана 20%-ная 120 г."));
        this.AppendGood(new Good("Сливочное масло 50 г."));
        this.AppendGood(new Good("Ванильный сахар 10 г."));
        this.AppendGood(new Good("Вареное сгущенное молоко 235 г."));
        this.AppendGood(new Good("Грецкие орехи 50 г."));
        this.AppendGood(new Good("Печенье 50 г."));
        this.AppendStep("Грецкие орехи подсушить на сухой сковороде несколько минут, нарубить не очень крупно.");
        this.AppendStep("Печенье нарубить аналогично, подсушить на сковороде. Смешать орехи и крошку печенья.");
        this.AppendStep("Творог, мягкое сливочное масло, 200 грамм вареной сгущенки, ванильный сахар и сметану выложить в емкость, хорошо перемешать вилкой. Лучше выбрать вареную сгущенку плотной консистенции.");
        this.AppendStep("Пробить погружным блендером до однородности и гладкости.");
        this.AppendStep("Пасочницу выстелить в 2 слоя хорошо отжатой марлей.");
        this.AppendStep("Очень аккуратно соединить творожную массу с орехами и печеньем кулинарной лопаткой. Не мешать массу долго, чтобы печенье не растворилось.");
        this.AppendStep("Выложить готовую смесь в пасочницу, уложить сверху концы марли, установить груз.");
        this.AppendStep("Поставить в холодильник на 24 часа минимум.");
        this.AppendStep("Для крема смешать 3 чайные ложки вареной сгущенки и 2 чайные ложки сметаны. Вкус можно отрегулировать по желанию.");
        this.AppendStep("Готовый кулич украсить кремом, посыпать рублеными грецкими орехами.");
    }
}
