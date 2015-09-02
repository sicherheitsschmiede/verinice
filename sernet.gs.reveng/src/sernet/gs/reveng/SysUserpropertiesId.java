package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * SysUserpropertiesId generated by hbm2java
 */
public class SysUserpropertiesId implements java.io.Serializable {

	private short uid;
	private String propName;
	private int impId;
	private String host;

	public SysUserpropertiesId() {
	}

	public SysUserpropertiesId(short uid, String propName, int impId,
			String host) {
		this.uid = uid;
		this.propName = propName;
		this.impId = impId;
		this.host = host;
	}

	public short getUid() {
		return this.uid;
	}

	public void setUid(short uid) {
		this.uid = uid;
	}

	public String getPropName() {
		return this.propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public int getImpId() {
		return this.impId;
	}

	public void setImpId(int impId) {
		this.impId = impId;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SysUserpropertiesId))
			return false;
		SysUserpropertiesId castOther = (SysUserpropertiesId) other;

		return (this.getUid() == castOther.getUid())
				&& ((this.getPropName() == castOther.getPropName()) || (this
						.getPropName() != null
						&& castOther.getPropName() != null && this
						.getPropName().equals(castOther.getPropName())))
				&& (this.getImpId() == castOther.getImpId())
				&& ((this.getHost() == castOther.getHost()) || (this.getHost() != null
						&& castOther.getHost() != null && this.getHost()
						.equals(castOther.getHost())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUid();
		result = 37 * result
				+ (getPropName() == null ? 0 : this.getPropName().hashCode());
		result = 37 * result + this.getImpId();
		result = 37 * result
				+ (getHost() == null ? 0 : this.getHost().hashCode());
		return result;
	}

}
