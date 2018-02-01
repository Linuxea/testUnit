package game;

import java.util.Random;

/**
 * mine game
 * Created by Linuxea on 11/6/17.
 */

public class Mine {
	
	private int[][] mini = new int[9][9];
	private int MINE_NUMBER = 10;
	private Random random = new Random();
	private int[] around = {-1, 0, 1};
	
	public static void main(String[] args) {
		Mine mine = new Mine();
		mine.generate();
		mine.print();
	}
	
	public void generate() {
		for (int i = 0; i < MINE_NUMBER; i++) {
			int x, y;
			do {
				x = random.nextInt(9);
				y = random.nextInt(9);
			} while (mini[x][y] >= 100);
			
			mini[x][y] = 100;
			
			for (int xx : around) {
				for (int yy : around) {
					if (xx == 0 && yy == 0) continue;
					if (x + xx >= 0 && x + xx < 9 && y + yy >= 0 && y + yy < 9) {
						mini[x + xx][y + yy]++;
					}
				}
			}
		}
		
	}
	
	public void print() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (mini[i][j] >= 100) {
					System.out.print("[@]");
				} else if (mini[i][j] == 0) {
					System.out.print("[ ]");
				} else {
					System.out.print("[" + mini[i][j] + "]");
				}
			}
			System.out.println();
		}
	}
	
	
}
