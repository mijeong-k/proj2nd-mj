package com.cocoa.service;

import java.util.ArrayList;
import java.util.List;

import com.cocoa.dto.FriendDTO;
import com.cocoa.dto.LectureinfoDTO;
import com.cocoa.dto.LoginDTO;
import com.cocoa.mapper.FriendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

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
	public List<LoginDTO> findAll(LoginDTO ldto) {
		List<LoginDTO> loginDTOListList = friendMapper.findAll(ldto);
		return loginDTOListList;
	}

	@Override
	public List<LectureinfoDTO> getlecturelist() {
		return friendMapper.getlecturelist();
	}


//	@Override
//	public boolean login(LoginDTO loginDTO) {
//
//		boolean flag;
//
//		try{
//			String result = friendMapper.login(loginDTO);
//			System.out.println("서비스 임플" + result);
//			if (result != null){
//				flag = true;
//			}else{
//				flag = false;
//			}
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//			flag = false;
//		}
//
//		System.out.println("flag 최종 리턴값" + flag);
//		return flag;
//
//	}


}
