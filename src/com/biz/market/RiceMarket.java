package com.biz.market;

public class RiceMarket {

	public int iprice; //���԰���
	public int oprice; //�ǸŰ���
	
	public void margin() {
		int margin = oprice - iprice;
		System.out.println("�Ǹ����ͱ� : " + margin);
	}
	
}
