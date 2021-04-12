package com.ashokit.service;

public class UnlockAccount {

	private Integer unlockAccountId;
	private String temporaryPassword;
	private String newPassword;
	private String confirmPassword;

	public Integer getUnlockAccountId() {
		return unlockAccountId;
	}

	public void setUnlockAccountId(Integer unlockAccountId) {
		this.unlockAccountId = unlockAccountId;
	}

	public String getTemporaryPassword() {
		return temporaryPassword;
	}

	public void setTemporaryPassword(String temporaryPassword) {
		this.temporaryPassword = temporaryPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
