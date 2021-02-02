package com.thinkitive;

public class Address {
	private int pin;
	private String sal;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pin;
		result = prime * result + ((sal == null) ? 0 : sal.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", sal=" + sal + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (pin != other.pin)
			return false;
		if (sal == null) {
			if (other.sal != null)
				return false;
		} else if (!sal.equals(other.sal))
			return false;
		return true;
	}
	public Address(int pin, String sal) {
		super();
		this.pin = pin;
		this.sal = sal;
	}
	public Address() {
		super();
	}
	
	

}
