package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * StgDtsStepTxtId generated by hbm2java
 */
public class StgDtsStepTxtId implements java.io.Serializable {

	private String dtsId;
	private Integer dtsStep;
	private Short sprId;
	private String beschreibung;
	private String fehler;

	public StgDtsStepTxtId() {
	}

	public StgDtsStepTxtId(String dtsId) {
		this.dtsId = dtsId;
	}

	public StgDtsStepTxtId(String dtsId, Integer dtsStep, Short sprId,
			String beschreibung, String fehler) {
		this.dtsId = dtsId;
		this.dtsStep = dtsStep;
		this.sprId = sprId;
		this.beschreibung = beschreibung;
		this.fehler = fehler;
	}

	public String getDtsId() {
		return this.dtsId;
	}

	public void setDtsId(String dtsId) {
		this.dtsId = dtsId;
	}

	public Integer getDtsStep() {
		return this.dtsStep;
	}

	public void setDtsStep(Integer dtsStep) {
		this.dtsStep = dtsStep;
	}

	public Short getSprId() {
		return this.sprId;
	}

	public void setSprId(Short sprId) {
		this.sprId = sprId;
	}

	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getFehler() {
		return this.fehler;
	}

	public void setFehler(String fehler) {
		this.fehler = fehler;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgDtsStepTxtId))
			return false;
		StgDtsStepTxtId castOther = (StgDtsStepTxtId) other;

		return ((this.getDtsId() == castOther.getDtsId()) || (this.getDtsId() != null
				&& castOther.getDtsId() != null && this.getDtsId().equals(
				castOther.getDtsId())))
				&& ((this.getDtsStep() == castOther.getDtsStep()) || (this
						.getDtsStep() != null && castOther.getDtsStep() != null && this
						.getDtsStep().equals(castOther.getDtsStep())))
				&& ((this.getSprId() == castOther.getSprId()) || (this
						.getSprId() != null && castOther.getSprId() != null && this
						.getSprId().equals(castOther.getSprId())))
				&& ((this.getBeschreibung() == castOther.getBeschreibung()) || (this
						.getBeschreibung() != null
						&& castOther.getBeschreibung() != null && this
						.getBeschreibung().equals(castOther.getBeschreibung())))
				&& ((this.getFehler() == castOther.getFehler()) || (this
						.getFehler() != null && castOther.getFehler() != null && this
						.getFehler().equals(castOther.getFehler())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDtsId() == null ? 0 : this.getDtsId().hashCode());
		result = 37 * result
				+ (getDtsStep() == null ? 0 : this.getDtsStep().hashCode());
		result = 37 * result
				+ (getSprId() == null ? 0 : this.getSprId().hashCode());
		result = 37
				* result
				+ (getBeschreibung() == null ? 0 : this.getBeschreibung()
						.hashCode());
		result = 37 * result
				+ (getFehler() == null ? 0 : this.getFehler().hashCode());
		return result;
	}

}
