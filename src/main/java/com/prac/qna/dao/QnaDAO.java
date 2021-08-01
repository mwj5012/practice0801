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

}
