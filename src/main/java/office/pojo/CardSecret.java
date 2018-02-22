package office.pojo;

import io.github.biezhi.excel.plus.annotation.ExcelField;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author linuxea
 * @date 2018/2/22
 */
public class CardSecret {
	
	@ExcelField(order = 0, columnName = "运营商类型",
			convertType = CardTypeConverter.class)
	private Integer cardType;
	
	@ExcelField(order = 1, columnName = "卡密")
	private String secret;
	
	@ExcelField(order = 2, columnName = "面额")
	private BigDecimal amount;
	
	@ExcelField(order = 3, columnName = "过期时间", datePattern = "yyyy年MM月dd日")
	private Date expiredDate;
	
	public CardSecret(Integer cardType, String secret, BigDecimal amount, Date expiredDate) {
		this.cardType = cardType;
		this.secret = secret;
		this.amount = amount;
		this.expiredDate = expiredDate;
	}
	
	public CardSecret(Integer cardType, String secret, BigDecimal amount) {
		this.cardType = cardType;
		this.secret = secret;
		this.amount = amount;
	}
	
	public Integer getCardType() {
		return cardType;
	}
	
	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}
	
	public String getSecret() {
		return secret;
	}
	
	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public Date getExpiredDate() {
		return expiredDate;
	}
	
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
}
