package com.scoreboosterapp.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scoreboosterapp.springboot.repository.CreditCardRepository;
import com.scoreboosterapp.springboot.model.CreditCard;

@RestController
@RequestMapping("/api/v1/") //standard API end point
public class CreditCardController {

	@Autowired //inject this repository by Spring container
	private CreditCardRepository creditCardRepository;
	
	// to get all credit cards, use this end point
	@GetMapping("/creditcards")
	public List<CreditCard> getAllCreditCards() {
		return creditCardRepository.findAll();
	}
	
	
	
}
