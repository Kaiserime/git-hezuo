package Collection.CollectionList.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @ClassName KuoRong
 * @Description TODO
 *                      ArrayList的扩容
 * @Author
 * @Date 2020/12/27
 **/
public class KuoRong {
    public static void main(String[] args) {
        /**
         * 涉及到的概念
         *          有数组的位移的问题 自动的扩容是原容量的1.5倍
         * 优点
         *      检索的时候效率比较高
         *      最后的添加元素的时候效率比较搞
         *      经常用的就是ArrayList集合
         * 缺点
         *      随机的增删效率比较低
         *      口容的效率比较低
         *      存储量比较有限
         *第一个的构造方法
         *      是用来设置默认的集合的容量的
         *第二个的构造方法
         *      是用来把其他的集合转换成ArrayList集合的
         */



//        默认的集合容量是10
        List arrayList = new ArrayList();
//        可以指定集合容量的大小
        List arrayList1 = new ArrayList(20);

        Collection c = new HashSet();
        c.add("A");
        c.add("C");
        c.add("B");
        c.add("D");
        c.add("E");
//        第二个构造方法中的参数可以传递一个Collection 集合
        List arrayList2 = new ArrayList(c);



    }
}
