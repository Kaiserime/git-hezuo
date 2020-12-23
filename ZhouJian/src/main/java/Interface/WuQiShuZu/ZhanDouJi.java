package Interface.WuQiShuZu;

/**
 * @ClassName ZhanDouJi
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/24
 **/
public class ZhanDouJi extends WuQi implements Attackable,Moveable {
    @Override
    public void attack() {
        System.out.println("战斗机攻击！");
    }

    @Override
    public void move() {
        System.out.println("战斗机移动！");
    }
}
