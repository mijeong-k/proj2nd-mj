package com.cocoa.mapper;

import com.cocoa.dto.FriendDTO;
import com.cocoa.dto.LectureinfoDTO;
import com.cocoa.dto.LoginDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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

//	String login(FriendDTO friendDTO);

//	String login(LoginDTO loginDTO);

//	@Select("select * from lectureinfo where lf_pk = 1")
//	List<LectureinfoDTO> getList(LectureinfoDTO ldto);

//	public LectureinfoDTO read(long lf_pk);

	List<LoginDTO> findAll(LoginDTO ldto);

	List<LectureinfoDTO> getlecturelist();


}
