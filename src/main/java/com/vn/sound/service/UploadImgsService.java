package com.vn.sound.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.sound.model.UploadImgs;
import com.vn.sound.repository.UploadImgsRepository;

@Service
public class UploadImgsService {
	@Autowired
	private UploadImgsRepository uploadImgsRepository;

	public void saveImgs(String fullPathImg) {
		UploadImgs uploadImgs = new UploadImgs();
		uploadImgs.setSrcImg(fullPathImg);
		uploadImgsRepository.save(uploadImgs);
	}
}
