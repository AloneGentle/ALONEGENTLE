package com.dljsxy.school.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@DynamicUpdate
@DynamicInsert
@Table
@Entity
@Getter
@Setter
@ToString


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    private String password;

    @CreationTimestamp
    @Column
    private LocalDateTime addTime;

    @UpdateTimestamp
    @Column
    private LocalDateTime modTime;

    @Column
    private String name;

    @Column
    private String avatar;

    @Column
    private String introduction;

    @Column
    private String roles;

}
