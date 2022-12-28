package fullstream;

import java.util.List;

class TempStudent {
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumbers;
	
	public TempStudent() {
		// TODO Auto-generated constructor stub
	}

	public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
}	
	
	class Student {
		private String name;
		private int age;
		private Address address;
		private List<MobileNumber> mobileNumbers;
		
		public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
			super();
			this.name = name;
			this.age = age;
			this.address = address;
			this.mobileNumbers = mobileNumbers;
		}
		public Student() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public List<MobileNumber> getMobileNumbers() {
			return mobileNumbers;
		}
		public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
			this.mobileNumbers = mobileNumbers;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", address=" + address + ", mobileNumbers="
					+ mobileNumbers + "]";
		}
		
		
		
	}
	


class Address{
	private String zipcode;

	public Address(String zipcode) {
		super();
		this.zipcode = zipcode;
	}

	public Address() {
		super();
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + "]";
	}
		
}

class MobileNumber{
	private String number;

	public MobileNumber(String number) {
		super();
		this.number = number;
	}

	public MobileNumber() {
		super();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MobileNumber [number=" + number + "]";
	}
	
	
}
