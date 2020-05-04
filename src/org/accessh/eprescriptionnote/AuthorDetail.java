package org.accessh.eprescriptionnote;

import java.util.Date;

public class AuthorDetail {
	private Date authorDate;
    private Date authorTime;
	//private ??? AuthoDigitalSignature;
	public Date getAuthorDate() {
		return authorDate;
	}
	public void setAuthorDate(Date authorDate) {
		this.authorDate = authorDate;
	}
	public Date getAuthorTime() {
		return authorTime;
	}
	public void setAuthorTime(Date authorTime) {
		this.authorTime = authorTime;
	}

}
