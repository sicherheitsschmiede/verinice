package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * MbWaehrungenId generated by hbm2java
 */
public class MbWaehrungenId implements java.io.Serializable {

	private int waeImpId;
	private int waeId;

	public MbWaehrungenId() {
	}

	public MbWaehrungenId(int waeImpId, int waeId) {
		this.waeImpId = waeImpId;
		this.waeId = waeId;
	}

	public int getWaeImpId() {
		return this.waeImpId;
	}

	public void setWaeImpId(int waeImpId) {
		this.waeImpId = waeImpId;
	}

	public int getWaeId() {
		return this.waeId;
	}

	public void setWaeId(int waeId) {
		this.waeId = waeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MbWaehrungenId))
			return false;
		MbWaehrungenId castOther = (MbWaehrungenId) other;

		return (this.getWaeImpId() == castOther.getWaeImpId())
				&& (this.getWaeId() == castOther.getWaeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getWaeImpId();
		result = 37 * result + this.getWaeId();
		return result;
	}

}
