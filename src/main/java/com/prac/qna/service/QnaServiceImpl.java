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
	
	@Override
	public List<QnaListVO> qnaList() throws Exception {
		
		return dao.qnaList();
	}

}
