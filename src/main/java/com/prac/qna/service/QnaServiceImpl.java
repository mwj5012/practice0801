package com.prac.qna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac.qna.VO.QnaListVO;
import com.prac.qna.dao.QnaDAO;

@Service
public class QnaServiceImpl implements QnaService {

	@Autowired
	private QnaDAO dao;
	
	//qna 게시물 목록 조회
	@Override
	public List<QnaListVO> qnaList() throws Exception {
		
		return dao.qnaList();
	}

	//qna 게시물 작성
	@Override
	public void qnaWrite(QnaListVO vo) throws Exception {
		dao.qnaWrite(vo);
	}

	//qna 상세 페이지
	@Override
	public QnaListVO qnaDetail(int qNum) throws Exception {
		
		return dao.qnaDetail(qNum);
	}

	//qna 게시물 수정
	@Override
	public void qnaModify(QnaListVO vo) throws Exception {
		dao.qnaModify(vo);
	}

	@Override
	public void qnaDelete(int qNum) throws Exception {
		dao.qnaDelete(qNum);
	}

}
