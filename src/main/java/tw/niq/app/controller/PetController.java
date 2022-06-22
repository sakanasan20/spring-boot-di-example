package tw.niq.app.controller;

import org.springframework.stereotype.Controller;

import tw.niq.pet.service.PetService;

@Controller
public class PetController {

	private final PetService petService;
	
	public PetController(PetService petService) {
		this.petService = petService;
	}

	public String getBestPet() {
		return petService.getBestPet();
	}
	
}
