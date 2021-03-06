package being;

import position.Position;

/**
 * @Description 正义阵营，可以在填充BattleField的时候指示填充对象（葫芦娃系列还是妖精系列）
 * @Author LUCUS BAI
 * @Date 2018/10/23
 */

public class Justice extends CartoonCharacter {
    public Justice() {
        super();
    }

    public Justice(Position nowPosition, String label, int movingRange, int speed, int attackSpeed,
                   int hp, int attack, int recover, int dodgeRate, int absorptionRate) {
        super(nowPosition, label, movingRange, speed, attackSpeed, hp, attack, recover, dodgeRate, absorptionRate);
    }
}
