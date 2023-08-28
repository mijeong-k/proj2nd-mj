package com.cocoa.service;

import java.util.List;

import com.cocoa.dto.FriendDTO;
import com.cocoa.mapper.FriendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;

import javax.annotation.Resource;

@Service
@AllArgsConstructor
public class FriendServiceImpl implements FriendService{

	@Autowired
	private FriendMapper friendMapper;


	@Override
	public List<FriendDTO> getList(FriendDTO dto) {
		List<FriendDTO> friendList = friendMapper.getList(dto);
		return friendList;
	}

	@Override
	public void save(FriendDTO friendDTO) {
		friendMapper.save(friendDTO);
	}

	@Override
	public boolean login(FriendDTO friendDTO) {

		boolean flag;

		try{
			int result = friendMapper.login(friendDTO);
			flag = true;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			flag = false;
		}

		return flag;

	}
}
