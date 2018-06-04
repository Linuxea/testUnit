package interview.jingyugame;

import interview.jingyugame.abstractclassextend.AbstractGame;
import interview.jingyugame.abstractclassextend.CarGame;
import org.junit.Test;

/**
 * @author linuxea
 * @date 2018/6/5
 */
public class AbstractGameTest {
	
	@Test
	public void explainTest() {
		AbstractGame runRunCar = new CarGame("跑跑卡丁车", "只要试玩三分钟，你就会爱上介款游戏");
		runRunCar.explain();
	}
	
}