package com.handm.s1.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.handm.s1.util.Pager;



@Repository
public class QnaDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.handm.s1.qna.QnaDAO.";
	
	
	public Long getQnaCount(Pager pager) throws Exception {

		return sqlSession.selectOne(NAMESPACE+"getQnaCount");

	}
	
	
	//id는 메서드명과 동일하게 넣기 
	public List<QnaDTO> getQnaList(Pager pager) throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"getQnaList",pager);
	} 
	
	
	
}
