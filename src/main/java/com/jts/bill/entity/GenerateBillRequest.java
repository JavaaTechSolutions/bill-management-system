package com.jts.bill.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateBillRequest {
	private String serviceRequestNo;

	private int totalUnit;

	private String billDate;

}
