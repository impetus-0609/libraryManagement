package co.jp.impetus.mapper;

import co.jp.impetus.dto.DetailsDto;

public interface CmnApiMapper {

	void insertDetail(DetailsDto dto);
	void updateDetail(DetailsDto dto);
	DetailsDto findByIsbn(DetailsDto dto);
}
