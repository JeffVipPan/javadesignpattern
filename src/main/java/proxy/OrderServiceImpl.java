package proxy;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

/**
 * @author ек╥Е
 * @date 2018/1/18 обнГ6:30
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public void test1() {
    }

    @Override
    public void test2() {

        String[] args = {};
        ArrayUtils.contains(args, "a");
        Arrays.binarySearch(args, "a");
    }
}
