package com.vn.sound.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EmptyStringToNullConverter implements AttributeConverter<String, String> {
	@Override
	public String convertToDatabaseColumn(String attribute) {
		return (attribute == null || attribute.trim().isEmpty()) || attribute.trim().equals("null") ? null : attribute;
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		return dbData;
	}
}
