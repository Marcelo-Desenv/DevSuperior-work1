package com.devsuperior.marcelo.work1.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.marcelo.work1.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria Silva", "12345678901", 6500.00, Instant.parse("1994-07-20T10:30:00Z") , 2));
		list.add(new Client(2L, "Carolina", "23456789045", 2300.00, Instant.parse("1989-02-08T16:20:00Z"), 1));
		
		return ResponseEntity.ok().body(list);
	}
}
