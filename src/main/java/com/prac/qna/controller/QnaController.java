package com.prac.qna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prac.qna.VO.QnaListVO;
import com.prac.qna.service.QnaService;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	@Autowired
	QnaService service;
	
	@RequestMapping(value="/qnaList", method=RequestMethod.GET)
	public void qnaList(Model model) throws Exception {
		
		List<QnaListVO> qnaList = service.qnaList();
		
		model.addAttribute("qnaList", qnaList);
	}
	
	//게시물 조회
	@RequestMapping(value="/qnaDetail", method=RequestMethod.POST)
	public void qnaDetail() {
		
	}
	
}
