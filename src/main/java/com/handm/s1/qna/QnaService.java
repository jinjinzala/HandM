package com.handm.s1.qna;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handm.s1.util.FileManager;
import com.iu.s1.bankBook.BankBookDTO;
import com.iu.s1.util.Pager;

@Service
public class QnaService {
	
	@Autowired
	private QnaDAO qnaDAO = new QnaDAO();
	
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private FileManager fileManager;
	
	//페이저부터 만들어야겠다 희진아 정신차려 
	 public List<QnaDTO> getQnaList(Pager pager) throws Exception{
	 pager.makeRow(); 
	 Long totalCount = qnaDAO.getQnaList(pager);
	  
	 pager.makeNum(totalCount);
	  
	 return qnaDAO.getQnaList(pager);
	 }
	 
	
	
	
	
	
	
	
	
	
}
