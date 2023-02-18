package com.handm.s1.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.handm.s1.qna.QnaDAO.";
	

	
	
	//id는 메서드명과 동일하게 넣기 
	public List<QnaDTO> getQnaList() throws Exception {
		List<QnaDTO> ar = sqlSession.selectList(NAMESPACE+"getQnaList");
		return ar;
	}


	public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception {		
	
		return sqlSession.selectOne(NAMESPACE+"getQnaDetail", qnaDTO);
	}

	public int setQnaAdd(QnaDTO qnaDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setQnaAdd",qnaDTO);
	}
	
	public int setQnaUpdate(QnaDTO qnaDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setQnaUpdate", qnaDTO);
	}
	
	public int setQnaDelete (QnaDTO qnaDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"setQnaDelete", qnaDTO);
	}
	

	
}
