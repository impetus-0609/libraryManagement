package co.jp.impetus.mapper;

import co.jp.impetus.dto.SearchBookDto;

public interface SearchMapper {

	// 本の検索
	SearchBookDto selectSearchBookOne();
}
