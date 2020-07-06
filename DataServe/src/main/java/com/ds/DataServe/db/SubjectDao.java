package com.ds.DataServe.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubjectDao {

  @Autowired
    repo repo1;

  public Subject getRepo() {
	return   repo1.getOne(2l);
	  
  }



}
