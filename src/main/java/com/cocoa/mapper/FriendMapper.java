package com.cocoa.mapper;

import com.cocoa.dto.FriendDTO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FriendMapper {

	 List<FriendDTO> getList(FriendDTO dto);

	void save(FriendDTO friendDTO);

	int login(FriendDTO friendDTO);
}
