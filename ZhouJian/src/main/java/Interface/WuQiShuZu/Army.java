package Interface.WuQiShuZu;

/**
 * @ClassName Army
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/24
 **/
public class Army {
    //军队的所有的武器
    private WuQi[] wuQis;

    /**
     * 构造方法
     */
    public Army(){}
    public Army(int q){
        this.wuQis = new WuQi[q];
    }
    /**
     * 增加武器
     */
    public void addWuQi(WuQi wuQi) throws MyException{
        for (int index = 0 ;index <wuQis.length;index++){
            if (wuQis[index] == null){
                wuQis[index] = wuQi;
               return;
            }

        }
                    throw new MyException("部队武器过多");
    }
    /**
     * 所有的能攻击的武器攻击
     */
    public void doAttack(){
        for (int index = 0;index< wuQis.length;index++){
            if (wuQis[index] instanceof Attackable){
                Attackable attackable = (Attackable)wuQis[index];
                attackable.attack();
            }
        }
    }
    /**
     * 所有的能移动的武器移动
     */
    public void doMove(){
        for (int index = 0;index< wuQis.length;index++){
            if (wuQis[index] instanceof Moveable){
              Moveable moveable = (Moveable) wuQis[index];
                moveable.move();
            }
        }
    }
}
