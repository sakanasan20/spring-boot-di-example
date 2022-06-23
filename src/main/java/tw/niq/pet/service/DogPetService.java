package tw.niq.pet.service;

public class DogPetService implements PetService {
	
	@Override
	public String getBestPet() {
		return "Dog is the best pet.";
	}

}
