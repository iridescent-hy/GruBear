package kr.or.ddit.mapper;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.AlarmRecvVO;
import kr.or.ddit.vo.AtrzLineInfoVO;
import kr.or.ddit.vo.AtrzRfrncVO;
import kr.or.ddit.vo.AtrzVO;
import kr.or.ddit.vo.EdocVO;
import kr.or.ddit.vo.EmpVO;
import kr.or.ddit.vo.PaginationInfoVO;
import kr.or.ddit.vo.SlsInfoVO;

public interface EdocMapper {


	/** 사원번호를 불러와 해당사원의 잔여 연차를 불러오는 메서드
	 * @param empVO
	 * @return
	 */
	public int getCtrHoly(EmpVO empVO);


	/** 결재할 문서의 total을 값을 불러오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getApproveTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 결재할 문서들을 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getApprove(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 전자결재문서번호를 가져와 해당 문서의 결재상황을 출력하는 메서드
	 * @param edocNo
	 * @return
	 */
	public List<Map<String, Object>> getAtrz(String edocNo);


	/** 휴가기안서 insert 메서드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public int createHoli(AtrzLineInfoVO atrzLineInfoVO);


	/** 결재선정보번호를 생성하는 메서드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public int createAtrzLineInfoNo(AtrzLineInfoVO atrzLineInfoVO);


	/** 결재선을 insert하는 메서드
	 * @param atrzVOList
	 * @return
	 */
	public int createAtrzLine(List<AtrzVO> atrzVOList);


	/** 참조자를 insert하는 메소드
	 * @param atrzLineInfoVO
	 */
	public int createAtrzRfrnc(List<AtrzRfrncVO> atrzRfrncVOList);


	/** 일반기안문(업무기안, 증명서신청, 품의서, 지출결의서, 법인카드 사용신청서)를 insert하는 메서드
	 * @param atrzLineInfoVO
	 */
	public void createDrft(AtrzLineInfoVO atrzLineInfoVO);


	/** 전자문서공통 insert 메서드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public int createEdoc(AtrzLineInfoVO atrzLineInfoVO);


	/** 휴가기안서 detail 가져오는 메서드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public List<AtrzLineInfoVO> holiDetail(AtrzLineInfoVO atrzLineInfoVO);



	/** 전자결재문서번호를 가져와 기안자의 정보를 가져오는 메서드
	 * @param atrzLineInfoVO
	 */
	public Map<String,Object> getEmpInfo(AtrzLineInfoVO atrzLineInfoVO);


	/** 전자결재문서번호를 가져와 해당 문서의 참조자를 출력하는 메서드
	 * @param edocNo
	 * @return
	 */
	public List<Map<String, Object>> getAtrzRfrnc(String edocNo);


	/** 결재 메서드
	 * @param infoData
	 * @return
	 */
	public int updateAtrz(Map<String, Object> infoData);


	/** 일반기안문의 Deatil을 불러오는 메서드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public List<AtrzLineInfoVO> drftDetail(AtrzLineInfoVO atrzLineInfoVO);


	/** 결재진행문서의 total 갯수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getApprovedTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 결재진행문서를 페이징처리하여 select하는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getApproved(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 참조문서함의 total 갯수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getAtrzRfrncTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 참조문서를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getAtrzRfrncBox(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 매출보고서를 insert 하는 메서드
	 * @param atrzLineInfoVO
	 */
	public void createSlsReport(AtrzLineInfoVO atrzLineInfoVO);


	/** 매출보고정보를 insert하는 메서드
	 * @param atrzLineInfoVO
	 */
	public void createSlsInfo(List<SlsInfoVO> sleInfoList);


	/** 매출보고서의 detail을 가져오는 메서드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public List<AtrzLineInfoVO> slsDetail(AtrzLineInfoVO atrzLineInfoVO);


	/** 결재선에 내가 포함되어있는 결재완료 문서의 총 개수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getCompleteTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 결재선에 내가 포함되어있는 결재완료 문서을 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getCompleteBox(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 참조인에 내가 포함되어있고, 참조확인을 완료한 문서의 개수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getAtrzRfrncCompleteTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/**참조인에 내가 포함되어있고, 참조확인을 완료한 문서를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getAtrzRfrncCompleteBox(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 내가 기안한 문서의 총 개수를 구하는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getDraftingTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 내가 기안한 문서를 구하는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getDrafting(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 문서 반려 메서드
	 * @param infoData
	 * @return
	 */
	public int rejectAtrz(Map<String, Object> infoData);


	/** 반려문서의 총 개수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getRejectTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 반려문서를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getRejectBox(PaginationInfoVO<AtrzLineInfoVO> pagingVO);


	/** 반려의견을 가져오는 메서드
	 * @param infoData
	 * @return
	 */
	public Map<String, Object> getRjctRsn(Map<String, Object> infoData);


	/** 반려된 문서를 삭제하는 메서드
	 * @param edocNo
	 * @return
	 */
	public int deleteEdoc(String edocNo);


	/**
	 * @param infoData
	 * @return infoData를 이용해 AtrzSeq 가져오기
	 */
	public int getAtrzSeq(Map<String, Object> infoData);


	/**
	 * @param infoData
	 * @return 다음 결재자가 있는지
	 */
	public int getAtrzCnt(Map<String, Object> infoData);


	/**
	 * @param infoData
	 * @return 결재할 기안서의 정보
	 */
	public EdocVO getEdoc(Map<String, Object> infoData);


	/**
	 * 알림테이블에 넣기
	 * @param edocVO
	 */
	public void createAlarm(EdocVO edocVO);


	/**
	 * @param infoData
	 * @return 다음 결재자 사원번호
	 */
	public String getEmpNO(Map<String, Object> infoData);


	/**
	 * 알림 수신자 테이블에 등록
	 * @param alarmRecvVO
	 */
	public void createAlarmRecv(AlarmRecvVO alarmRecvVO);


	/** 마지막 결재여부를 리턴하는 메서드
	 * @param infoData
	 * @return
	 */
	public String lastAtrzCheck(Map<String, Object> infoData);


	/** 마지막 결재여부가 'Y' 이면 EDOC의 총결여부를 Y해주는 메서드
	 * @param infoData
	 * @return
	 */
	public int lastEdocY(Map<String, Object> infoData);


	/** 휴가기안서가 총 결재되면, 해당 기안자의 연차가 - 되는 메서드
	 * @param infoData
	 * @return
	 */
	public int edupdateEmpCrtHoli(Map<String, Object> infoData);


	/**
	 * @param atrzLineInfoNo
	 * @return 참조된 문서의 정보 가져오기
	 */
	public EdocVO getEdocInfo(String atrzLineInfoNo);


	/**
	 * 참조자 알림 등록
	 * @param edocVO
	 */
	public void createRfAlarm(EdocVO edocVO);


	/**
	 * 참조자 알림 수신자등록
	 * @param empNO
	 */
	public void createRfAlarmRecv(String empNO);


	/** 참조자가 null일때 holiDetail가져오기
	 * @param atrzLineInfoVO
	 * @return
	 */
	public List<AtrzLineInfoVO> holiDetail2(AtrzLineInfoVO atrzLineInfoVO);


	/** 결재선 상태를 update 하는 메서드
	 * @param atrzVOList
	 * @return
	 */
	public int updateAtrzLine(String lineInfoNo);


	/** 전자문서공통 update 메소드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public int updateEdoc(AtrzLineInfoVO atrzLineInfoVO);


	/** 일반기안문 update 메서드
	 * @param atrzLineInfoVO
	 */
	public void updateDrft(AtrzLineInfoVO atrzLineInfoVO);


	/** 내 결재선 상태를 바꾸는 메서드
	 * @param lineInfoNo
	 */
	public void updateAtrzLineMe(String lineInfoNo);


	/** 참조완료처리 메서드
	 * @param infoData
	 * @return
	 */
	public int atrzRfrncY(Map<String, Object> infoData);





}
