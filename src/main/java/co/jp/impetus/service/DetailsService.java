package co.jp.impetus.service;

import java.util.List;

import org.springframework.stereotype.Component;

import co.jp.impetus.dto.DetailsDto;

@Component
public class DetailsService {


	private DetailsDto dto ;


	/**DetailsDtoを返却する*/
	public DetailsDto getDetailsDto() {

		DetailsDto returnDto = this.dto;

		return returnDto;

	}

	/***/
	public DetailsDto testLogic(List<DetailsDto> list) {

		dto = list.get(0);

		return dto;

	}

}
