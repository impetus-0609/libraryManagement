package entity;

public class LoginTest {

	//ユーザーID
	private String userId;
	//ユーザー名
	private String userNemae;
	//ログインパスワード
	private String loginPass;
	//最終ログイン日時
	private String lastLoginTime;
	//登録日時
	private String createdTime;
	//更新日時
	private String modifiedTime;

	/**
	 * @return userIdを返却
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return userNemae
	 */
	public String getUserNemae() {
		return userNemae;
	}
	/**
	 * @param userNemae
	 */
	public void setUserNemae(String userNemae) {
		this.userNemae = userNemae;
	}
	/**
	 * @return loginPass
	 */
	public String getLoginPass() {
		return loginPass;
	}
	/**
	 * @param loginPass
	 */
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	/**
	 * @return lastLoginTime
	 */
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	/**
	 * @param lastLoginTime
	 */
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	/**
	 * @return createdTime
	 */
	public String getCreatedTime() {
		return createdTime;
	}
	/**
	 * @param createdTime
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	/**
	 * @return modifiedTime
	 */
	public String getModifiedTime() {
		return modifiedTime;
	}
	/**
	 * @param modifiedTime
	 */
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}



}
