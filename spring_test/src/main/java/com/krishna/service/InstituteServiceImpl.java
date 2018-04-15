package com.krishna.service;

import com.krishna.model.Institute;
import com.krishna.repository.InstituteRepository;

public class InstituteServiceImpl implements InstituteService {

	InstituteRepository institute;
	
	public InstituteServiceImpl(){
	}
	
	public InstituteServiceImpl(InstituteRepository institute){
		this.institute = institute;
	}
	public Institute searchInstitute() {
		return institute.searchInstitute();
	}

	public void setInstituteRepository(InstituteRepository institute) {
		this.institute = institute;
	}
}
