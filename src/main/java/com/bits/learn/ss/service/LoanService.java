package com.bits.learn.ss.service;

import java.util.List;

import com.bits.learn.ss.model.Loan;

public interface LoanService {

	public Loan create(Loan loan);
	public Loan get(long id);	
	public List<Loan> getAll();
}
