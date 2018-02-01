package beaufyofcode;

/**
 * 根据 cpu 核心数
 * 让 cpi 使用率在50%左右
 * Created by Linuxea on 2017-10-06.
 */
public class FIftyPercentage {
	
	public static void main(String[] args) {
		new Thread(() -> {
			while (true) {
				int i = 0;
				i++;
			}
		}).start();
		
		new Thread(() -> {
			while (true) {
				int i = 0;
				i++;
			}
		}).start();
	}
	
}
