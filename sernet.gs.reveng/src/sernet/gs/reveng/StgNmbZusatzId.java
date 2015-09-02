package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * StgNmbZusatzId generated by hbm2java
 */
public class StgNmbZusatzId implements java.io.Serializable {

	private Integer id;
	private Integer notizId;
	private Integer notizImpId;
	private String name;
	private Integer dtyId;
	private Short prec;
	private Short scale;
	private Short length;
	private Boolean muss;
	private String wertZeichen;
	private BigDecimal wertWaehrung;
	private Date wertDatum;
	private BigDecimal wertDezimal;
	private Integer wertGanzzahl;
	private Integer waeId;
	private Integer waeImpId;
	private String guid;
	private Byte impNeu;
	private Integer usn;
	private Date erfasstAm;
	private String erfasstDurch;
	private Date geloeschtAm;
	private String geloeschtDurch;
	private String guidOrg;
	private String changedBy;
	private Date changedOn;

	public StgNmbZusatzId() {
	}

	public StgNmbZusatzId(Integer id, Integer notizId, Integer notizImpId,
			String name, Integer dtyId, Short prec, Short scale, Short length,
			Boolean muss, String wertZeichen, BigDecimal wertWaehrung,
			Date wertDatum, BigDecimal wertDezimal, Integer wertGanzzahl,
			Integer waeId, Integer waeImpId, String guid, Byte impNeu,
			Integer usn, Date erfasstAm, String erfasstDurch, Date geloeschtAm,
			String geloeschtDurch, String guidOrg, String changedBy,
			Date changedOn) {
		this.id = id;
		this.notizId = notizId;
		this.notizImpId = notizImpId;
		this.name = name;
		this.dtyId = dtyId;
		this.prec = prec;
		this.scale = scale;
		this.length = length;
		this.muss = muss;
		this.wertZeichen = wertZeichen;
		this.wertWaehrung = wertWaehrung;
		this.wertDatum = wertDatum;
		this.wertDezimal = wertDezimal;
		this.wertGanzzahl = wertGanzzahl;
		this.waeId = waeId;
		this.waeImpId = waeImpId;
		this.guid = guid;
		this.impNeu = impNeu;
		this.usn = usn;
		this.erfasstAm = erfasstAm;
		this.erfasstDurch = erfasstDurch;
		this.geloeschtAm = geloeschtAm;
		this.geloeschtDurch = geloeschtDurch;
		this.guidOrg = guidOrg;
		this.changedBy = changedBy;
		this.changedOn = changedOn;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNotizId() {
		return this.notizId;
	}

	public void setNotizId(Integer notizId) {
		this.notizId = notizId;
	}

	public Integer getNotizImpId() {
		return this.notizImpId;
	}

	public void setNotizImpId(Integer notizImpId) {
		this.notizImpId = notizImpId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDtyId() {
		return this.dtyId;
	}

	public void setDtyId(Integer dtyId) {
		this.dtyId = dtyId;
	}

	public Short getPrec() {
		return this.prec;
	}

	public void setPrec(Short prec) {
		this.prec = prec;
	}

	public Short getScale() {
		return this.scale;
	}

	public void setScale(Short scale) {
		this.scale = scale;
	}

	public Short getLength() {
		return this.length;
	}

	public void setLength(Short length) {
		this.length = length;
	}

	public Boolean getMuss() {
		return this.muss;
	}

	public void setMuss(Boolean muss) {
		this.muss = muss;
	}

	public String getWertZeichen() {
		return this.wertZeichen;
	}

	public void setWertZeichen(String wertZeichen) {
		this.wertZeichen = wertZeichen;
	}

	public BigDecimal getWertWaehrung() {
		return this.wertWaehrung;
	}

	public void setWertWaehrung(BigDecimal wertWaehrung) {
		this.wertWaehrung = wertWaehrung;
	}

	public Date getWertDatum() {
		return this.wertDatum;
	}

	public void setWertDatum(Date wertDatum) {
		this.wertDatum = wertDatum;
	}

	public BigDecimal getWertDezimal() {
		return this.wertDezimal;
	}

	public void setWertDezimal(BigDecimal wertDezimal) {
		this.wertDezimal = wertDezimal;
	}

	public Integer getWertGanzzahl() {
		return this.wertGanzzahl;
	}

	public void setWertGanzzahl(Integer wertGanzzahl) {
		this.wertGanzzahl = wertGanzzahl;
	}

	public Integer getWaeId() {
		return this.waeId;
	}

	public void setWaeId(Integer waeId) {
		this.waeId = waeId;
	}

	public Integer getWaeImpId() {
		return this.waeImpId;
	}

	public void setWaeImpId(Integer waeImpId) {
		this.waeImpId = waeImpId;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

	public Integer getUsn() {
		return this.usn;
	}

	public void setUsn(Integer usn) {
		this.usn = usn;
	}

	public Date getErfasstAm() {
		return this.erfasstAm;
	}

	public void setErfasstAm(Date erfasstAm) {
		this.erfasstAm = erfasstAm;
	}

	public String getErfasstDurch() {
		return this.erfasstDurch;
	}

	public void setErfasstDurch(String erfasstDurch) {
		this.erfasstDurch = erfasstDurch;
	}

	public Date getGeloeschtAm() {
		return this.geloeschtAm;
	}

	public void setGeloeschtAm(Date geloeschtAm) {
		this.geloeschtAm = geloeschtAm;
	}

	public String getGeloeschtDurch() {
		return this.geloeschtDurch;
	}

	public void setGeloeschtDurch(String geloeschtDurch) {
		this.geloeschtDurch = geloeschtDurch;
	}

	public String getGuidOrg() {
		return this.guidOrg;
	}

	public void setGuidOrg(String guidOrg) {
		this.guidOrg = guidOrg;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public Date getChangedOn() {
		return this.changedOn;
	}

	public void setChangedOn(Date changedOn) {
		this.changedOn = changedOn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgNmbZusatzId))
			return false;
		StgNmbZusatzId castOther = (StgNmbZusatzId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNotizId() == castOther.getNotizId()) || (this
						.getNotizId() != null && castOther.getNotizId() != null && this
						.getNotizId().equals(castOther.getNotizId())))
				&& ((this.getNotizImpId() == castOther.getNotizImpId()) || (this
						.getNotizImpId() != null
						&& castOther.getNotizImpId() != null && this
						.getNotizImpId().equals(castOther.getNotizImpId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getDtyId() == castOther.getDtyId()) || (this
						.getDtyId() != null && castOther.getDtyId() != null && this
						.getDtyId().equals(castOther.getDtyId())))
				&& ((this.getPrec() == castOther.getPrec()) || (this.getPrec() != null
						&& castOther.getPrec() != null && this.getPrec()
						.equals(castOther.getPrec())))
				&& ((this.getScale() == castOther.getScale()) || (this
						.getScale() != null && castOther.getScale() != null && this
						.getScale().equals(castOther.getScale())))
				&& ((this.getLength() == castOther.getLength()) || (this
						.getLength() != null && castOther.getLength() != null && this
						.getLength().equals(castOther.getLength())))
				&& ((this.getMuss() == castOther.getMuss()) || (this.getMuss() != null
						&& castOther.getMuss() != null && this.getMuss()
						.equals(castOther.getMuss())))
				&& ((this.getWertZeichen() == castOther.getWertZeichen()) || (this
						.getWertZeichen() != null
						&& castOther.getWertZeichen() != null && this
						.getWertZeichen().equals(castOther.getWertZeichen())))
				&& ((this.getWertWaehrung() == castOther.getWertWaehrung()) || (this
						.getWertWaehrung() != null
						&& castOther.getWertWaehrung() != null && this
						.getWertWaehrung().equals(castOther.getWertWaehrung())))
				&& ((this.getWertDatum() == castOther.getWertDatum()) || (this
						.getWertDatum() != null
						&& castOther.getWertDatum() != null && this
						.getWertDatum().equals(castOther.getWertDatum())))
				&& ((this.getWertDezimal() == castOther.getWertDezimal()) || (this
						.getWertDezimal() != null
						&& castOther.getWertDezimal() != null && this
						.getWertDezimal().equals(castOther.getWertDezimal())))
				&& ((this.getWertGanzzahl() == castOther.getWertGanzzahl()) || (this
						.getWertGanzzahl() != null
						&& castOther.getWertGanzzahl() != null && this
						.getWertGanzzahl().equals(castOther.getWertGanzzahl())))
				&& ((this.getWaeId() == castOther.getWaeId()) || (this
						.getWaeId() != null && castOther.getWaeId() != null && this
						.getWaeId().equals(castOther.getWaeId())))
				&& ((this.getWaeImpId() == castOther.getWaeImpId()) || (this
						.getWaeImpId() != null
						&& castOther.getWaeImpId() != null && this
						.getWaeImpId().equals(castOther.getWaeImpId())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getImpNeu() == castOther.getImpNeu()) || (this
						.getImpNeu() != null && castOther.getImpNeu() != null && this
						.getImpNeu().equals(castOther.getImpNeu())))
				&& ((this.getUsn() == castOther.getUsn()) || (this.getUsn() != null
						&& castOther.getUsn() != null && this.getUsn().equals(
						castOther.getUsn())))
				&& ((this.getErfasstAm() == castOther.getErfasstAm()) || (this
						.getErfasstAm() != null
						&& castOther.getErfasstAm() != null && this
						.getErfasstAm().equals(castOther.getErfasstAm())))
				&& ((this.getErfasstDurch() == castOther.getErfasstDurch()) || (this
						.getErfasstDurch() != null
						&& castOther.getErfasstDurch() != null && this
						.getErfasstDurch().equals(castOther.getErfasstDurch())))
				&& ((this.getGeloeschtAm() == castOther.getGeloeschtAm()) || (this
						.getGeloeschtAm() != null
						&& castOther.getGeloeschtAm() != null && this
						.getGeloeschtAm().equals(castOther.getGeloeschtAm())))
				&& ((this.getGeloeschtDurch() == castOther.getGeloeschtDurch()) || (this
						.getGeloeschtDurch() != null
						&& castOther.getGeloeschtDurch() != null && this
						.getGeloeschtDurch().equals(
								castOther.getGeloeschtDurch())))
				&& ((this.getGuidOrg() == castOther.getGuidOrg()) || (this
						.getGuidOrg() != null && castOther.getGuidOrg() != null && this
						.getGuidOrg().equals(castOther.getGuidOrg())))
				&& ((this.getChangedBy() == castOther.getChangedBy()) || (this
						.getChangedBy() != null
						&& castOther.getChangedBy() != null && this
						.getChangedBy().equals(castOther.getChangedBy())))
				&& ((this.getChangedOn() == castOther.getChangedOn()) || (this
						.getChangedOn() != null
						&& castOther.getChangedOn() != null && this
						.getChangedOn().equals(castOther.getChangedOn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getNotizId() == null ? 0 : this.getNotizId().hashCode());
		result = 37
				* result
				+ (getNotizImpId() == null ? 0 : this.getNotizImpId()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getDtyId() == null ? 0 : this.getDtyId().hashCode());
		result = 37 * result
				+ (getPrec() == null ? 0 : this.getPrec().hashCode());
		result = 37 * result
				+ (getScale() == null ? 0 : this.getScale().hashCode());
		result = 37 * result
				+ (getLength() == null ? 0 : this.getLength().hashCode());
		result = 37 * result
				+ (getMuss() == null ? 0 : this.getMuss().hashCode());
		result = 37
				* result
				+ (getWertZeichen() == null ? 0 : this.getWertZeichen()
						.hashCode());
		result = 37
				* result
				+ (getWertWaehrung() == null ? 0 : this.getWertWaehrung()
						.hashCode());
		result = 37 * result
				+ (getWertDatum() == null ? 0 : this.getWertDatum().hashCode());
		result = 37
				* result
				+ (getWertDezimal() == null ? 0 : this.getWertDezimal()
						.hashCode());
		result = 37
				* result
				+ (getWertGanzzahl() == null ? 0 : this.getWertGanzzahl()
						.hashCode());
		result = 37 * result
				+ (getWaeId() == null ? 0 : this.getWaeId().hashCode());
		result = 37 * result
				+ (getWaeImpId() == null ? 0 : this.getWaeImpId().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getImpNeu() == null ? 0 : this.getImpNeu().hashCode());
		result = 37 * result
				+ (getUsn() == null ? 0 : this.getUsn().hashCode());
		result = 37 * result
				+ (getErfasstAm() == null ? 0 : this.getErfasstAm().hashCode());
		result = 37
				* result
				+ (getErfasstDurch() == null ? 0 : this.getErfasstDurch()
						.hashCode());
		result = 37
				* result
				+ (getGeloeschtAm() == null ? 0 : this.getGeloeschtAm()
						.hashCode());
		result = 37
				* result
				+ (getGeloeschtDurch() == null ? 0 : this.getGeloeschtDurch()
						.hashCode());
		result = 37 * result
				+ (getGuidOrg() == null ? 0 : this.getGuidOrg().hashCode());
		result = 37 * result
				+ (getChangedBy() == null ? 0 : this.getChangedBy().hashCode());
		result = 37 * result
				+ (getChangedOn() == null ? 0 : this.getChangedOn().hashCode());
		return result;
	}

}
