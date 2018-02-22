package office;

import io.github.biezhi.excel.plus.ExcelPlus;
import io.github.biezhi.excel.plus.exception.ExcelException;
import office.pojo.CardSecret;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author linuxea
 * @date 2018/2/22
 */
public class Main {
	
	public static void main(String[] args) {
		new Main().test();
	}
	
	private void test() {
		ExcelPlus excelPlus = new ExcelPlus();
		List<CardSecret> cardSecrets = new ArrayList<>();
		cardSecrets.add(new CardSecret(1, "vlfdzepjmlz2y43z7er4", new BigDecimal("20"), new Date()));
		cardSecrets.add(new CardSecret(2, "rasefq2rzotsmx526z6g", new BigDecimal("10")));
		cardSecrets.add(new CardSecret(2, "2ru44qut6neykb2380wt", new BigDecimal("50")));
		cardSecrets.add(new CardSecret(1, "srcb4c9fdqzuykd6q4zl", new BigDecimal("15")));
		
		try {
			excelPlus.export(cardSecrets).writeAsFile(new File("卡密列表.xlsx"));
		} catch (ExcelException e) {
			e.printStackTrace();
		}
	}
	
}
