package com.jts.bill.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jts.bill.entity.BillDetails;
import com.jts.bill.entity.GenerateBillRequest;
import com.jts.bill.service.BillDetailsService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class BillDetailsController {

	private BillDetailsService billDetailsService;
	
	@GetMapping(path = "/getBillDetails")
	public ResponseEntity<List<BillDetails>> getBillDetails(@RequestParam String serviceRequestNo) {
		return ResponseEntity.ok(billDetailsService.getBillDetails(serviceRequestNo));
	}
	
	@PutMapping(path = "/doPayment")
	public ResponseEntity<String> doPayment(@RequestParam Long id, @RequestParam String amount) {
		return new ResponseEntity<>(billDetailsService.doPayment(id, amount), HttpStatus.OK);
	}
	
	@PostMapping(path = "/generateBill")
	public ResponseEntity<String> generateBill(@RequestBody GenerateBillRequest request) {
		return new ResponseEntity<>(billDetailsService.generateBill(request), HttpStatus.OK);
	}
}
