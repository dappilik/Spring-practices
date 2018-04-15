package com.krishna.repository;

import com.krishna.model.Institute;

public class InstituteRepositoryImpl implements InstituteRepository {

	/* (non-Javadoc)
	 * @see com.krishna.repository.InstituteRepository#searchInstitute()
	 */
	@Override
	public Institute searchInstitute() {
		
		Institute institute = new Institute();

		institute.setName("IIITDM Jabalpur");
		institute.setRating(4);

		return institute;
	}
}
