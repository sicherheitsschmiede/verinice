package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * MbZielobjZusatzId generated by hbm2java
 */
public class MbZielobjZusatzId implements java.io.Serializable {

	private int zotImpId;
	private int zotId;
	private int zusId;

	public MbZielobjZusatzId() {
	}

	public MbZielobjZusatzId(int zotImpId, int zotId, int zusId) {
		this.zotImpId = zotImpId;
		this.zotId = zotId;
		this.zusId = zusId;
	}

	public int getZotImpId() {
		return this.zotImpId;
	}

	public void setZotImpId(int zotImpId) {
		this.zotImpId = zotImpId;
	}

	public int getZotId() {
		return this.zotId;
	}

	public void setZotId(int zotId) {
		this.zotId = zotId;
	}

	public int getZusId() {
		return this.zusId;
	}

	public void setZusId(int zusId) {
		this.zusId = zusId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MbZielobjZusatzId))
			return false;
		MbZielobjZusatzId castOther = (MbZielobjZusatzId) other;

		return (this.getZotImpId() == castOther.getZotImpId())
				&& (this.getZotId() == castOther.getZotId())
				&& (this.getZusId() == castOther.getZusId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getZotImpId();
		result = 37 * result + this.getZotId();
		result = 37 * result + this.getZusId();
		return result;
	}

}
