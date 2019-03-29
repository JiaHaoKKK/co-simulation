package com.rengu.cosimulation.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Author: XYmar
 * Date: 2019/3/28 14:11
 */
@Entity
@Data
public class SublibraryEntity implements Serializable {
    @Id
    private String id = UUID.randomUUID().toString();
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime = new Date();
    private String type;                    // 子库类型
    private String description;             // 子库描述
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "LibraryEntity_id")  // 外键
    private LibraryEntity libraryEntity;
}