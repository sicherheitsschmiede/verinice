package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.sql.Clob;

/**
 * StgG20MemoId generated by hbm2java
 */
public class StgG20MemoId implements java.io.Serializable {

	private int snr;
	private Clob text;

	public StgG20MemoId() {
	}

	public StgG20MemoId(int snr) {
		this.snr = snr;
	}

	public StgG20MemoId(int snr, Clob text) {
		this.snr = snr;
		this.text = text;
	}

	public int getSnr() {
		return this.snr;
	}

	public void setSnr(int snr) {
		this.snr = snr;
	}

	public Clob getText() {
		return this.text;
	}

	public void setText(Clob text) {
		this.text = text;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgG20MemoId))
			return false;
		StgG20MemoId castOther = (StgG20MemoId) other;

		return (this.getSnr() == castOther.getSnr())
				&& ((this.getText() == castOther.getText()) || (this.getText() != null
						&& castOther.getText() != null && this.getText()
						.equals(castOther.getText())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSnr();
		result = 37 * result
				+ (getText() == null ? 0 : this.getText().hashCode());
		return result;
	}

}
