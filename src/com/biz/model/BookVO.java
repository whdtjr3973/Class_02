package com.biz.model;

public class BookVO {

	private String title;
	private String auth;
	private String comp;
	private int price;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * toString() �޼���� ���� ObjectŬ������ ����� method�̴�
	 * ��  method�� ��ü�� ����Ǵ� �޸��� �ּҸ� �˷��ִ� �뵵�̴�.
	 * 
	 * BookVO Ŭ������ ���� �����ڴ�
	 * Object�κ��� �������� toString()�޼��带
	 * �ٽ� �����Ͽ� �ʵ忡 �Էµ� ������ �����ִ� ���ڿ���
	 * �����ϰ�, �� ���ڿ��� return�ϴ� �޼���� �������.
	 * 
	 * �̷��� � Ŭ�����κ��� �������� method�� �ٽ� �����ϴ� ����
	 * Override ��� �Ѵ�.
	 */
	@Override
	public String toString() {
		return "BookVO [title=" + title + ", auth=" + auth + ", comp=" + comp + ", price=" + price + "]";
	}
	
	
	
	
	
}
