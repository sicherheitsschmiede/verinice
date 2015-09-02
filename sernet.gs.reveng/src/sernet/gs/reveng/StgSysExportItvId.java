package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgSysExportItvId generated by hbm2java
 */
public class StgSysExportItvId implements java.io.Serializable {

	private Integer expId;
	private Integer itvId;
	private Integer itvImpId;
	private Date timestamp;

	public StgSysExportItvId() {
	}

	public StgSysExportItvId(Integer expId, Integer itvId, Integer itvImpId,
			Date timestamp) {
		this.expId = expId;
		this.itvId = itvId;
		this.itvImpId = itvImpId;
		this.timestamp = timestamp;
	}

	public Integer getExpId() {
		return this.expId;
	}

	public void setExpId(Integer expId) {
		this.expId = expId;
	}

	public Integer getItvId() {
		return this.itvId;
	}

	public void setItvId(Integer itvId) {
		this.itvId = itvId;
	}

	public Integer getItvImpId() {
		return this.itvImpId;
	}

	public void setItvImpId(Integer itvImpId) {
		this.itvImpId = itvImpId;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgSysExportItvId))
			return false;
		StgSysExportItvId castOther = (StgSysExportItvId) other;

		return ((this.getExpId() == castOther.getExpId()) || (this.getExpId() != null
				&& castOther.getExpId() != null && this.getExpId().equals(
				castOther.getExpId())))
				&& ((this.getItvId() == castOther.getItvId()) || (this
						.getItvId() != null && castOther.getItvId() != null && this
						.getItvId().equals(castOther.getItvId())))
				&& ((this.getItvImpId() == castOther.getItvImpId()) || (this
						.getItvImpId() != null
						&& castOther.getItvImpId() != null && this
						.getItvImpId().equals(castOther.getItvImpId())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getExpId() == null ? 0 : this.getExpId().hashCode());
		result = 37 * result
				+ (getItvId() == null ? 0 : this.getItvId().hashCode());
		result = 37 * result
				+ (getItvImpId() == null ? 0 : this.getItvImpId().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		return result;
	}

}
