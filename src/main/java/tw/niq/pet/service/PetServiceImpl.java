package tw.niq.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {
	
	@Value("${tw.niq.app.best-pet}")
	@Autowired
	private String bestPet;

	@Override
	public String getBestPet() {
		return bestPet + " is the best pet.";
	}

}
