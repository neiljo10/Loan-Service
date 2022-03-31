package com.bits.learn.ss.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.learn.ss.model.Loan;
import com.bits.learn.ss.service.LoanService;


@RestController
@RequestMapping("/loan")
public class LoanController {

	private LoanService loanService;

	public LoanController(LoanService loanService) {
		super();
		this.loanService = loanService;
	}
	
	@PostMapping()
	public ResponseEntity<Loan> create(@RequestBody Loan loan){
		return new ResponseEntity<Loan>(loanService.create(loan), HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Loan> get(@PathVariable("id") long id){
		return new ResponseEntity<Loan>(loanService.get(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Loan>> getAll(){
		return new ResponseEntity<List<Loan>>(loanService.getAll(), HttpStatus.OK);
	}
}
