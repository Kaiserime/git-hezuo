package Collection.CollectionList.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListResourceBundle;

/**
 * @ClassName ArrayList
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/25
 **/
public class ArrayListMethods {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("E");
//        add(index ; Element),指定的位置添加元素，以前位置的元素全部依次的进行后移一位
        list.add(1,"One");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        get(index)方法根据下标获取元素,导致出现了list的特有的数组遍历
        list.get(1);
        for(int index = 0;index < list.size();index++){
            System.out.println(list.get(index));
        }
//       返回的是元素第一次出现的位置的下标
        int b = list.indexOf("B");
//        返回的是元素最后一次出现的下标
        list.lastIndexOf("B");
    }
}
