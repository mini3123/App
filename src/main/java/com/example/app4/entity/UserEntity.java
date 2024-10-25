package com.example.app4.entity;

import com.example.app4.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Setter
@Getter
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column()
    private String userId;
    @Column()
    private String userPass;
    @Column()
    private String userName;

    public static UserEntity toUserEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(userDTO.getUserId());
        userEntity.setUserPass(userDTO.getUserPass());
        userEntity.setUserName(userDTO.getUserName());
        return userEntity;
    }
}
