package com.anabneri.pokedex.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.anabneri.pokedex.model.Pokemon;

public interface PokedexRepository extends ReactiveMongoRepository <Pokemon, String> {
	
}