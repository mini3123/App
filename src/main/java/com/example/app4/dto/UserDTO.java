package com.example.app4.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import com.example.app4.entity.UserEntity;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDTO {
    private long Id;
    private String userName;
    private String userPass;
    private String userId;


    public static UserDTO toUserDTO(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setUserId(userEntity.getUserId());
        userDTO.setUserPass(userEntity.getUserPass());
        userDTO.setUserName(userEntity.getUserName());
        return userDTO;
    }
}
