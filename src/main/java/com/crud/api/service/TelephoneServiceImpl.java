package service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import models.Telephone;
import repository.TelephoneRepository;

// @Service : considers the class to be a class that contains business code
@Service

// create a constructor with all the fields
@AllArgsConstructor

public class TelephoneServiceImpl implements TelephoneService {
	
	private final TelephoneRepository telephoneRepository;

	@Override
	public Telephone create(Telephone telephone) {
		return telephoneRepository.save(telephone);
	}

	@Override
	public List<Telephone> read() {
		return telephoneRepository.findAll();
	}

	@Override
	public Telephone update(Long id, Telephone telephone) {
		return telephoneRepository.findById(id)
				.map(t -> {
					t.setPrix(telephone.getPrix());
					t.setNom(telephone.getNom());
					t.setDescription(telephone.getDescription());
					return telephoneRepository.save(t);
				}).orElseThrow(() -> new RuntimeException("Telephone not found !"));
	}

	@Override
	public String delete(Long id) {
		telephoneRepository.deleteById(id);
		return "telephone deleted !";
	}

}
