package kr.or.ddit.vo;

import lombok.Data;

//매출정보
@Data
public class SlsInfoVO {
	//매출번호
	private String slsNo;
	//문서번호
	private String edocNo;
	//매출상품
	private String slsGds;
	//매출수량
	private int slsQuantity;
	//매출금액
	private int slsAmt;
}
