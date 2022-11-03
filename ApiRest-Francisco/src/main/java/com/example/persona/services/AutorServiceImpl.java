package com.example.persona.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persona.entities.Autor;
import com.example.persona.repositories.AutorRepository;
import com.example.persona.repositories.BaseRepository;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

	@Autowired
	private AutorRepository autorRepository;
	public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
		super(baseRepository);
		
	}
	

}
