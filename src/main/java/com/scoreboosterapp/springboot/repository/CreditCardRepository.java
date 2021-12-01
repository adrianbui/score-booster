package com.scoreboosterapp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scoreboosterapp.springboot.model.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long>{

}
