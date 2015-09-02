package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * FilterRowId generated by hbm2java
 */
public class FilterRowId implements java.io.Serializable {

	private int fltId;
	private byte rowId;

	public FilterRowId() {
	}

	public FilterRowId(int fltId, byte rowId) {
		this.fltId = fltId;
		this.rowId = rowId;
	}

	public int getFltId() {
		return this.fltId;
	}

	public void setFltId(int fltId) {
		this.fltId = fltId;
	}

	public byte getRowId() {
		return this.rowId;
	}

	public void setRowId(byte rowId) {
		this.rowId = rowId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FilterRowId))
			return false;
		FilterRowId castOther = (FilterRowId) other;

		return (this.getFltId() == castOther.getFltId())
				&& (this.getRowId() == castOther.getRowId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getFltId();
		result = 37 * result + this.getRowId();
		return result;
	}

}
