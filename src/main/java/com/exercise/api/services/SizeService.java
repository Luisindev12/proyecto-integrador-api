package com.exercise.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.exercise.api.entities.Size;

public class SizeService implements ISizeService {

	@Autowired
	private ISizeRepository sizeRepository;@Override
	public void addSize(Size size) {
		// TODO Auto-generated method stub
		super.addSize(size);
	}
	
	@Override
	public void addSize(Size size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Size> getAllSizes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSize(Long id, Size size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSize(Long id) {
		// TODO Auto-generated method stub
		
	}

}
