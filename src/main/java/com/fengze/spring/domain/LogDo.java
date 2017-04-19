package com.fengze.spring.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by ASUS on 2017/4/18.
 */
@Data
@Table(name = "tb_log")
public class LogDo extends BaseDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logId;

    @Column(name = "table_name")
    private String tableName;
    @Column(name = "oper_name")
    private String operName;
}
