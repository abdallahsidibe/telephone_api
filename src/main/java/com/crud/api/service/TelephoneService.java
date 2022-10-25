package service;

import java.util.*;
import models.Telephone;

public interface TelephoneService {
	
	Telephone create(Telephone telephone);
	
	List<Telephone> read();
	
	Telephone update(Long id, Telephone telephone);
	
	String delete(Long id);

}
