package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgMbMassnnkatTxtId generated by hbm2java
 */
public class StgMbMassnnkatTxtId implements java.io.Serializable {

	private Integer mskId;
	private Integer mskImpId;
	private Short sprId;
	private String name;
	private String beschreibung;
	private String guid;
	private Date timestamp;
	private String guidOrg;

	public StgMbMassnnkatTxtId() {
	}

	public StgMbMassnnkatTxtId(Integer mskId, Integer mskImpId, Short sprId,
			String name, String beschreibung, String guid, Date timestamp,
			String guidOrg) {
		this.mskId = mskId;
		this.mskImpId = mskImpId;
		this.sprId = sprId;
		this.name = name;
		this.beschreibung = beschreibung;
		this.guid = guid;
		this.timestamp = timestamp;
		this.guidOrg = guidOrg;
	}

	public Integer getMskId() {
		return this.mskId;
	}

	public void setMskId(Integer mskId) {
		this.mskId = mskId;
	}

	public Integer getMskImpId() {
		return this.mskImpId;
	}

	public void setMskImpId(Integer mskImpId) {
		this.mskImpId = mskImpId;
	}

	public Short getSprId() {
		return this.sprId;
	}

	public void setSprId(Short sprId) {
		this.sprId = sprId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getGuidOrg() {
		return this.guidOrg;
	}

	public void setGuidOrg(String guidOrg) {
		this.guidOrg = guidOrg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgMbMassnnkatTxtId))
			return false;
		StgMbMassnnkatTxtId castOther = (StgMbMassnnkatTxtId) other;

		return ((this.getMskId() == castOther.getMskId()) || (this.getMskId() != null
				&& castOther.getMskId() != null && this.getMskId().equals(
				castOther.getMskId())))
				&& ((this.getMskImpId() == castOther.getMskImpId()) || (this
						.getMskImpId() != null
						&& castOther.getMskImpId() != null && this
						.getMskImpId().equals(castOther.getMskImpId())))
				&& ((this.getSprId() == castOther.getSprId()) || (this
						.getSprId() != null && castOther.getSprId() != null && this
						.getSprId().equals(castOther.getSprId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getBeschreibung() == castOther.getBeschreibung()) || (this
						.getBeschreibung() != null
						&& castOther.getBeschreibung() != null && this
						.getBeschreibung().equals(castOther.getBeschreibung())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())))
				&& ((this.getGuidOrg() == castOther.getGuidOrg()) || (this
						.getGuidOrg() != null && castOther.getGuidOrg() != null && this
						.getGuidOrg().equals(castOther.getGuidOrg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMskId() == null ? 0 : this.getMskId().hashCode());
		result = 37 * result
				+ (getMskImpId() == null ? 0 : this.getMskImpId().hashCode());
		result = 37 * result
				+ (getSprId() == null ? 0 : this.getSprId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37
				* result
				+ (getBeschreibung() == null ? 0 : this.getBeschreibung()
						.hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		result = 37 * result
				+ (getGuidOrg() == null ? 0 : this.getGuidOrg().hashCode());
		return result;
	}

}
