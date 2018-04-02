package algorithm.easy;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 逆波兰表达式
 *
 * @author linuxea
 * @date 2018/4/2
 */
public class ReversePolishNotation {
	
	public static void main(String[] args) {
		new ReversePolishNotation().niBo();
	}
	
	public void niBo() {
		LinkedList<String> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String nextLine = scanner.nextLine();
			if (null == nextLine) {
				break;
			}
			if (nextLine.equals("+") || nextLine.equals("-") || nextLine.equals("*") || nextLine.equals("/") || nextLine.equals("%")) {
				int first = Integer.parseInt(list.pop());
				int second = Integer.parseInt(list.pop());
				int result;
				switch (nextLine) {
					case "+":
						result = first + second;
						break;
					case "-":
						result = first - second;
						break;
					case "*":
						result = first * second;
						break;
					case "/":
						result = first / second;
						break;
					case "%":
						result = first % second;
						break;
					default:
						throw new IllegalArgumentException("nothing");
				}
				System.out.println(String.format("%s %s %s = %s", first, nextLine, second, result));
				list.push(String.valueOf(result));
				continue;
				
			}
			list.push(nextLine);
			
		}
	}
	
	
}
