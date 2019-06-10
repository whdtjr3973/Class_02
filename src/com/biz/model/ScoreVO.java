package com.biz.model;

/*
 *  VO : Value Object �ٸ������� �̵���ų�� ����ϴ� Class
 *  ����� ���� ������� �ϸ�
 *  ��������� ������ ��Ƽ� �ٸ� method�� �����ų�
 *  method ���� �����ϴ� ���� �޴� �뵵�� ���ȴ�
 *  
 *  �� extends Object
 *  --�����ڰ� � Ŭ������ �����ϸ�
 *  --�ڵ带 �����ۼ����� �ʾƵ�
 *  -- �ڵ����� �����Ǵ� ������ �ʴ� �ڵ�
 *  -- �ڹٿ� �⺻������ ����ִ� Object��� Ŭ������
 *  -- method ���� ����Ҽ� �ֵ��� ���ִ� ����
 */

public class ScoreVO extends Object {

	// private : �ƹ��� �Ժη� ���������
	// ����(����, �б���)���� ����
	private String number;

	// ������ ����
	private int kor;
	private int eng;
	private int math;

	private int total;
	private int avg;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getkor() {
		return this.kor;
	}

	// ��ü�� ĸ��ȭ
	public void setKor(int kor) {
		if (kor > 100 || kor < 0) {
			System.out.printf("��������(%d)�� 0�� �̻� 100�� ���ϸ� �����մϴ�. \n", kor);
		} else {
			this.kor = kor;
		}
	}

	public String toString() {
		return "�й�:" + this.number
			+ "����:" + this.kor
			+ "����:" + this.eng
			+ "����:" + this.math;
	}
	}
