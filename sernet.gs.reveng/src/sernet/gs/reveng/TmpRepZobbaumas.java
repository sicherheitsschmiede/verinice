package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * TmpRepZobbaumas generated by hbm2java
 */
public class TmpRepZobbaumas implements java.io.Serializable {

	private TmpRepZobbaumasId id;
	private short spid;

	public TmpRepZobbaumas() {
	}

	public TmpRepZobbaumas(TmpRepZobbaumasId id, short spid) {
		this.id = id;
		this.spid = spid;
	}

	public TmpRepZobbaumasId getId() {
		return this.id;
	}

	public void setId(TmpRepZobbaumasId id) {
		this.id = id;
	}

	public short getSpid() {
		return this.spid;
	}

	public void setSpid(short spid) {
		this.spid = spid;
	}

}
