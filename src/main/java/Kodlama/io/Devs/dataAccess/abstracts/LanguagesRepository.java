package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguagesRepository {
	List<Languages> getAll();
	
	void add(Languages language);
	void delete(int id);
	void update(Languages language);
	Languages getById(int id);

}
