package com.biz.exec;

import com.biz.model.ScoreVO;

public class Exec_04 {

	public static void main(String[] args) {

		// scores�� ScoreVO Ŭ������ 20���� �迭�� ���ุ �� ����
		ScoreVO[] scores = new ScoreVO[20];

		// ������ scores�� ����� �� ����.

		// scores[0].setNumber("1");
		
		// Ŭ���� �迵���� ���ุ �� ���¿�����
		// �аų� ���Ⱑ ��� �Ұ����ϴ�
		// �迭 ��ҿ�ҵ��� ��� �ٽ� �ʱ�ȭ ������� �Ѵ�.
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreVO();
		}
		
	}

}
