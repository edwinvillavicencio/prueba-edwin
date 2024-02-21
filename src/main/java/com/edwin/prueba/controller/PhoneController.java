package com.edwin.prueba.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwin.prueba.model.Client;
import com.edwin.prueba.repository.ClientRepository;

@RestController
@RequestMapping("/edwin/v1")
public class PhoneController {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/phones")
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}
	
	@PostMapping("/phones")
	public Client createClient(@RequestBody Client client)
	{
		return clientRepository.save(client);
	}
}
