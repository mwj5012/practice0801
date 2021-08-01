package com.prac.qna.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prac.qna.VO.QnaListVO;

@Repository
public class QnaDAO {
	
	@Autowired
	private SqlSession sql;
	
//	private static String namespace = "qnaMapper";
	
	//qna 게시물 목록 조회
	public List<QnaListVO> qnaList() throws Exception{
		
		return sql.selectList("qnaMapper.qnaList");
	}
	
	//qna 게시물 작성
	public void qnaWrite(QnaListVO vo) throws Exception{
		sql.insert("qnaMapper.qnaWrite", vo);
	}
	
	//qna 상세페이지
	public QnaListVO qnaDetail(int qNum) {
		
		return sql.selectOne("qnaMapper.qnaDetail", qNum);
	}
}
