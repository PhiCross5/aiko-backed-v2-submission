package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import application.service.EquipmentService;


@RestController
public class EquipmentController {

	@Autowired
	public EquipmentService equipmentService;
	
	
	
	
}
