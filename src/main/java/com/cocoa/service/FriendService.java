package com.cocoa.service;

import com.cocoa.dto.FriendDTO;
import com.cocoa.dto.LectureinfoDTO;
import com.cocoa.dto.LoginDTO;
import com.cocoa.mapper.FriendMapper;

import java.util.List;

public interface FriendService {
    public List<FriendDTO> getList(FriendDTO dto);
    void save(FriendDTO friendDTO);
//    boolean login(FriendDTO friendDTO);
    List<LoginDTO> findAll(LoginDTO ldto);

    List<LectureinfoDTO> getlecturelist();
}
