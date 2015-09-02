package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.sql.Clob;

/**
 * StgG20SysId generated by hbm2java
 */
public class StgG20SysId implements java.io.Serializable {

	private int snr;
	private Integer konzSnr;
	private Integer sclSnr;
	private String bez;
	private String standort;
	private String status;
	private Integer bew;
	private Clob begr;
	private Clob notiz;
	private String lock;
	private Integer expSnr;
	private Integer stat;
	private String netz;
	private String pmdatei;
	private String kmdatei;
	private Integer sbd;

	public StgG20SysId() {
	}

	public StgG20SysId(int snr) {
		this.snr = snr;
	}

	public StgG20SysId(int snr, Integer konzSnr, Integer sclSnr, String bez,
			String standort, String status, Integer bew, Clob begr, Clob notiz,
			String lock, Integer expSnr, Integer stat, String netz,
			String pmdatei, String kmdatei, Integer sbd) {
		this.snr = snr;
		this.konzSnr = konzSnr;
		this.sclSnr = sclSnr;
		this.bez = bez;
		this.standort = standort;
		this.status = status;
		this.bew = bew;
		this.begr = begr;
		this.notiz = notiz;
		this.lock = lock;
		this.expSnr = expSnr;
		this.stat = stat;
		this.netz = netz;
		this.pmdatei = pmdatei;
		this.kmdatei = kmdatei;
		this.sbd = sbd;
	}

	public int getSnr() {
		return this.snr;
	}

	public void setSnr(int snr) {
		this.snr = snr;
	}

	public Integer getKonzSnr() {
		return this.konzSnr;
	}

	public void setKonzSnr(Integer konzSnr) {
		this.konzSnr = konzSnr;
	}

	public Integer getSclSnr() {
		return this.sclSnr;
	}

	public void setSclSnr(Integer sclSnr) {
		this.sclSnr = sclSnr;
	}

	public String getBez() {
		return this.bez;
	}

	public void setBez(String bez) {
		this.bez = bez;
	}

	public String getStandort() {
		return this.standort;
	}

	public void setStandort(String standort) {
		this.standort = standort;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getBew() {
		return this.bew;
	}

	public void setBew(Integer bew) {
		this.bew = bew;
	}

	public Clob getBegr() {
		return this.begr;
	}

	public void setBegr(Clob begr) {
		this.begr = begr;
	}

	public Clob getNotiz() {
		return this.notiz;
	}

	public void setNotiz(Clob notiz) {
		this.notiz = notiz;
	}

	public String getLock() {
		return this.lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}

	public Integer getExpSnr() {
		return this.expSnr;
	}

	public void setExpSnr(Integer expSnr) {
		this.expSnr = expSnr;
	}

	public Integer getStat() {
		return this.stat;
	}

	public void setStat(Integer stat) {
		this.stat = stat;
	}

	public String getNetz() {
		return this.netz;
	}

	public void setNetz(String netz) {
		this.netz = netz;
	}

	public String getPmdatei() {
		return this.pmdatei;
	}

	public void setPmdatei(String pmdatei) {
		this.pmdatei = pmdatei;
	}

	public String getKmdatei() {
		return this.kmdatei;
	}

	public void setKmdatei(String kmdatei) {
		this.kmdatei = kmdatei;
	}

	public Integer getSbd() {
		return this.sbd;
	}

	public void setSbd(Integer sbd) {
		this.sbd = sbd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgG20SysId))
			return false;
		StgG20SysId castOther = (StgG20SysId) other;

		return (this.getSnr() == castOther.getSnr())
				&& ((this.getKonzSnr() == castOther.getKonzSnr()) || (this
						.getKonzSnr() != null && castOther.getKonzSnr() != null && this
						.getKonzSnr().equals(castOther.getKonzSnr())))
				&& ((this.getSclSnr() == castOther.getSclSnr()) || (this
						.getSclSnr() != null && castOther.getSclSnr() != null && this
						.getSclSnr().equals(castOther.getSclSnr())))
				&& ((this.getBez() == castOther.getBez()) || (this.getBez() != null
						&& castOther.getBez() != null && this.getBez().equals(
						castOther.getBez())))
				&& ((this.getStandort() == castOther.getStandort()) || (this
						.getStandort() != null
						&& castOther.getStandort() != null && this
						.getStandort().equals(castOther.getStandort())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getBew() == castOther.getBew()) || (this.getBew() != null
						&& castOther.getBew() != null && this.getBew().equals(
						castOther.getBew())))
				&& ((this.getBegr() == castOther.getBegr()) || (this.getBegr() != null
						&& castOther.getBegr() != null && this.getBegr()
						.equals(castOther.getBegr())))
				&& ((this.getNotiz() == castOther.getNotiz()) || (this
						.getNotiz() != null && castOther.getNotiz() != null && this
						.getNotiz().equals(castOther.getNotiz())))
				&& ((this.getLock() == castOther.getLock()) || (this.getLock() != null
						&& castOther.getLock() != null && this.getLock()
						.equals(castOther.getLock())))
				&& ((this.getExpSnr() == castOther.getExpSnr()) || (this
						.getExpSnr() != null && castOther.getExpSnr() != null && this
						.getExpSnr().equals(castOther.getExpSnr())))
				&& ((this.getStat() == castOther.getStat()) || (this.getStat() != null
						&& castOther.getStat() != null && this.getStat()
						.equals(castOther.getStat())))
				&& ((this.getNetz() == castOther.getNetz()) || (this.getNetz() != null
						&& castOther.getNetz() != null && this.getNetz()
						.equals(castOther.getNetz())))
				&& ((this.getPmdatei() == castOther.getPmdatei()) || (this
						.getPmdatei() != null && castOther.getPmdatei() != null && this
						.getPmdatei().equals(castOther.getPmdatei())))
				&& ((this.getKmdatei() == castOther.getKmdatei()) || (this
						.getKmdatei() != null && castOther.getKmdatei() != null && this
						.getKmdatei().equals(castOther.getKmdatei())))
				&& ((this.getSbd() == castOther.getSbd()) || (this.getSbd() != null
						&& castOther.getSbd() != null && this.getSbd().equals(
						castOther.getSbd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSnr();
		result = 37 * result
				+ (getKonzSnr() == null ? 0 : this.getKonzSnr().hashCode());
		result = 37 * result
				+ (getSclSnr() == null ? 0 : this.getSclSnr().hashCode());
		result = 37 * result
				+ (getBez() == null ? 0 : this.getBez().hashCode());
		result = 37 * result
				+ (getStandort() == null ? 0 : this.getStandort().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result
				+ (getBew() == null ? 0 : this.getBew().hashCode());
		result = 37 * result
				+ (getBegr() == null ? 0 : this.getBegr().hashCode());
		result = 37 * result
				+ (getNotiz() == null ? 0 : this.getNotiz().hashCode());
		result = 37 * result
				+ (getLock() == null ? 0 : this.getLock().hashCode());
		result = 37 * result
				+ (getExpSnr() == null ? 0 : this.getExpSnr().hashCode());
		result = 37 * result
				+ (getStat() == null ? 0 : this.getStat().hashCode());
		result = 37 * result
				+ (getNetz() == null ? 0 : this.getNetz().hashCode());
		result = 37 * result
				+ (getPmdatei() == null ? 0 : this.getPmdatei().hashCode());
		result = 37 * result
				+ (getKmdatei() == null ? 0 : this.getKmdatei().hashCode());
		result = 37 * result
				+ (getSbd() == null ? 0 : this.getSbd().hashCode());
		return result;
	}

}
