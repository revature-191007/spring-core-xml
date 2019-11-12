package com.revature.models;

public class Phone {
	private int id;
	private String modelName;
	private String brand;
	private String serviceProvider;
	private OS nokiaOS;
	private String phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("set id");
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		System.out.println("set model name");
		this.modelName = modelName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("set brand: " + brand);
		this.brand = brand;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		System.out.println("set service provider");
		this.serviceProvider = serviceProvider;
	}

	public OS getNokiaOS() {
		return nokiaOS;
	}

	public void setNokiaOS(OS os) {
		System.out.println("set OS");
		this.nokiaOS = os;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		System.out.println("set phone number");
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + id;
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + ((nokiaOS == null) ? 0 : nokiaOS.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((serviceProvider == null) ? 0 : serviceProvider.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (id != other.id)
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (nokiaOS == null) {
			if (other.nokiaOS != null)
				return false;
		} else if (!nokiaOS.equals(other.nokiaOS))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (serviceProvider == null) {
			if (other.serviceProvider != null)
				return false;
		} else if (!serviceProvider.equals(other.serviceProvider))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", modelName=" + modelName + ", brand=" + brand + ", serviceProvider="
				+ serviceProvider + ", os=" + nokiaOS + ", phoneNumber=" + phoneNumber + "]";
	}

	public Phone(int id, String modelName, String brand, String serviceProvider, OS os, String phoneNumber) {
		System.out.println("args phone");
		this.id = id;
		this.modelName = modelName;
		this.brand = brand;
		this.serviceProvider = serviceProvider;
		this.nokiaOS = os;
		this.phoneNumber = phoneNumber;
	}

	public Phone() {
		System.out.println("no args phone");
	}

}
