package co.jp.impetus.mapper;

import co.jp.impetus.dto.LoginDto;
import co.jp.impetus.dto.LoginResultDto;

public interface LoginMapper {

    LoginResultDto selectAll(LoginDto dto);

}
