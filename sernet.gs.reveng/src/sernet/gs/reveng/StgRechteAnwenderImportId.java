package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgRechteAnwenderImportId generated by hbm2java
 */
public class StgRechteAnwenderImportId implements java.io.Serializable {

	private Short uid;
	private Integer impId;
	private Boolean globalJn;
	private Short recht;
	private Short rechtBau;
	private String guid;
	private Date erstelltAm;
	private String erstelltDurch;

	public StgRechteAnwenderImportId() {
	}

	public StgRechteAnwenderImportId(Short uid, Integer impId,
			Boolean globalJn, Short recht, Short rechtBau, String guid,
			Date erstelltAm, String erstelltDurch) {
		this.uid = uid;
		this.impId = impId;
		this.globalJn = globalJn;
		this.recht = recht;
		this.rechtBau = rechtBau;
		this.guid = guid;
		this.erstelltAm = erstelltAm;
		this.erstelltDurch = erstelltDurch;
	}

	public Short getUid() {
		return this.uid;
	}

	public void setUid(Short uid) {
		this.uid = uid;
	}

	public Integer getImpId() {
		return this.impId;
	}

	public void setImpId(Integer impId) {
		this.impId = impId;
	}

	public Boolean getGlobalJn() {
		return this.globalJn;
	}

	public void setGlobalJn(Boolean globalJn) {
		this.globalJn = globalJn;
	}

	public Short getRecht() {
		return this.recht;
	}

	public void setRecht(Short recht) {
		this.recht = recht;
	}

	public Short getRechtBau() {
		return this.rechtBau;
	}

	public void setRechtBau(Short rechtBau) {
		this.rechtBau = rechtBau;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Date getErstelltAm() {
		return this.erstelltAm;
	}

	public void setErstelltAm(Date erstelltAm) {
		this.erstelltAm = erstelltAm;
	}

	public String getErstelltDurch() {
		return this.erstelltDurch;
	}

	public void setErstelltDurch(String erstelltDurch) {
		this.erstelltDurch = erstelltDurch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgRechteAnwenderImportId))
			return false;
		StgRechteAnwenderImportId castOther = (StgRechteAnwenderImportId) other;

		return ((this.getUid() == castOther.getUid()) || (this.getUid() != null
				&& castOther.getUid() != null && this.getUid().equals(
				castOther.getUid())))
				&& ((this.getImpId() == castOther.getImpId()) || (this
						.getImpId() != null && castOther.getImpId() != null && this
						.getImpId().equals(castOther.getImpId())))
				&& ((this.getGlobalJn() == castOther.getGlobalJn()) || (this
						.getGlobalJn() != null
						&& castOther.getGlobalJn() != null && this
						.getGlobalJn().equals(castOther.getGlobalJn())))
				&& ((this.getRecht() == castOther.getRecht()) || (this
						.getRecht() != null && castOther.getRecht() != null && this
						.getRecht().equals(castOther.getRecht())))
				&& ((this.getRechtBau() == castOther.getRechtBau()) || (this
						.getRechtBau() != null
						&& castOther.getRechtBau() != null && this
						.getRechtBau().equals(castOther.getRechtBau())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getErstelltAm() == castOther.getErstelltAm()) || (this
						.getErstelltAm() != null
						&& castOther.getErstelltAm() != null && this
						.getErstelltAm().equals(castOther.getErstelltAm())))
				&& ((this.getErstelltDurch() == castOther.getErstelltDurch()) || (this
						.getErstelltDurch() != null
						&& castOther.getErstelltDurch() != null && this
						.getErstelltDurch()
						.equals(castOther.getErstelltDurch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUid() == null ? 0 : this.getUid().hashCode());
		result = 37 * result
				+ (getImpId() == null ? 0 : this.getImpId().hashCode());
		result = 37 * result
				+ (getGlobalJn() == null ? 0 : this.getGlobalJn().hashCode());
		result = 37 * result
				+ (getRecht() == null ? 0 : this.getRecht().hashCode());
		result = 37 * result
				+ (getRechtBau() == null ? 0 : this.getRechtBau().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37
				* result
				+ (getErstelltAm() == null ? 0 : this.getErstelltAm()
						.hashCode());
		result = 37
				* result
				+ (getErstelltDurch() == null ? 0 : this.getErstelltDurch()
						.hashCode());
		return result;
	}

}
