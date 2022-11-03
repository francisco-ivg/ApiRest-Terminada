package com.example.persona.entities;

import org.springframework.stereotype.Service;

import com.example.persona.repositories.BaseRepository;
import com.example.persona.services.BaseServiceImpl;



@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

	public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
		super(baseRepository);
		
	}
	
}
