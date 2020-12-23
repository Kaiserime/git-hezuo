package Interface.WuQiShuZu;

/**
 * @ClassName YunShuJi
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/24
 **/
public class YunShuJi extends WuQi implements Moveable {
    @Override
    public void move() {
        System.out.println("运输机移动！");
    }
}
