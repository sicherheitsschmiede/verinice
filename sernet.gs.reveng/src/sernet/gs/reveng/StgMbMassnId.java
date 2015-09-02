package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgMbMassnId generated by hbm2java
 */
public class StgMbMassnId implements java.io.Serializable {

	private Integer masId;
	private Integer masImpId;
	private Integer mskId;
	private Integer mskImpId;
	private Integer nr;
	private String nrAlt;
	private Integer notizId;
	private String link;
	private Integer konkrId;
	private Integer konkrImpId;
	private Byte metaNeu;
	private Integer metaVers;
	private Integer obsoletVers;
	private String guid;
	private Date timestamp;
	private Date loeschDatum;
	private Byte userdef;
	private Integer usn;
	private String erfasstDurch;
	private String geloeschtDurch;
	private String guidOrg;
	private Date cmTimestamp;
	private String cmUsername;
	private Short cmVerId2;
	private Byte cmStaId;
	private String changedBy;
	private Date changedOn;

	public StgMbMassnId() {
	}

	public StgMbMassnId(Integer masId, Integer masImpId, Integer mskId,
			Integer mskImpId, Integer nr, String nrAlt, Integer notizId,
			String link, Integer konkrId, Integer konkrImpId, Byte metaNeu,
			Integer metaVers, Integer obsoletVers, String guid, Date timestamp,
			Date loeschDatum, Byte userdef, Integer usn, String erfasstDurch,
			String geloeschtDurch, String guidOrg, Date cmTimestamp,
			String cmUsername, Short cmVerId2, Byte cmStaId, String changedBy,
			Date changedOn) {
		this.masId = masId;
		this.masImpId = masImpId;
		this.mskId = mskId;
		this.mskImpId = mskImpId;
		this.nr = nr;
		this.nrAlt = nrAlt;
		this.notizId = notizId;
		this.link = link;
		this.konkrId = konkrId;
		this.konkrImpId = konkrImpId;
		this.metaNeu = metaNeu;
		this.metaVers = metaVers;
		this.obsoletVers = obsoletVers;
		this.guid = guid;
		this.timestamp = timestamp;
		this.loeschDatum = loeschDatum;
		this.userdef = userdef;
		this.usn = usn;
		this.erfasstDurch = erfasstDurch;
		this.geloeschtDurch = geloeschtDurch;
		this.guidOrg = guidOrg;
		this.cmTimestamp = cmTimestamp;
		this.cmUsername = cmUsername;
		this.cmVerId2 = cmVerId2;
		this.cmStaId = cmStaId;
		this.changedBy = changedBy;
		this.changedOn = changedOn;
	}

	public Integer getMasId() {
		return this.masId;
	}

	public void setMasId(Integer masId) {
		this.masId = masId;
	}

	public Integer getMasImpId() {
		return this.masImpId;
	}

	public void setMasImpId(Integer masImpId) {
		this.masImpId = masImpId;
	}

	public Integer getMskId() {
		return this.mskId;
	}

	public void setMskId(Integer mskId) {
		this.mskId = mskId;
	}

	public Integer getMskImpId() {
		return this.mskImpId;
	}

	public void setMskImpId(Integer mskImpId) {
		this.mskImpId = mskImpId;
	}

	public Integer getNr() {
		return this.nr;
	}

	public void setNr(Integer nr) {
		this.nr = nr;
	}

	public String getNrAlt() {
		return this.nrAlt;
	}

	public void setNrAlt(String nrAlt) {
		this.nrAlt = nrAlt;
	}

	public Integer getNotizId() {
		return this.notizId;
	}

	public void setNotizId(Integer notizId) {
		this.notizId = notizId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getKonkrId() {
		return this.konkrId;
	}

	public void setKonkrId(Integer konkrId) {
		this.konkrId = konkrId;
	}

	public Integer getKonkrImpId() {
		return this.konkrImpId;
	}

	public void setKonkrImpId(Integer konkrImpId) {
		this.konkrImpId = konkrImpId;
	}

	public Byte getMetaNeu() {
		return this.metaNeu;
	}

	public void setMetaNeu(Byte metaNeu) {
		this.metaNeu = metaNeu;
	}

	public Integer getMetaVers() {
		return this.metaVers;
	}

	public void setMetaVers(Integer metaVers) {
		this.metaVers = metaVers;
	}

	public Integer getObsoletVers() {
		return this.obsoletVers;
	}

	public void setObsoletVers(Integer obsoletVers) {
		this.obsoletVers = obsoletVers;
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

	public Date getLoeschDatum() {
		return this.loeschDatum;
	}

	public void setLoeschDatum(Date loeschDatum) {
		this.loeschDatum = loeschDatum;
	}

	public Byte getUserdef() {
		return this.userdef;
	}

	public void setUserdef(Byte userdef) {
		this.userdef = userdef;
	}

	public Integer getUsn() {
		return this.usn;
	}

	public void setUsn(Integer usn) {
		this.usn = usn;
	}

	public String getErfasstDurch() {
		return this.erfasstDurch;
	}

	public void setErfasstDurch(String erfasstDurch) {
		this.erfasstDurch = erfasstDurch;
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

	public Date getCmTimestamp() {
		return this.cmTimestamp;
	}

	public void setCmTimestamp(Date cmTimestamp) {
		this.cmTimestamp = cmTimestamp;
	}

	public String getCmUsername() {
		return this.cmUsername;
	}

	public void setCmUsername(String cmUsername) {
		this.cmUsername = cmUsername;
	}

	public Short getCmVerId2() {
		return this.cmVerId2;
	}

	public void setCmVerId2(Short cmVerId2) {
		this.cmVerId2 = cmVerId2;
	}

	public Byte getCmStaId() {
		return this.cmStaId;
	}

	public void setCmStaId(Byte cmStaId) {
		this.cmStaId = cmStaId;
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
		if (!(other instanceof StgMbMassnId))
			return false;
		StgMbMassnId castOther = (StgMbMassnId) other;

		return ((this.getMasId() == castOther.getMasId()) || (this.getMasId() != null
				&& castOther.getMasId() != null && this.getMasId().equals(
				castOther.getMasId())))
				&& ((this.getMasImpId() == castOther.getMasImpId()) || (this
						.getMasImpId() != null
						&& castOther.getMasImpId() != null && this
						.getMasImpId().equals(castOther.getMasImpId())))
				&& ((this.getMskId() == castOther.getMskId()) || (this
						.getMskId() != null && castOther.getMskId() != null && this
						.getMskId().equals(castOther.getMskId())))
				&& ((this.getMskImpId() == castOther.getMskImpId()) || (this
						.getMskImpId() != null
						&& castOther.getMskImpId() != null && this
						.getMskImpId().equals(castOther.getMskImpId())))
				&& ((this.getNr() == castOther.getNr()) || (this.getNr() != null
						&& castOther.getNr() != null && this.getNr().equals(
						castOther.getNr())))
				&& ((this.getNrAlt() == castOther.getNrAlt()) || (this
						.getNrAlt() != null && castOther.getNrAlt() != null && this
						.getNrAlt().equals(castOther.getNrAlt())))
				&& ((this.getNotizId() == castOther.getNotizId()) || (this
						.getNotizId() != null && castOther.getNotizId() != null && this
						.getNotizId().equals(castOther.getNotizId())))
				&& ((this.getLink() == castOther.getLink()) || (this.getLink() != null
						&& castOther.getLink() != null && this.getLink()
						.equals(castOther.getLink())))
				&& ((this.getKonkrId() == castOther.getKonkrId()) || (this
						.getKonkrId() != null && castOther.getKonkrId() != null && this
						.getKonkrId().equals(castOther.getKonkrId())))
				&& ((this.getKonkrImpId() == castOther.getKonkrImpId()) || (this
						.getKonkrImpId() != null
						&& castOther.getKonkrImpId() != null && this
						.getKonkrImpId().equals(castOther.getKonkrImpId())))
				&& ((this.getMetaNeu() == castOther.getMetaNeu()) || (this
						.getMetaNeu() != null && castOther.getMetaNeu() != null && this
						.getMetaNeu().equals(castOther.getMetaNeu())))
				&& ((this.getMetaVers() == castOther.getMetaVers()) || (this
						.getMetaVers() != null
						&& castOther.getMetaVers() != null && this
						.getMetaVers().equals(castOther.getMetaVers())))
				&& ((this.getObsoletVers() == castOther.getObsoletVers()) || (this
						.getObsoletVers() != null
						&& castOther.getObsoletVers() != null && this
						.getObsoletVers().equals(castOther.getObsoletVers())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())))
				&& ((this.getLoeschDatum() == castOther.getLoeschDatum()) || (this
						.getLoeschDatum() != null
						&& castOther.getLoeschDatum() != null && this
						.getLoeschDatum().equals(castOther.getLoeschDatum())))
				&& ((this.getUserdef() == castOther.getUserdef()) || (this
						.getUserdef() != null && castOther.getUserdef() != null && this
						.getUserdef().equals(castOther.getUserdef())))
				&& ((this.getUsn() == castOther.getUsn()) || (this.getUsn() != null
						&& castOther.getUsn() != null && this.getUsn().equals(
						castOther.getUsn())))
				&& ((this.getErfasstDurch() == castOther.getErfasstDurch()) || (this
						.getErfasstDurch() != null
						&& castOther.getErfasstDurch() != null && this
						.getErfasstDurch().equals(castOther.getErfasstDurch())))
				&& ((this.getGeloeschtDurch() == castOther.getGeloeschtDurch()) || (this
						.getGeloeschtDurch() != null
						&& castOther.getGeloeschtDurch() != null && this
						.getGeloeschtDurch().equals(
								castOther.getGeloeschtDurch())))
				&& ((this.getGuidOrg() == castOther.getGuidOrg()) || (this
						.getGuidOrg() != null && castOther.getGuidOrg() != null && this
						.getGuidOrg().equals(castOther.getGuidOrg())))
				&& ((this.getCmTimestamp() == castOther.getCmTimestamp()) || (this
						.getCmTimestamp() != null
						&& castOther.getCmTimestamp() != null && this
						.getCmTimestamp().equals(castOther.getCmTimestamp())))
				&& ((this.getCmUsername() == castOther.getCmUsername()) || (this
						.getCmUsername() != null
						&& castOther.getCmUsername() != null && this
						.getCmUsername().equals(castOther.getCmUsername())))
				&& ((this.getCmVerId2() == castOther.getCmVerId2()) || (this
						.getCmVerId2() != null
						&& castOther.getCmVerId2() != null && this
						.getCmVerId2().equals(castOther.getCmVerId2())))
				&& ((this.getCmStaId() == castOther.getCmStaId()) || (this
						.getCmStaId() != null && castOther.getCmStaId() != null && this
						.getCmStaId().equals(castOther.getCmStaId())))
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

		result = 37 * result
				+ (getMasId() == null ? 0 : this.getMasId().hashCode());
		result = 37 * result
				+ (getMasImpId() == null ? 0 : this.getMasImpId().hashCode());
		result = 37 * result
				+ (getMskId() == null ? 0 : this.getMskId().hashCode());
		result = 37 * result
				+ (getMskImpId() == null ? 0 : this.getMskImpId().hashCode());
		result = 37 * result + (getNr() == null ? 0 : this.getNr().hashCode());
		result = 37 * result
				+ (getNrAlt() == null ? 0 : this.getNrAlt().hashCode());
		result = 37 * result
				+ (getNotizId() == null ? 0 : this.getNotizId().hashCode());
		result = 37 * result
				+ (getLink() == null ? 0 : this.getLink().hashCode());
		result = 37 * result
				+ (getKonkrId() == null ? 0 : this.getKonkrId().hashCode());
		result = 37
				* result
				+ (getKonkrImpId() == null ? 0 : this.getKonkrImpId()
						.hashCode());
		result = 37 * result
				+ (getMetaNeu() == null ? 0 : this.getMetaNeu().hashCode());
		result = 37 * result
				+ (getMetaVers() == null ? 0 : this.getMetaVers().hashCode());
		result = 37
				* result
				+ (getObsoletVers() == null ? 0 : this.getObsoletVers()
						.hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		result = 37
				* result
				+ (getLoeschDatum() == null ? 0 : this.getLoeschDatum()
						.hashCode());
		result = 37 * result
				+ (getUserdef() == null ? 0 : this.getUserdef().hashCode());
		result = 37 * result
				+ (getUsn() == null ? 0 : this.getUsn().hashCode());
		result = 37
				* result
				+ (getErfasstDurch() == null ? 0 : this.getErfasstDurch()
						.hashCode());
		result = 37
				* result
				+ (getGeloeschtDurch() == null ? 0 : this.getGeloeschtDurch()
						.hashCode());
		result = 37 * result
				+ (getGuidOrg() == null ? 0 : this.getGuidOrg().hashCode());
		result = 37
				* result
				+ (getCmTimestamp() == null ? 0 : this.getCmTimestamp()
						.hashCode());
		result = 37
				* result
				+ (getCmUsername() == null ? 0 : this.getCmUsername()
						.hashCode());
		result = 37 * result
				+ (getCmVerId2() == null ? 0 : this.getCmVerId2().hashCode());
		result = 37 * result
				+ (getCmStaId() == null ? 0 : this.getCmStaId().hashCode());
		result = 37 * result
				+ (getChangedBy() == null ? 0 : this.getChangedBy().hashCode());
		result = 37 * result
				+ (getChangedOn() == null ? 0 : this.getChangedOn().hashCode());
		return result;
	}

}
