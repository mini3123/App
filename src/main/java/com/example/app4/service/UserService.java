package com.example.app4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.app4.dto.UserDTO;
import com.example.app4.entity.UserEntity;
import com.example.app4.repository.UserRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public void save(UserDTO userDTO) {
        UserEntity userEntity = UserEntity.toUserEntity(userDTO);
        userRepository.save(userEntity);

    }
        public UserDTO login(UserDTO userDTO) {
            //아이디로 DB 조회
            //조회한 아이디와 사용자 입력한 비밀번호가 일치하는 지
            Optional<UserEntity> byUserId = userRepository.findByUserId(userDTO.getUserId());
            if (byUserId.isPresent()) {
                //정보가 있다
                UserEntity userEntity = byUserId.get();
                if (userEntity.getUserPass().equals((userDTO.getUserPass()))) {
                    UserDTO dto = UserDTO.toUserDTO(userEntity);
                    return dto;

                } else {
                    //비밀번호 불일치
                    return null;
                }
            } else {
                //조회가 없다
                return null;
            }

        }
    }

