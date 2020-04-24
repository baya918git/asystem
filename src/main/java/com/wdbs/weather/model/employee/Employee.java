package com.wdbs.weather.model.employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

/**
 * 顧客クラス。
 */
@Entity
@Data
public class Employee implements UserDetails {

	//権限は一般ユーザ、システム管理者の2種類とする
	public enum Authority {
		ROLE_USER, ROLE_ADMIN
	}

	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_id_seq")
	@SequenceGenerator(name = "employee_id_seq", sequenceName = "employee_id_seq", allocationSize = 1)
	private Long id;

	/** 個人コード */
	@NotEmpty
	@Column(length = 7)
	private String code;

	/** 名前 */
	@NotEmpty
	private String name;

	/** パスワード */
	@NotEmpty
	private String password;

	/** 役割 */
	@Enumerated(EnumType.STRING)
	@NotEmpty
	private Authority role;

	/** メールアドレス */
	@NotEmpty
	private String mailadress;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(role.toString()));
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}
