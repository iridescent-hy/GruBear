package kr.or.ddit.vo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

//매출보고서
@Data
public class SlsReportVO {
	//문서번호
	private String edocNo;
	//계약명
	private String slsCtrtNm;
	//거래처명
	private String slsCnpt;
	//거래처법인번호
	private int slsCorpNo;
	//계산서발행일
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date slsYmd;
	//계정과목코드
	private String subCd;
	//비고
	private String slsExt;
	//총매출합계
	private int totalSlsAmt;
	
	private List<SlsInfoVO> slsInfoVOList;
}
