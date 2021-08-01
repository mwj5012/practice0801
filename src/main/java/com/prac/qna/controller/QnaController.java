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
	
	//qna 게시물 목록 조회
	@RequestMapping(value="/qnaList", method=RequestMethod.GET)
	public void qnaList(Model model) throws Exception {
		
		List<QnaListVO> qnaList = service.qnaList();
		
		model.addAttribute("qnaList", qnaList);
	}
	
<<<<<<< HEAD
=======
	//qna 작성 get
	@RequestMapping(value="/qnaWrite", method=RequestMethod.GET)
	public void getQnaWrite() throws Exception {
		
	}
	
	//qna 작성 post
	@RequestMapping(value="/qnaWrite", method=RequestMethod.POST)
	public String postQnaWrite(QnaListVO vo) throws Exception {
		service.qnaWrite(vo);
		
		return "redirect:/qna/qnaList";
	}
	
>>>>>>> qnaWrite
}
