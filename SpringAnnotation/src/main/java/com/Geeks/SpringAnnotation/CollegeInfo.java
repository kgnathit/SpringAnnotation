package com.Geeks.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class CollegeInfo {
	@Autowired
	InsituteArea south;
	public InsituteArea getSouth() {
		return south;
	}
	public void setSouth(InsituteArea south) {
		this.south = south;
	}
	public void details()
	{
		System.out.println("This College is located inside University");
		south.area();
	}

}
