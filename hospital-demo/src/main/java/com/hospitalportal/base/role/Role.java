package com.hospitalportal.base.role;


import javax.persistence.*;

import com.hospitalportal.base.user.User;

import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="roleName")
    private String name;
    @Column(name="role_id")
    private Integer role_id;
    public Long getId() {
        return id;
    }
    public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public void setId(Long id) {
        this.id = id;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}