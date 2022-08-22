package com.eldar.challenge.service.impl;

import com.eldar.challenge.entity.CardEntity;
import com.eldar.challenge.exception.ParamNotFound;
import com.eldar.challenge.repository.CardRepository;
import com.eldar.challenge.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    @Autowired
    private final CardRepository cardRepository;

    public CardEntity save(CardEntity cardEntity) {
        CardEntity result = cardRepository.save(cardEntity);
        return result;
    }

public CardEntity getCardById (String id) {
        Optional<CardEntity> card = cardRepository.findById(id);
        if(card.isEmpty()){
            throw new ParamNotFound("Tarjeta con ID: " + id + " no encontrado");
        }
        return card.get();
    }

}

