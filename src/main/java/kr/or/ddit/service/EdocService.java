package kr.or.ddit.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.AtrzLineInfoVO;
import kr.or.ddit.vo.EmpVO;
import kr.or.ddit.vo.PaginationInfoVO;

public interface EdocService {

	public int getCtrHoly(EmpVO empVO);

	public int getApproveTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	public List<Map<String,Object>> getApprove(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	public List<Map<String,Object>> getAtrz(String edocNo);

	public int createEdocPost(AtrzLineInfoVO atrzLineInfoVO);

	public List<AtrzLineInfoVO> holiDetail(AtrzLineInfoVO atrzLineInfoVO);

	public Map<String,Object> getEmpInfo(AtrzLineInfoVO atrzLineInfoVO);

	public List<Map<String, Object>> getAtrzRfrnc(String edocNo);

	public int updateAtrz(Map<String, Object> infoData);

	public List<AtrzLineInfoVO> drftDetail(AtrzLineInfoVO atrzLineInfoVO);

	public int getApprovedTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	public List<Map<String, Object>> getApproved(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	public int getAtrzRfrncTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	public List<Map<String, Object>> getAtrzRfrncBox(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	/** 매출보고서의 detail을 가져오는 메서드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public List<AtrzLineInfoVO> slsDetail(AtrzLineInfoVO atrzLineInfoVO);


	/** 결재선에 내가 포함되어있는 결재 완료 문서함의 총 개수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getCompleteTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	/** 결재선에 내가 포함되어있고, 총결재가 완료된 문서를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getCompleteBox(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	/** 참조인에 내가 포함되어있고, 확인을 완료한 문서의 개수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getAtrzRfrncCompleteTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	/**  참조인에 내가 포함되어있고, 확인을 완료한 문서를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getAtrzRfrncCompleteBox(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	/** 내가 기안한 문서의 총 개수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getDraftingTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	/** 내가 기안한 문서를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getDrafting(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	/** 기안서를 반려하는 메서드
	 * @param infoData
	 * @return
	 */
	public int rejectAtrz(Map<String, Object> infoData);

	/** 내가쓴 문서의 반려문서의 총 개수를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getRejectTotal(PaginationInfoVO<AtrzLineInfoVO> pagingVO);

	/** 내가쓴문서의 반려된 문서를 가져오는 메서드
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

	/** 재기안 메소드
	 * @param atrzLineInfoVO
	 * @return
	 */
	public int edocUpdatePost(AtrzLineInfoVO atrzLineInfoVO);

	/** 참조완료처리 메서드
	 * @param infoData
	 * @return
	 */
	public int atrzRfrncY(Map<String, Object> infoData);


}
