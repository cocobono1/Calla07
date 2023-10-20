package project.spring.calla.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.spring.calla.domain.FBoardVO;
import project.spring.calla.pageutil.PageCriteria;

@Repository // @Component
// - ���� ����(Persistence Layer)�� DB ���� ����� ���
// - Spring Component bean���� �����
// - servlet-context.xml�� component-scan�� ����
//	 ������ Component�� ã�ƿ� bean���� ���
// - <context:component-scan ../>
public class FBoardDAOImple implements FBoardDAO {
	private static final Logger logger =
			LoggerFactory.getLogger(FBoardDAOImple.class);
	
	private static final String NAMESPACE = 
			"project.spring.calla.FreeBoardMapper";
	
	// MyBatis�� SqlSession�� ����ϱ� ����
	// ������ �����ӿ�ũ�� ������ bean�� ����(injection)����
	@Autowired
	private SqlSession sqlSession;
	

	@Override
	public int insert(FBoardVO vo) {
		logger.info("insert() ȣ��");

		return sqlSession.insert(NAMESPACE + ".insert", vo);
		// NAMESPACE�� ������ mapper�� ã�ư��� id="insert"��
		// <insert> �±׿� vo �����͸� ����
	}

	@Override
	public List<FBoardVO> select() {
		logger.info("select() ȣ��");
		return sqlSession.selectList(NAMESPACE + ".select_all");
	}

	@Override
	public FBoardVO select(int fBoardId) {
		logger.info("select() ȣ�� : fBoardId = " + fBoardId);
		return sqlSession.selectOne(NAMESPACE + ".select_by_board_id", fBoardId);
	}

	@Override
	public int update(FBoardVO vo) {
		logger.info("update() ȣ�� : vo = " + vo.toString());
		return sqlSession.update(NAMESPACE + ".update", vo);
	}

	@Override
	public int delete(int fBoardId) {
		logger.info("delete() ȣ�� : fBoardId = " + fBoardId);
		return sqlSession.delete(NAMESPACE + ".delete", fBoardId);
	}

	@Override
	public List<FBoardVO> select(PageCriteria criteria) {
		logger.info("select() ȣ��");
		logger.info("start = " + criteria.getStart());
		logger.info("end = " + criteria.getEnd());
		return sqlSession.selectList(NAMESPACE + ".paging", criteria);
	}

	@Override
	public int getTotalCounts() {
		logger.info("getTotalCounts()");
		return sqlSession.selectOne(NAMESPACE + ".total_count");
	}

	@Override
	public List<FBoardVO> select(String memberNickname) {
		logger.info("select() ȣ�� : memberNickname = " + memberNickname);
		return sqlSession.selectList(NAMESPACE + ".select_by_memberid", "%" + memberNickname + "%");
	}

	@Override
	public List<FBoardVO> selectByTitleOrContent(String keyword) {
		logger.info("selectByTitleOrContent() ȣ��");
		return sqlSession.selectList(NAMESPACE + ".select_by_title_content", "%" + keyword + "%");
	}

	@Override
	public int updateCommentCount(int amount, int fBoardId) {
		logger.info("updateCommentCount() : fBoardId = " + fBoardId);
		Map<String, Integer> args = new HashMap();
		args.put("amount", amount);
		args.put("fBoardId", fBoardId);
		return sqlSession.update(NAMESPACE + ".update_comment_count", args);
	}

	@Override
	public int updateViews(int views, int fBoardId) {
		logger.info("updateViews() : fBoardId = " + fBoardId);
		Map<String, Integer> args = new HashMap();
		args.put("views", views);
		args.put("fBoardId", fBoardId);
		return sqlSession.update(NAMESPACE + ".update_views", args);
	}
}