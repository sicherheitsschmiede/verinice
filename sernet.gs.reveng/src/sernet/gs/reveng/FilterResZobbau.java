package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * FilterResZobbau generated by hbm2java
 */
public class FilterResZobbau implements java.io.Serializable {

	private FilterResZobbauId id;
	private short spid;
	private String orderStr1;
	private String orderStr2;
	private String orderStr3;

	public FilterResZobbau() {
	}

	public FilterResZobbau(FilterResZobbauId id, short spid) {
		this.id = id;
		this.spid = spid;
	}

	public FilterResZobbau(FilterResZobbauId id, short spid, String orderStr1,
			String orderStr2, String orderStr3) {
		this.id = id;
		this.spid = spid;
		this.orderStr1 = orderStr1;
		this.orderStr2 = orderStr2;
		this.orderStr3 = orderStr3;
	}

	public FilterResZobbauId getId() {
		return this.id;
	}

	public void setId(FilterResZobbauId id) {
		this.id = id;
	}

	public short getSpid() {
		return this.spid;
	}

	public void setSpid(short spid) {
		this.spid = spid;
	}

	public String getOrderStr1() {
		return this.orderStr1;
	}

	public void setOrderStr1(String orderStr1) {
		this.orderStr1 = orderStr1;
	}

	public String getOrderStr2() {
		return this.orderStr2;
	}

	public void setOrderStr2(String orderStr2) {
		this.orderStr2 = orderStr2;
	}

	public String getOrderStr3() {
		return this.orderStr3;
	}

	public void setOrderStr3(String orderStr3) {
		this.orderStr3 = orderStr3;
	}

}
