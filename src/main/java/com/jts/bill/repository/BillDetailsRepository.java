package com.jts.bill.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jts.bill.entity.BillDetails;

public interface BillDetailsRepository extends JpaRepository<BillDetails, Long> {

	@Query(value = "select b from BillDetails b where b.serviceRequestNo = :serviceRequestNo and paymentDone = :paymentDone")
	List<BillDetails> findBilDetails(@Param("serviceRequestNo") String serviceRequestNo, @Param("paymentDone") String paymentDone);

}
