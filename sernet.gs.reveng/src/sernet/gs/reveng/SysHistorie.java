package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * SysHistorie generated by hbm2java
 */
public class SysHistorie implements java.io.Serializable {

	private int hisId;
	private Date timestamp;
	private int hisUsn;
	private String hisUser;
	private String hisLogin;
	private String hisGuid;
	private String hisSpalte;
	private String hisSpalteImp;
	private String hisSpalte2;
	private String hisAltWert;
	private Date hisAltDatum;
	private BigDecimal hisAltDecimal;
	private Integer hisAltId;
	private Integer hisAltImpId;
	private Integer hisNr;
	private Integer dtyId;
	private boolean firstEntry;

	public SysHistorie() {
	}

	public SysHistorie(int hisId, int hisUsn, String hisUser, String hisGuid,
			String hisSpalte, boolean firstEntry) {
		this.hisId = hisId;
		this.hisUsn = hisUsn;
		this.hisUser = hisUser;
		this.hisGuid = hisGuid;
		this.hisSpalte = hisSpalte;
		this.firstEntry = firstEntry;
	}

	public SysHistorie(int hisId, int hisUsn, String hisUser, String hisLogin,
			String hisGuid, String hisSpalte, String hisSpalteImp,
			String hisSpalte2, String hisAltWert, Date hisAltDatum,
			BigDecimal hisAltDecimal, Integer hisAltId, Integer hisAltImpId,
			Integer hisNr, Integer dtyId, boolean firstEntry) {
		this.hisId = hisId;
		this.hisUsn = hisUsn;
		this.hisUser = hisUser;
		this.hisLogin = hisLogin;
		this.hisGuid = hisGuid;
		this.hisSpalte = hisSpalte;
		this.hisSpalteImp = hisSpalteImp;
		this.hisSpalte2 = hisSpalte2;
		this.hisAltWert = hisAltWert;
		this.hisAltDatum = hisAltDatum;
		this.hisAltDecimal = hisAltDecimal;
		this.hisAltId = hisAltId;
		this.hisAltImpId = hisAltImpId;
		this.hisNr = hisNr;
		this.dtyId = dtyId;
		this.firstEntry = firstEntry;
	}

	public int getHisId() {
		return this.hisId;
	}

	public void setHisId(int hisId) {
		this.hisId = hisId;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getHisUsn() {
		return this.hisUsn;
	}

	public void setHisUsn(int hisUsn) {
		this.hisUsn = hisUsn;
	}

	public String getHisUser() {
		return this.hisUser;
	}

	public void setHisUser(String hisUser) {
		this.hisUser = hisUser;
	}

	public String getHisLogin() {
		return this.hisLogin;
	}

	public void setHisLogin(String hisLogin) {
		this.hisLogin = hisLogin;
	}

	public String getHisGuid() {
		return this.hisGuid;
	}

	public void setHisGuid(String hisGuid) {
		this.hisGuid = hisGuid;
	}

	public String getHisSpalte() {
		return this.hisSpalte;
	}

	public void setHisSpalte(String hisSpalte) {
		this.hisSpalte = hisSpalte;
	}

	public String getHisSpalteImp() {
		return this.hisSpalteImp;
	}

	public void setHisSpalteImp(String hisSpalteImp) {
		this.hisSpalteImp = hisSpalteImp;
	}

	public String getHisSpalte2() {
		return this.hisSpalte2;
	}

	public void setHisSpalte2(String hisSpalte2) {
		this.hisSpalte2 = hisSpalte2;
	}

	public String getHisAltWert() {
		return this.hisAltWert;
	}

	public void setHisAltWert(String hisAltWert) {
		this.hisAltWert = hisAltWert;
	}

	public Date getHisAltDatum() {
		return this.hisAltDatum;
	}

	public void setHisAltDatum(Date hisAltDatum) {
		this.hisAltDatum = hisAltDatum;
	}

	public BigDecimal getHisAltDecimal() {
		return this.hisAltDecimal;
	}

	public void setHisAltDecimal(BigDecimal hisAltDecimal) {
		this.hisAltDecimal = hisAltDecimal;
	}

	public Integer getHisAltId() {
		return this.hisAltId;
	}

	public void setHisAltId(Integer hisAltId) {
		this.hisAltId = hisAltId;
	}

	public Integer getHisAltImpId() {
		return this.hisAltImpId;
	}

	public void setHisAltImpId(Integer hisAltImpId) {
		this.hisAltImpId = hisAltImpId;
	}

	public Integer getHisNr() {
		return this.hisNr;
	}

	public void setHisNr(Integer hisNr) {
		this.hisNr = hisNr;
	}

	public Integer getDtyId() {
		return this.dtyId;
	}

	public void setDtyId(Integer dtyId) {
		this.dtyId = dtyId;
	}

	public boolean isFirstEntry() {
		return this.firstEntry;
	}

	public void setFirstEntry(boolean firstEntry) {
		this.firstEntry = firstEntry;
	}

}
