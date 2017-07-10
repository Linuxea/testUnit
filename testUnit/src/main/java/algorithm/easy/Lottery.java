package algorithm.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Linuxea 林修论
 * @date   2016年7月21日
 * @description 类的描述语句
 * @version 1.0
 * @return 
 */
/*
 * 第一步生成中奖号码
   1 - 35  随机生成6个不重复的红球 ,  再从1 -15中随机生成一个篮球 
   1 2 13 15 23 34 | 8

   第二步  提示用户输入 中奖号码 6个篮球  1个红球 

   第三步 ： 判断中获情况 打出中奖信息

 */
public class Lottery {
	
	List<Integer> lists = new ArrayList<>();//存放六个红球数字
	int head;//另外一个蓝字
	
	
	public static void main(String[] args) {
		Lottery lo = new Lottery();
		
		//前面随机生成6个互不相同的数
		for(int ii = 0;ii<6;ii++){
			int random_num = (int)(Math.random()*35+1);
			boolean flag = true;
				if(lo.lists.size()!=0){
					for(int i = 0;i<lo.lists.size();i++){
						if(lo.lists.get(i) == random_num){
							flag = false;
						}
				}
					if(flag){
						lo.lists.add(random_num);
					}else{
						ii-=1;
						continue;
					}
			}
				else lo.lists.add(random_num);
		}
		
		
		lo.lists.add((int)(Math.random()*15+1));
		System.out.println("随机生成的数字如下:"+lo.lists);
		
		System.out.println("请按顺序输入6个蓝球数字，还有一个红球数字");
		Scanner sc = new Scanner(System.in);
		List<Integer> newList = new ArrayList<>();
		for(int i = 0;i<=6;i++){
			int temp = sc.nextInt();
			if(i<6){
				if(temp>0 && temp<36) {
					boolean flag = true;
					for(int k = 0;k<newList.size();k++){
						if(newList.get(k) == temp){
							System.out.println("请不要输入重复的数字!");
							flag = false;
						}
					}
					if(flag){
						newList.add(temp);
					}
						
					else{
						i-=1;
						continue;
					}
				}
					
				else {
					System.out.println("数字不要超过35或者小于等于0");
					i-=1;
					continue;
				}
			}else{
				if(temp>0 && temp<16){
					newList.add(temp);
				}else {
					System.out.println("数字不要超过15或者小于等于0!");
					i-=1;
					continue;
				}
				
			}
		}
		System.out.println("你输入的数字为:"+newList);
		sc.close();
		//以下是检验你输入的数字中将等级
		int k = 0;//表示红球中奖数字的个数
		int kk = 0;//表示蓝球是否相同
		for(int i = 0;i<6;i++){
			for(int j = 0 ;j<6;j++){
				if(lo.lists.get(i) == newList.get(j)){
					k++;
				}
			}
		}
		if(lo.lists.get(6) == newList.get(6))
			kk+=1;
		if(k == 6)System.out.println("恭喜您!红球全部中奖");
		else System.out.println("红球总共有"+k+"个相同的");
		if(kk == 1)System.out.println("蓝球相同!!!!");
		else System.out.println("篮球不同:(");
		
		  if(kk==1 && k<=3 ){
				System.out.println("恭喜您,中奖了,金额5元");
		 }else if(kk == 0 && k == 4){
				System.out.println("恭喜您,中奖了,金额5元");
		 }else if(kk == 0 && k == 5){
				System.out.println("恭喜您,中奖了,金额200元");
		 }else if(kk == 0 && k == 6){
				System.out.println("恭喜您,中奖了,金额20000元");
		 }else if(kk==1 && k == 4){
				System.out.println("恭喜您,中奖了,金额10元");
		 }else if(kk==1 && k == 5){
				System.out.println("恭喜您,中奖了,金额3000元");
		 }else if(kk==1 && k == 6){
				System.out.println("恭喜您,中奖了,金额1000万元");
		 }else{
			    System.out.println("谢谢惠顾,您没有中奖,继续买吧！");
		 }
	}
}


