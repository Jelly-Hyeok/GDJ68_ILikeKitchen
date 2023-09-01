package com.ham.main.product;

import java.sql.Date;
import java.util.List;

public class ProductDTO {
	
	private String partnerNum;

	public String getPartnerNum() {
		return partnerNum;
	}
	public void setPartnerNum(String partnerNum) {
		this.partnerNum = partnerNum;
	}
	
	private Long productNum;
	private String productName;
	private String contents;
	private Date regDate;
	private String address;
	private Long tell;
	private Long price;
	private List<ProductFileDTO> productFileDTOs;
	
	public Long getTell() {
		return tell;
	}
	public void setTell(Long tell) {
		this.tell = tell;
	}
	public List<ProductFileDTO> getProductFileDTOs() {
		return productFileDTOs;
	}
	public void setProductFileDTOs(List<ProductFileDTO> productFileDTOs) {
		this.productFileDTOs = productFileDTOs;
	}
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	
 

}
