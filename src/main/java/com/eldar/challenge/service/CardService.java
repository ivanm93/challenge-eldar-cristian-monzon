package com.eldar.challenge.service;

import com.eldar.challenge.entity.CardEntity;

public interface CardService {
    CardEntity save(CardEntity cardEntity);

    CardEntity getCardById(String id);

}
