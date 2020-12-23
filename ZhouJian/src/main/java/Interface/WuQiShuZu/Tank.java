package Interface.WuQiShuZu;

/**
 * @ClassName Tank
 * @Description TODO
 * @Author
 * @Date 2020/12/24
 **/

/**
 * 坦克
 */
public class Tank extends WuQi implements Moveable,Attackable{
    @Override
    public void attack() {
        System.out.println("坦克攻击！");
    }

    @Override
    public void move() {
        System.out.println("坦克移动！");
    }
}
