package com.prac.qna.service;

import java.util.List;

import com.prac.qna.VO.QnaListVO;

public interface QnaService {
	
	//qna 게시물 목록 조회
	public List<QnaListVO> qnaList() throws Exception;
	
	//qna 게시물 작성
	public void qnaWrite(QnaListVO vo) throws Exception;
	
	//qna 상세페이지
	public QnaListVO qnaDetail(int qNum) throws Exception;
}


