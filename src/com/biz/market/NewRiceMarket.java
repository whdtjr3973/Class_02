package com.biz.market;

public class NewRiceMarket extends RiceMarket {

	@Override
	public void margin() {
		
		// �Ǹűݾ� / 1.1�� �����ϸ� �ΰ����� �� ���� �Ǹűݾ��� �ǰ�,
		// ���Աݾ� / 1.1�� �����ϸ� �ΰ����� �� ���� ���Աݾ��� �ȴ�.
		float oprice = (float)(this.oprice/1.1);
		float iprice = (float)(this.iprice/1.1);
		
		int oVat =  this.oprice - (int)oprice ;
		int iVat =  this.iprice - (int)iprice ;
		
		
		System.out.printf("�Ǹűݾ� : %f \n" , oprice);
		System.out.printf("���Աݾ� : %f \n" , iprice);
		System.out.printf("���ͱ� : %f\n" , oprice -iprice);
		System.out.printf("������ VAT : %d \n", oVat -iVat);
	}
	
}
