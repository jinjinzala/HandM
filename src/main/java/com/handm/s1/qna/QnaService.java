package com.handm.s1.qna;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class QnaService {
	
	@Autowired
	private QnaDAO qnaDAO = new QnaDAO();
	
	@Autowired
	private ServletContext servletContext;
	
	
	/*
	 * @Autowired private FileManager fileManager;
	 */
	
	//페이저부터 만들어야겠다 희진아 정신차려 
	 public List<QnaDTO> getQnaList() throws Exception{
     List<QnaDTO> ar = qnaDAO.getQnaList();
	 return ar;
	 }
	 
	 public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception {
		return qnaDAO.getQnaDetail(qnaDTO);
		}


	
}
