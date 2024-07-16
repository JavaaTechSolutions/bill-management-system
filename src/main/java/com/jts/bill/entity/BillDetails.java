package com.jts.bill.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bill_details")
public class BillDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String serviceRequestNo;

	@Column
	private String billNo;

	@Column
	private LocalDate billCreationDate;

	@Column
	private LocalDate billDueDate;

	@Column
	private double billAmount;

	@Column
	private double billAmountAfterDueDate;

	@Column
	private LocalDate paymentDate;

	@Column
	private String billPayment;

	@Column
	private String paymentDone;

}
