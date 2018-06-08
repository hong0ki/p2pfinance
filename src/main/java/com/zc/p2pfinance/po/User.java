package com.zc.p2pfinance.po;

/**
 * 
 * @ClassName: User
 * @Description: 用户的实体类
 * @author: yan
 * @date: 2018年6月6日
 */
public class User {
	/** 用户id */
	private Integer user_id;
	/** 用户名 */
	private String username;
	/** 登录密码 */
	private String password;
	/** 真实姓名 */
	private String real_name;
	/** 手机号码 */
	private String phone_number;
	/** 推荐人 */
	private String referee;
	/** 账户金额 */
	private Double user_money;
	/** 交易密码 */
	private String pay_password;
	/** 电子邮箱 */
	private String email;
	/** 身份认证 */
	private Integer ident;
	/** 第三方支付 */
	private Integer pay_ident;
	/** 身份证 */
	private String id_card;

	public User() {
	}

	public User(Integer user_id, String username, String password, String real_name, String phone_number,
			String referee, Double user_money, String pay_password, String email, Integer ident, Integer pay_ident,
			String id_card) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.real_name = real_name;
		this.phone_number = phone_number;
		this.referee = referee;
		this.user_money = user_money;
		this.pay_password = pay_password;
		this.email = email;
		this.ident = ident;
		this.pay_ident = pay_ident;
		this.id_card = id_card;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getReferee() {
		return referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	public Double getUser_money() {
		return user_money;
	}

	public void setUser_money(Double user_money) {
		this.user_money = user_money;
	}

	public String getPay_password() {
		return pay_password;
	}

	public void setPay_password(String pay_password) {
		this.pay_password = pay_password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdent() {
		return ident;
	}

	public void setIdent(Integer ident) {
		this.ident = ident;
	}

	public Integer getPay_ident() {
		return pay_ident;
	}

	public void setPay_ident(Integer pay_ident) {
		this.pay_ident = pay_ident;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", real_name="
				+ real_name + ", phone_number=" + phone_number + ", referee=" + referee + ", user_money=" + user_money
				+ ", pay_password=" + pay_password + ", email=" + email + ", ident=" + ident + ", pay_ident="
				+ pay_ident + ", id_card=" + id_card + "]";
	}

}
