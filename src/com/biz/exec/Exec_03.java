package com.biz.exec;

import com.biz.model.BookVO;
import com.biz.model.ScoreVO;

public class Exec_03 {

	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO();
		BookVO bVO = new BookVO();

		scVO.setNumber("1");
		scVO.setKor(90);
		scVO.setEng(80);
		scVO.setMath(70);

		bVO.setTitle("�̰��� �ڹٴ�");
		bVO.setAuth("�ſ��");
		bVO.setComp("�Ѻ��̵��");
		bVO.setPrice(30000);

		System.out.printf("�й� : %s \n", scVO.getNumber());
		System.out.printf("���� : %d \n", scVO.getkor());
		System.out.printf("���� : %d \n", scVO.getEng());
		System.out.printf("���� : %d \n", scVO.getMath());

		int intTotal = scVO.getkor();
		intTotal += scVO.getEng();
		intTotal += scVO.getMath();
		System.out.printf("���� : %d \n", intTotal);

	}

}
