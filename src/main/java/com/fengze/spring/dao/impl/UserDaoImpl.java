package com.fengze.spring.dao.impl;

import com.fengze.spring.dao.UserDao;
import com.fengze.spring.domain.UserDo;
import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ASUS on 2017/4/18.
 */
@Slf4j
@Repository
public class UserDaoImpl implements UserDao {

    @Getter
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserDo validateUser(UserDo userDo) {

        String sql = "SELECT t.user_id,t.user_name,t.pass_word,t.real_name,t.email,t.cell_phone,t.address,t.user_type,t.state,t.create_by,t.create_date,t.update_by,t.update_date FROM tb_user t WHERE t.user_name=? AND t.pass_word=?";

        RowMapper<UserDo> rm = new BeanPropertyRowMapper<UserDo>(UserDo.class);

        List<UserDo> ls = Lists.newArrayList();

        return this.getJdbcTemplate().queryForObject(sql,
                new Object[]{userDo.getUserName(), userDo.getPassword()},
                rm);
    }
}