package kr.or.ddit.mapper;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.ArchiveVO;
import kr.or.ddit.vo.BookmarkVO;
import kr.or.ddit.vo.PaginationInfoVO;

public interface ArchiveMapper {

	/** 자료실에 자료를 insert하는 메서드
	 * @param vO
	 * @return
	 */
	public int create(List<ArchiveVO> archiveVOList);

	/** 개인자료실의 총 개수를 count하는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getPersonalTotal(PaginationInfoVO<ArchiveVO> pagingVO);

	/** 개인자료실의 자료를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getPersonal(PaginationInfoVO<ArchiveVO> pagingVO);

	/** 자료실의 자료를 삭제하는 메서드
	 * @param map
	 * @return
	 */
	public int deleteFile(Map<String, Object> map);

	/** 공용자료실의 개수를 count하는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getPublicTotal(PaginationInfoVO<ArchiveVO> pagingVO);

	/** 공용자료실을 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getPublic(PaginationInfoVO<ArchiveVO> pagingVO);

	/** 부서자료실의 총 개수를 count하는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getDeptTotal(PaginationInfoVO<ArchiveVO> pagingVO);

	/** 부서자료실의 자료를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getDept(PaginationInfoVO<ArchiveVO> pagingVO);

	/** 북마크를 생성하는 메서드
	 * @param bookmarkVO
	 * @return
	 */
	public int createBookmark(BookmarkVO bookmarkVO);

	/** 즐겨찾는 자료실의 자료의 총개수를 count하는 메서드
	 * @param pagingVO
	 * @return
	 */
	public int getBookmarkTotal(PaginationInfoVO<ArchiveVO> pagingVO);

	/** 즐겨찾는 자료실의 자료를 가져오는 메서드
	 * @param pagingVO
	 * @return
	 */
	public List<Map<String, Object>> getBookmark(PaginationInfoVO<ArchiveVO> pagingVO);

	/** 북마크를 삭제하는 메서드
	 * @param bookmarkVO
	 * @return
	 */
	public int deleteBookmark(BookmarkVO bookmarkVO);

	/** 개인자료실의 사용량을 가져오는 메서드
	 * @param empNo
	 * @return
	 */
	public int getPersonalUsage(String empNo);

	/** 공용자료실의 사용량을 가져오는 메서드
	 * @return
	 */
	public int getpublicUsage();

	/** 부서자료실의 사용량을 가져오는 메서드
	 * @param empNo
	 * @return
	 */
	public int getDeptUsage(String empNo);

	/** 개인자료실의 총 개수와 총 용량을 가져오는 메서드
	 * @param empNo
	 * @return
	 */
	public Map<String, Object> personalImage(Map<String,Object> param);

	/** 부서자료실 이미지의 총 개수와 총 용량을 가져오는 메서드
	 * @param empNo
	 * @return
	 */
	public Map<String, Object> deptImage(String empNo);

	/** 공용자료실 이미지의 총 개수와 총 용량을 가져오는 메서드
	 * @return
	 */
	public Map<String, Object> publicImage();

	/**  개인자료실의 문서의 총 개수와 총 용량을 가져오는 메서드
	 * @param empNo
	 * @return
	 */
	public Map<String, Object> personalDoc(String empNo);

	/** 부서자료실의 문서의 총 개수와 총 용량을 가져오는 메서드
	 * @param empNo
	 * @return
	 */
	public Map<String, Object> deptDoc(String empNo);

	/** 공용자료실의 문서의 총 개수와 총용량을 가져오는 메서드
	 * @return
	 */
	public Map<String, Object> publicDoc();

	/** 개인자료실의 미디어자료의 총 개수와 총 용량을 가져오는 메서드
	 * @param empNo
	 * @return
	 */
	public Map<String, Object> personalMedia(String empNo);

	/** 부서자료실의 미디어자료의 총 개수와 총 용량을 가져오는 메서드
	 * @param empNo
	 * @return
	 */
	public Map<String, Object> deptMedia(String empNo);

	/** 공용자료실의 미디어자료의 총 개수와 총 용량을 가져오는 메서드
	 * @return
	 */
	public Map<String, Object> publictMedia();

}
