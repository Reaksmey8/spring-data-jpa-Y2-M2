package co.istad.springmvcy2.mapper;

import co.istad.springmvcy2.dto.UserResponse;
import co.istad.springmvcy2.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    what is source?
//    what is target?

    // map Entity -> DTO
    UserResponse mapUserToUserResponse(User user);

}
