package com.prac.qna.service;

import java.util.List;

import com.prac.qna.VO.QnaListVO;

public interface QnaService {
	
	//qna 게시물 목록 조회
	public List<QnaListVO> qnaList() throws Exception;
	
}


