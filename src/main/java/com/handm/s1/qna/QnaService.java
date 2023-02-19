package com.handm.s1.qna;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.handm.s1.util.FileManager;





@Service
public class QnaService {
	
	@Autowired
	private QnaDAO qnaDAO = new QnaDAO();
	
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private FileManager fileManager;
	
	
	//페이저부터 만들어야겠다 희진아 정신차려 
	 public List<QnaDTO> getQnaList() throws Exception{
     List<QnaDTO> ar = qnaDAO.getQnaList();
	 return ar;
	 }
	 
	 public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception {
		return qnaDAO.getQnaDetail(qnaDTO);
	}
	 
	 public int  setQnaAdd(QnaDTO qnaDTO, MultipartFile pic) throws Exception {
		 int result = qnaDAO.setQnaAdd(qnaDTO);
		 
		//파일 사진이 없을경우 이미지 네임을 저장하지마!
			if(!pic.isEmpty()) { 
				//pic.getSize()!=0 
				//1. file을 hdd에 저장 
				// 프로젝트 경로가아닌 os가 이용하는 경로
				
				String realPath = servletContext.getRealPath("resources/upload/Qna/");
				System.out.println(realPath);
				String fileName = fileManager.fileSave(pic, realPath);
				
				//2. db에 저장
				QnaImgDTO qnaImgDTO = new QnaImgDTO();
				qnaImgDTO.setFileName(fileName); 
				qnaImgDTO.setOriName(pic.getOriginalFilename());
				qnaImgDTO.setBoardNum(qnaImgDTO.getBoardNum());
				
				//3. 
				result = qnaDAO.setQnaImgAdd(qnaImgDTO);	
			}
		 
		 return qnaDAO.setQnaAdd(qnaDTO);
	 }
	 
	 public int setQnaUpdate(QnaDTO qnaDTO) throws Exception {
		 return qnaDAO.setQnaUpdate(qnaDTO);
	 }
	
	public int setQnaDelete(QnaDTO qnaDTO) throws Exception {
		return qnaDAO.setQnaDelete(qnaDTO);
	}
	 
	 

	
}
