package com.bits.learn.ss.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bits.learn.ss.exception.LoanNotFoundException;
import com.bits.learn.ss.model.Loan;
import com.bits.learn.ss.repository.LoanRepository;
import com.bits.learn.ss.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService{

private LoanRepository loanRepository;
	
	public LoanServiceImpl(LoanRepository loanRepository) {
		super();
		this.loanRepository = loanRepository;
	}
	
	@Override
	public Loan create(Loan loan) {
		return loanRepository.save(loan);
	}

	@Override
	public Loan get(long id) {
		Optional<Loan> loan = loanRepository.findById(id);
		if(loan.isPresent()) {
			return loan.get();
		}else {
			throw new LoanNotFoundException("Loan","Id",id);
		}
	}

	@Override
	public List<Loan> getAll() {
		return loanRepository.findAll();
	}

}
