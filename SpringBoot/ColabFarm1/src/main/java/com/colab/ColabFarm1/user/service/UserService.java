package com.colab.ColabFarm1.user.service;

import java.util.List;

import com.colab.ColabFarm1.user.dto.LoginRequestDto;
import com.colab.ColabFarm1.user.dto.LoginResponseDto;
import com.colab.ColabFarm1.user.dto.RequestDto;
import com.colab.ColabFarm1.user.dto.UserResponseDto;
import com.colab.ColabFarm1.user.model.User;

public interface UserService {
    public List<User> getAllUsers();
    // public UserResponseDto createUser(RequestDto dto);
    public void saveUser(RequestDto userDTO); // <-- Corrected this line
    //LoginResponseDto login(LoginRequestDto loginDto);
    public LoginResponseDto login(String email, String password , String name);

}
