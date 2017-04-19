package com.fengze.spring.mapper;

import com.fengze.spring.domain.UserDo;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by ASUS on 2017/4/18.
 */
public interface UserMapper extends Mapper<UserDo> {

//    public UserDo findUserById(Integer id) throws Exception;
//
//    @Select("select * from tb_user where user_name=#{username} and pass_word=#{password}")
//    @Results({
//            @Result(id = true, property = "id", column = "user_id", javaType = Integer.class),
//            @Result(property = "userName", column = "user_name", javaType = String.class),
//            @Result(property = "password", column = "pass_word", javaType = String.class),
//            @Result(property = "cellphone", column = "cell_phone", javaType = String.class),
//            @Result(property = "userType", column = "user_type", javaType = String.class),
//            @Result(property = "realName", column = "real_name", javaType = String.class)
//    })
//    public UserDo login(@Param("username") String username, @Param("password") String password);

}
