package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RechteAnwender generated by hbm2java
 */
public class RechteAnwender implements java.io.Serializable {

	private short uid;
	private Date timestamp;
	private Integer rerId;
	private String name;
	private String telefon;
	private String abteilung;
	private String beschreibung;
	private Integer notizId;
	private String funktion;
	private String loginname;
	private boolean aktiv;
	private boolean hatLogin;
	private boolean hatDbzugriff;
	private boolean kennwortNeuJn;
	private Set rechteAnwenderImports = new HashSet(0);
	private Set rechteAnwenderRolles = new HashSet(0);
	private Set sysUsertbses = new HashSet(0);
	private Set sysUserpropertieses = new HashSet(0);
	private Set brBerichts = new HashSet(0);

	public RechteAnwender() {
	}

	public RechteAnwender(short uid, String name, boolean aktiv,
			boolean hatLogin, boolean hatDbzugriff, boolean kennwortNeuJn) {
		this.uid = uid;
		this.name = name;
		this.aktiv = aktiv;
		this.hatLogin = hatLogin;
		this.hatDbzugriff = hatDbzugriff;
		this.kennwortNeuJn = kennwortNeuJn;
	}

	public RechteAnwender(short uid, Integer rerId, String name,
			String telefon, String abteilung, String beschreibung,
			Integer notizId, String funktion, String loginname, boolean aktiv,
			boolean hatLogin, boolean hatDbzugriff, boolean kennwortNeuJn,
			Set rechteAnwenderImports, Set rechteAnwenderRolles,
			Set sysUsertbses, Set sysUserpropertieses, Set brBerichts) {
		this.uid = uid;
		this.rerId = rerId;
		this.name = name;
		this.telefon = telefon;
		this.abteilung = abteilung;
		this.beschreibung = beschreibung;
		this.notizId = notizId;
		this.funktion = funktion;
		this.loginname = loginname;
		this.aktiv = aktiv;
		this.hatLogin = hatLogin;
		this.hatDbzugriff = hatDbzugriff;
		this.kennwortNeuJn = kennwortNeuJn;
		this.rechteAnwenderImports = rechteAnwenderImports;
		this.rechteAnwenderRolles = rechteAnwenderRolles;
		this.sysUsertbses = sysUsertbses;
		this.sysUserpropertieses = sysUserpropertieses;
		this.brBerichts = brBerichts;
	}

	public short getUid() {
		return this.uid;
	}

	public void setUid(short uid) {
		this.uid = uid;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getRerId() {
		return this.rerId;
	}

	public void setRerId(Integer rerId) {
		this.rerId = rerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAbteilung() {
		return this.abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public Integer getNotizId() {
		return this.notizId;
	}

	public void setNotizId(Integer notizId) {
		this.notizId = notizId;
	}

	public String getFunktion() {
		return this.funktion;
	}

	public void setFunktion(String funktion) {
		this.funktion = funktion;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public boolean isAktiv() {
		return this.aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public boolean isHatLogin() {
		return this.hatLogin;
	}

	public void setHatLogin(boolean hatLogin) {
		this.hatLogin = hatLogin;
	}

	public boolean isHatDbzugriff() {
		return this.hatDbzugriff;
	}

	public void setHatDbzugriff(boolean hatDbzugriff) {
		this.hatDbzugriff = hatDbzugriff;
	}

	public boolean isKennwortNeuJn() {
		return this.kennwortNeuJn;
	}

	public void setKennwortNeuJn(boolean kennwortNeuJn) {
		this.kennwortNeuJn = kennwortNeuJn;
	}

	public Set getRechteAnwenderImports() {
		return this.rechteAnwenderImports;
	}

	public void setRechteAnwenderImports(Set rechteAnwenderImports) {
		this.rechteAnwenderImports = rechteAnwenderImports;
	}

	public Set getRechteAnwenderRolles() {
		return this.rechteAnwenderRolles;
	}

	public void setRechteAnwenderRolles(Set rechteAnwenderRolles) {
		this.rechteAnwenderRolles = rechteAnwenderRolles;
	}

	public Set getSysUsertbses() {
		return this.sysUsertbses;
	}

	public void setSysUsertbses(Set sysUsertbses) {
		this.sysUsertbses = sysUsertbses;
	}

	public Set getSysUserpropertieses() {
		return this.sysUserpropertieses;
	}

	public void setSysUserpropertieses(Set sysUserpropertieses) {
		this.sysUserpropertieses = sysUserpropertieses;
	}

	public Set getBrBerichts() {
		return this.brBerichts;
	}

	public void setBrBerichts(Set brBerichts) {
		this.brBerichts = brBerichts;
	}

}
