package ioc;

/**
 * @author 潘峰
 * @date 2018/1/3 下午10:40
 */
public class TakeawayMan implements TakeawayMember {


    public void sendFood(Food food) {
        System.out.println("小伙子送外卖" + food);
    }
}
