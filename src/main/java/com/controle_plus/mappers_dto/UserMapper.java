package com.controle_plus.mappers_dto;

import com.controle_plus.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserModel map(UserDTO userDTO) {
        UserModel userModel = new UserModel();

        userModel.setId(userDTO.getId());
        userModel.setUsername(userDTO.getUsername());
        userModel.setPassword(userDTO.getPassword());
        userModel.setEmail(userDTO.getEmail());
        userModel.setDateOfBirth(userDTO.getDateOfBirth());
        userModel.setRole(userDTO.getRole());

        return userModel;
    }

    // Mapeamento de UserModel para UserDTO
    public UserDTO map(UserModel userModel) {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(userModel.getId());
        userDTO.setUsername(userModel.getUsername());
        userDTO.setPassword(userModel.getPassword());
        userDTO.setEmail(userModel.getEmail());
        userDTO.setDateOfBirth(userModel.getDateOfBirth());
        userDTO.setRole(userModel.getRole());

        return userDTO;
    }
}
