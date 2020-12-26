package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName BianLi
 * @Description TODO
 * @Author
 * @Date 2020/12/26
 **/
public class BianLi {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
//        调用父类接口的方法
        Iterator iterator = c.iterator();
//        是否有下一个元素返回值是Boolean类型的
        while (iterator.hasNext()){
//            下一个元素是，返回值是object类型的也就是所有对象的父类
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
