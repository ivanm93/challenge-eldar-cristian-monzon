package com.eldar.challenge.repository;

import com.eldar.challenge.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<CardEntity, String> {
}
