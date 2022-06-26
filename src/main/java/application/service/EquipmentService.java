package application.service;

import org.springframework.beans.factory.annotation.Autowired;

import application.data.repository.EquipmentRepository;

public class EquipmentService {

	@Autowired
	private final EquipmentRepository repository;
}
