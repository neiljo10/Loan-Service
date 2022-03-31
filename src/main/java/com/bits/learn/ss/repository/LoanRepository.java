package com.bits.learn.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bits.learn.ss.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
