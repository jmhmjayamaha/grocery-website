package lk.harshana.dto;

import javax.validation.constraints.NotNull;

public class CustomerDto {

	@NotNull
	private String name;
	private String address;
	
	@NotNull
	private String telNo;

	public CustomerDto() {
		
	}
	
	public CustomerDto(String name, String address, String telNo) {
		super();
		this.name = name;
		this.address = address;
		this.telNo = telNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	
}
