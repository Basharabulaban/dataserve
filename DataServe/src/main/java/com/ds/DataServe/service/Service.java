package com.ds.DataServe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.DataServe.db.Subject;
import com.ds.DataServe.db.SubjectDao;
import com.ds.DataServe.db.SubjectDto;

@Component
public class Service {
	
	@Autowired
	SubjectDao subjectDao;
	
	public SubjectDto getsuject() {
		Subject ser =  subjectDao.getRepo();
		SubjectDto dto = new SubjectDto();
		dto.setId(ser.getId());
		dto.setSubjectOwnet(ser.getSubjectOwnet());
		
		dto.setSujecttext(ser.getSujecttext());
		return dto;
		
	}

}
