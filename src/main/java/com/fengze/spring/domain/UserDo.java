package com.fengze.spring.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by ASUS on 2017/4/18.
 */
@Component
@Data
@Table(name = "tb_user")
public class UserDo extends BaseDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;//登陆用户名

    @Column(name = "pass_word")
    private String password;//登陆密码
    private String realName;//真实姓名
    private String email;//电子邮件
    private String cellPhone;//联系电话
    private String address;//地址
    private String userType;//user_type = 1:系统用户 0:注册会员用户

    @Transient
    private String productId;
}
