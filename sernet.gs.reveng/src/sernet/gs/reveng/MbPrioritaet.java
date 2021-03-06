package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MbPrioritaet generated by hbm2java
 */
public class MbPrioritaet implements java.io.Serializable {

	private MbPrioritaetId id;
	private Date timestamp;
	private MbBaustMassnGsiegel mbBaustMassnGsiegel;
	private SysImport sysImport;
	private int prio2;
	private Date loeschDatum;
	private String guid;
	private Byte impNeu;
	private String erfasstDurch;
	private String geloeschtDurch;
	private String guidOrg;
	private int usn;

	public MbPrioritaet() {
	}

	public MbPrioritaet(MbPrioritaetId id,
			MbBaustMassnGsiegel mbBaustMassnGsiegel, SysImport sysImport,
			int prio2, String guid, int usn) {
		this.id = id;
		this.mbBaustMassnGsiegel = mbBaustMassnGsiegel;
		this.sysImport = sysImport;
		this.prio2 = prio2;
		this.guid = guid;
		this.usn = usn;
	}

	public MbPrioritaet(MbPrioritaetId id,
			MbBaustMassnGsiegel mbBaustMassnGsiegel, SysImport sysImport,
			int prio2, Date loeschDatum, String guid, Byte impNeu,
			String erfasstDurch, String geloeschtDurch, String guidOrg, int usn) {
		this.id = id;
		this.mbBaustMassnGsiegel = mbBaustMassnGsiegel;
		this.sysImport = sysImport;
		this.prio2 = prio2;
		this.loeschDatum = loeschDatum;
		this.guid = guid;
		this.impNeu = impNeu;
		this.erfasstDurch = erfasstDurch;
		this.geloeschtDurch = geloeschtDurch;
		this.guidOrg = guidOrg;
		this.usn = usn;
	}

	public MbPrioritaetId getId() {
		return this.id;
	}

	public void setId(MbPrioritaetId id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public MbBaustMassnGsiegel getMbBaustMassnGsiegel() {
		return this.mbBaustMassnGsiegel;
	}

	public void setMbBaustMassnGsiegel(MbBaustMassnGsiegel mbBaustMassnGsiegel) {
		this.mbBaustMassnGsiegel = mbBaustMassnGsiegel;
	}

	public SysImport getSysImport() {
		return this.sysImport;
	}

	public void setSysImport(SysImport sysImport) {
		this.sysImport = sysImport;
	}

	public int getPrio2() {
		return this.prio2;
	}

	public void setPrio2(int prio2) {
		this.prio2 = prio2;
	}

	public Date getLoeschDatum() {
		return this.loeschDatum;
	}

	public void setLoeschDatum(Date loeschDatum) {
		this.loeschDatum = loeschDatum;
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

	public int getUsn() {
		return this.usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

}
