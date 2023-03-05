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

    @Select("SELECT * FROM userProfile WHERE id = #{id}")
    public UserProfile getUserProfile(@Param("id") int id);

    @Select("SELECT * FROM userProfile")
    public List<UserProfile> getUserProfileList();

    @Insert("INSERT INTO userProfile (id, userId, password, name, phone, nickName) VALUES (#{id}, #{userId}, #{password}, #{name}, #{phone}, #{nickName})")
    public void insertUserProfile(@Param("id") int id, @Param("userId") String userId, @Param("password") String password, 
                                   @Param("name") String name, @Param("phone") String phone, @Param("nickName") String nickName);

    @Update("UPDATE userProfile SET userId=#{userId}, password=#{password}, name=#{name}, phone=#{phone}, nickName=#{nickName} WHERE id =#{id}")
    public void updateUserProfile(@Param("id") int id, @Param("userId") String userId, @Param("password") String password, 
                                   @Param("name") String name, @Param("phone") String phone, @Param("nickName") String nickName);

    @Delete("DELETE FROM userProfile WHERE id = #{id}")
    public void deleteUserProfile(@Param("id") int id);

    @Select("SELECT * FROM userProfile WHERE userId = #{userId}")
    public UserProfile getUserProfileByUserId(@Param("userId") String userId);

}
