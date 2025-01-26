package io.shashanksm.ims.dtos;

public record DataDictionaryItem(
		Long id, 
		String dkey, 
		String dvalue, 
		String entityType, 
		Long entityValue,
		String comments
) {}
