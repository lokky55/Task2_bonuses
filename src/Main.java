public class Main {
    public static void main(String[] args) {

        int startMoney = 100;
        int refillMoney = 1100;

        int currentMoney;
        int bonusMoney;
        if (refillMoney >= 1000) {
            bonusMoney = refillMoney / 100;
            currentMoney = startMoney + refillMoney + bonusMoney;
        } else {
            bonusMoney = 0;
            currentMoney = startMoney + refillMoney;
        }
        System.out.println("За пополнение счета Вам начислено: " + bonusMoney + " бонусов");
        System.out.println("На Вашем счету сейчас: " + currentMoney + " рублей");
    }
}
