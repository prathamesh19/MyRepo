package com.prathamesh.cloning;

public class Test {
public static void main(String[] args) throws CloneNotSupportedException {
	Address a1=new Address(222222,"pune");
	Address a2=new Address(444444,"mumbai");
	Student s1=new Student(100000, "prathamesh",a1);
	Student s2=(Student)s1.clone();//DEEP CLONING
	System.out.println(s1);
	System.out.println(s2);
	s2.setNm("abhinao");
	System.out.println();
	System.out.println(s1);
	System.out.println(s2);
	
	
}
}
class Student implements Cloneable{
	private int id;
	private String nm;
	private Address ad;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student cloned=(Student)super.clone();
		cloned.setAd((Address)cloned.getAd().clone());
		return cloned;
	}	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String nm, Address ad) {
		super();
		this.id = id;
		this.nm = nm;
		this.ad = ad;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nm=" + nm + ", ad=" + ad + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
}
class Address implements Cloneable{
	private int pin;
	private String city;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}