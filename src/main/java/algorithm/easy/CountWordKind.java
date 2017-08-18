package algorithm.easy;

public class CountWordKind{

	public void count(String str) {
		int count = 0;
		while(true) {
			String ch = str.substring(0,1);
			String temp = str.replace(ch,"");
			count++;
			str = temp;
			if(str.length() == 0)
				break;
		}

		System.out.println("总共出现了"+count+"个字符");
	}

	public static void main(String argc[]) {
		new CountWordKind().count("aaaaasa");
	}

}