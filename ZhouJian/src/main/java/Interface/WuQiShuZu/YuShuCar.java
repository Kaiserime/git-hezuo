package Interface.WuQiShuZu;

/**
 * @ClassName YuShuCar
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/24
 **/
public class YuShuCar extends WuQi implements Moveable{

    @Override
    public void move() {
        System.out.println("运输车开动！");
    }
}
