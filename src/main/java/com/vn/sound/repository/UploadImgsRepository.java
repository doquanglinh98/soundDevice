package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.UploadImgs;

@Repository
public interface UploadImgsRepository extends JpaRepository<UploadImgs, Long> {
	boolean existsBySrcImg(String srcImg);

	@Query("SELECT u FROM UploadImgs u WHERE u.srcImg LIKE %:srcImg%")
	UploadImgs findUploadImgsBySrcImg(@Param("srcImg") String srcImg);
}
