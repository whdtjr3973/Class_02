package com.biz.exec;

import com.biz.model.BookVO;

public class Exec_07 {

	public static void main(String[] args) {

		BookVO bVO = new BookVO();
		bVO.setTitle("�̰��� �ڹٴ�");
		bVO.setAuth("�ſ��");
		bVO.setComp("�Ѻ��̵��");
		bVO.setPrice(30000);
		
		System.out.println(bVO.toString());
		
		
	}

}
