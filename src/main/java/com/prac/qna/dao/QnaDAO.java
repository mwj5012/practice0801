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
	public QnaListVO qnaDetail(int qNum) throws Exception{
		
		return sql.selectOne("qnaMapper.qnaDetail", qNum);
	}
	
	//qna 게시물 수정
	public void qnaModify(QnaListVO vo) throws Exception{
		sql.update("qnaMapper.qnaModify", vo);
	}
	
	//qna 게시물 삭제
	public void qnaDelete(int qNum) throws Exception{
		sql.delete("qnaMapper.qnaDelete", qNum);
	}
	
}
