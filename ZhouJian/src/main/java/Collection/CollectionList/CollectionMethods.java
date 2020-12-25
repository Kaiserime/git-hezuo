package Collection.CollectionList;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionMethods
 * @Description TODO
 *                          测试的是Collection集合中的方法
 * @Author ZhouJian
 * @Date 2020/12/25
 **/
public class CollectionMethods {
    public static void main(String[] args) {
        Collection c = new ArrayList();
//        自动装箱的机制，集合中只能存放对象的内存地址
        c.add(100);
        c.add(new Object());
        c.add(true);

//        获取集合中元素的个数
        int size = c.size();
        System.out.println(size);

//        移除Collection中的所有集合
        c.clear();

//        判断集合中是否包含某一元素,返回是一个Boolean类型的
        boolean contains = c.contains(100);

//        移除一个元素,返回的是Boolean数据类型
        boolean remove = c.remove(100);

//        判断集合是否为空
        boolean empty = c.isEmpty();

//        把集合转换成一个数组
        Object[] objects = c.toArray();
    }
}
