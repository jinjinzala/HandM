package com.handm.s1.qna;

import java.util.List;

import javax.print.attribute.standard.PageRanges;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.handm.s1.util.Pager;

@Controller
@RequestMapping("/qna/*")

public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@RequestMapping (value="list", method = RequestMethod.GET)
	public ModelAndView getQnaList() throws Exception {
	ModelAndView mv = new ModelAndView();
	List<QnaDTO> ar = qnaService.getQnaList();
	
	mv.setViewName("qna/list");
	mv.addObject("list",ar);
	
	return mv;
	}
	
	
}
