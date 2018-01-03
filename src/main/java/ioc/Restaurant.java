package ioc;

/**
 * @author ек╥Е
 * @date 2018/1/3 обнГ10:44
 */
public class Restaurant {

    public static void peican(int orderid, int flowid) {
        TakeawayMember takeawayMember;
        Food food;

        if (orderid == 0) {
            food = new Fish();
        } else {
            food = new Meat();
        }

        if (flowid % 2 == 0) {
            takeawayMember = new TakeawayWoman();
        } else {
            takeawayMember = new TakeawayMan();
        }

        takeawayMember.sendFood(food);

    }
}
