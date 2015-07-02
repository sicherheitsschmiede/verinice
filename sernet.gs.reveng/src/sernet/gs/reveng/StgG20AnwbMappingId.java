package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * StgG20AnwbMappingId generated by hbm2java
 */
public class StgG20AnwbMappingId implements java.io.Serializable {

	private int alteId;
	private int neueId;

	public StgG20AnwbMappingId() {
	}

	public StgG20AnwbMappingId(int alteId, int neueId) {
		this.alteId = alteId;
		this.neueId = neueId;
	}

	public int getAlteId() {
		return this.alteId;
	}

	public void setAlteId(int alteId) {
		this.alteId = alteId;
	}

	public int getNeueId() {
		return this.neueId;
	}

	public void setNeueId(int neueId) {
		this.neueId = neueId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgG20AnwbMappingId))
			return false;
		StgG20AnwbMappingId castOther = (StgG20AnwbMappingId) other;

		return (this.getAlteId() == castOther.getAlteId())
				&& (this.getNeueId() == castOther.getNeueId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAlteId();
		result = 37 * result + this.getNeueId();
		return result;
	}

}