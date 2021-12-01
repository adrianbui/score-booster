package com.scoreboosterapp.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "credit card")

public class CreditCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; //to keep track of the card in the DB
	
	@Column(name = "card_number")
	private int cardNumber; //number of card(s) in the account
	
	@Column(name = "card_name")
	private String cardName;
	
	@Column(name = "bank_of_the_card")
	private String bankOfTheCard;
	
	@Column(name = "closing_date")
	private String closingDate;
	
	@Column(name = "due_date")
	private String dueDate;
	
	public CreditCard() {
		
	}
	
	//constructor
	public CreditCard(int cardNumber, String cardName, String bankOfTheCard, String closingDate, String dueDate) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.bankOfTheCard = bankOfTheCard;
		this.closingDate = closingDate;
		this.dueDate = dueDate;
	}
	
	//Getter and Setter
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getBankOfTheCard() {
		return bankOfTheCard;
	}
	public void setBankOfTheCard(String bankOfTheCard) {
		this.bankOfTheCard = bankOfTheCard;
	}
	public String getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(String closingDate) {
		this.closingDate = closingDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
