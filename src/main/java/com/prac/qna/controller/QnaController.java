package com.prac.qna.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prac.qna.VO.QnaListVO;
import com.prac.qna.service.QnaService;

@Controller
@RequestMapping("/qna/*")
public class QnaController {

	//Logger
	private static final Logger logger = LoggerFactory.getLogger(QnaController.class);
	
	@Autowired
	QnaService service;
	
	//qna 게시물 목록 조회
	@RequestMapping(value="/qnaList", method=RequestMethod.GET)
	public void qnaList(Model model) throws Exception {
		logger.info("qnaList");
		
		List<QnaListVO> qnaList = service.qnaList();
		
		model.addAttribute("qnaList", qnaList);
	}
	
	//qna 작성 get
	@RequestMapping(value="/qnaWrite", method=RequestMethod.GET)
	public void getQnaWrite() throws Exception {
		logger.info("getQnaWrite");
		
	}
	
	//qna 작성 post
	@RequestMapping(value="/qnaWrite", method=RequestMethod.POST)
	public String postQnaWrite(QnaListVO vo) throws Exception {
		logger.info("postQnaWrite");
		
		service.qnaWrite(vo);
		
		return "redirect:/qna/qnaList";
	}
	
	//qna 게시물 조회
	@RequestMapping(value="/qnaDetail", method=RequestMethod.GET)
	public void qnaDetail(@RequestParam("qNum") int qNum, Model model) throws Exception {
		logger.info("qnaDetail");
		
		QnaListVO vo = service.qnaDetail(qNum);
		
		model.addAttribute("qnaDetail", vo);
	}
	
	//qna 게시물 수정 get
	@RequestMapping(value="/qnaModify", method=RequestMethod.GET)
	public void getQnaModify(@RequestParam("qNum") int qNum, Model model) throws Exception {
		logger.info("qnaModify");
		
		QnaListVO vo = service.qnaDetail(qNum);
		
		model.addAttribute("qnaDetail", vo);
	}
	
	//qna 게시물 수정 post
	@RequestMapping(value="/qnaModify", method=RequestMethod.POST)
	public String postQnaModify(QnaListVO vo) throws Exception {
		logger.info("qnaModify");
		
		service.qnaModify(vo);
		
		return "redirect:/qna/qnaDetail?qNum=" + vo.getqNum();
	}
	
}
