package ioc;

/**
 * @author �˷�
 * @date 2018/1/3 ����10:40
 */
public class TakeawayMan implements TakeawayMember {


    public void sendFood(Food food) {
        System.out.println("С����������" + food);
    }
}
