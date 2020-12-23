package Interface.WuQiShuZu;

/**
 * @ClassName Test
 * @Description TODO
 * @Author
 * @Date 2020/12/24
 **/
public class Test {
    public static void main(String[] args) {
        Army army = new Army(4);
//        MyException e = new MyException("部队武器过多！");
        Tank tank = new Tank();
        YuShuCar yuShuCar = new YuShuCar();
        ZhanDouJi zhanDouJi = new ZhanDouJi();
        YunShuJi yunShuJi = new YunShuJi();
        try {
            army.addWuQi(tank);
            army.addWuQi(yuShuCar);
            army.addWuQi(zhanDouJi);
            army.addWuQi(yunShuJi);
            army.addWuQi(tank);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        army.doAttack();
        army.doMove();


    }
}
