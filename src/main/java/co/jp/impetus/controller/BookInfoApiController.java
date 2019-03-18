package co.jp.impetus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import co.jp.impetus.dto.BookInfoDto;
import co.jp.impetus.dto.DetailsDto;

@Controller
@RequestMapping(value = "/getInfo")
public class BookInfoApiController {

	@Autowired
	DetailsDto detailsDto;

	@Autowired
	BookInfoDto bookInfoDto;

	private String bookApiUri = "https://www.googleapis.com/books/v1/volumes?q=isbn:";

	@GetMapping("/isbn")
	public void getInfo() {

		String tagetIsbn = "9784167741013";
		RestTemplate restTemplate = new RestTemplate();
		bookInfoDto = restTemplate.getForObject(bookApiUri + tagetIsbn, BookInfoDto.class);

		System.out.print("");
	}

}
