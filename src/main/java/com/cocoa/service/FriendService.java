package com.cocoa.service;

import com.cocoa.dto.FriendDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FriendService {
    public List<FriendDTO> getList(FriendDTO dto);
    void save(FriendDTO friendDTO);
    boolean login(FriendDTO friendDTO);
}
