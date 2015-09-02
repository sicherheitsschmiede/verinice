package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgMsDatatypeId generated by hbm2java
 */
public class StgMsDatatypeId implements java.io.Serializable {

	private Integer dtyId;
	private String link;
	private String guid;
	private Date timestamp;

	public StgMsDatatypeId() {
	}

	public StgMsDatatypeId(Integer dtyId, String link, String guid,
			Date timestamp) {
		this.dtyId = dtyId;
		this.link = link;
		this.guid = guid;
		this.timestamp = timestamp;
	}

	public Integer getDtyId() {
		return this.dtyId;
	}

	public void setDtyId(Integer dtyId) {
		this.dtyId = dtyId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgMsDatatypeId))
			return false;
		StgMsDatatypeId castOther = (StgMsDatatypeId) other;

		return ((this.getDtyId() == castOther.getDtyId()) || (this.getDtyId() != null
				&& castOther.getDtyId() != null && this.getDtyId().equals(
				castOther.getDtyId())))
				&& ((this.getLink() == castOther.getLink()) || (this.getLink() != null
						&& castOther.getLink() != null && this.getLink()
						.equals(castOther.getLink())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDtyId() == null ? 0 : this.getDtyId().hashCode());
		result = 37 * result
				+ (getLink() == null ? 0 : this.getLink().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		return result;
	}

}
