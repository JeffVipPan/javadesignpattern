package ioc;

/**
 * @author �˷�
 * @date 2018/1/3 ����10:41
 */
public class TakeawayWoman implements TakeawayMember {
    public void sendFood(Food food) {
        System.out.println("С����������" + food);
    }
}
