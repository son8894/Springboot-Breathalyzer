package com.example.demo.user.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.user.UserProfile;

@Mapper
public interface UserProfileMapper {
	
	@Select("SELECT * FROM UserProfile WHERE id=#{id}")
	UserProfile getUserProfile(@Param("id") int id);

	@Select("SELECT * FROM UserProfile")
	List<UserProfile> getUserProfileList();
	
	@Insert("INSERT INTO UserProfile VALUES(#{id},#{userId},#{password},#{name},#{phone},#{nickName})")
	int insertUserProfile(@Param("id") int id, @Param("userId") String userId, @Param("password") String password, @Param("name") String name,
			@Param("phone") String phone, @Param("nickName") String nickName);
	
	@Update("UPDATE UserProfile SET userId=#{userId}, password=#{password}, name=#{name}, phone=#{phone}, nickName=#{nickName} WHERE id=#{id})")
	int updateUserProfile(@Param("id") int id, @Param("userId") String userId, @Param("password") String password, @Param("name") String name,
			@Param("phone") String phone, @Param("nickName") String nickName);
	
	@Delete("DELETE FROM UserProfile WHERE id=#{id}")
	int deleteUserProfile(@Param("id") int id);
}
