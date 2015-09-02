package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * StgFilterColId generated by hbm2java
 */
public class StgFilterColId implements java.io.Serializable {

	private Integer fltId;
	private Byte rowId;
	private Byte colId;
	private Integer fsrNumVal1;
	private Integer fsrNumVal2;
	private Integer fsrNumVal3;
	private String fsrTxtValue;
	private Date fsrDateValue;
	private BigDecimal fsrDecValue;
	private Byte fsrOperator;
	private String fsrOrder;

	public StgFilterColId() {
	}

	public StgFilterColId(Integer fltId, Byte rowId, Byte colId,
			Integer fsrNumVal1, Integer fsrNumVal2, Integer fsrNumVal3,
			String fsrTxtValue, Date fsrDateValue, BigDecimal fsrDecValue,
			Byte fsrOperator, String fsrOrder) {
		this.fltId = fltId;
		this.rowId = rowId;
		this.colId = colId;
		this.fsrNumVal1 = fsrNumVal1;
		this.fsrNumVal2 = fsrNumVal2;
		this.fsrNumVal3 = fsrNumVal3;
		this.fsrTxtValue = fsrTxtValue;
		this.fsrDateValue = fsrDateValue;
		this.fsrDecValue = fsrDecValue;
		this.fsrOperator = fsrOperator;
		this.fsrOrder = fsrOrder;
	}

	public Integer getFltId() {
		return this.fltId;
	}

	public void setFltId(Integer fltId) {
		this.fltId = fltId;
	}

	public Byte getRowId() {
		return this.rowId;
	}

	public void setRowId(Byte rowId) {
		this.rowId = rowId;
	}

	public Byte getColId() {
		return this.colId;
	}

	public void setColId(Byte colId) {
		this.colId = colId;
	}

	public Integer getFsrNumVal1() {
		return this.fsrNumVal1;
	}

	public void setFsrNumVal1(Integer fsrNumVal1) {
		this.fsrNumVal1 = fsrNumVal1;
	}

	public Integer getFsrNumVal2() {
		return this.fsrNumVal2;
	}

	public void setFsrNumVal2(Integer fsrNumVal2) {
		this.fsrNumVal2 = fsrNumVal2;
	}

	public Integer getFsrNumVal3() {
		return this.fsrNumVal3;
	}

	public void setFsrNumVal3(Integer fsrNumVal3) {
		this.fsrNumVal3 = fsrNumVal3;
	}

	public String getFsrTxtValue() {
		return this.fsrTxtValue;
	}

	public void setFsrTxtValue(String fsrTxtValue) {
		this.fsrTxtValue = fsrTxtValue;
	}

	public Date getFsrDateValue() {
		return this.fsrDateValue;
	}

	public void setFsrDateValue(Date fsrDateValue) {
		this.fsrDateValue = fsrDateValue;
	}

	public BigDecimal getFsrDecValue() {
		return this.fsrDecValue;
	}

	public void setFsrDecValue(BigDecimal fsrDecValue) {
		this.fsrDecValue = fsrDecValue;
	}

	public Byte getFsrOperator() {
		return this.fsrOperator;
	}

	public void setFsrOperator(Byte fsrOperator) {
		this.fsrOperator = fsrOperator;
	}

	public String getFsrOrder() {
		return this.fsrOrder;
	}

	public void setFsrOrder(String fsrOrder) {
		this.fsrOrder = fsrOrder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgFilterColId))
			return false;
		StgFilterColId castOther = (StgFilterColId) other;

		return ((this.getFltId() == castOther.getFltId()) || (this.getFltId() != null
				&& castOther.getFltId() != null && this.getFltId().equals(
				castOther.getFltId())))
				&& ((this.getRowId() == castOther.getRowId()) || (this
						.getRowId() != null && castOther.getRowId() != null && this
						.getRowId().equals(castOther.getRowId())))
				&& ((this.getColId() == castOther.getColId()) || (this
						.getColId() != null && castOther.getColId() != null && this
						.getColId().equals(castOther.getColId())))
				&& ((this.getFsrNumVal1() == castOther.getFsrNumVal1()) || (this
						.getFsrNumVal1() != null
						&& castOther.getFsrNumVal1() != null && this
						.getFsrNumVal1().equals(castOther.getFsrNumVal1())))
				&& ((this.getFsrNumVal2() == castOther.getFsrNumVal2()) || (this
						.getFsrNumVal2() != null
						&& castOther.getFsrNumVal2() != null && this
						.getFsrNumVal2().equals(castOther.getFsrNumVal2())))
				&& ((this.getFsrNumVal3() == castOther.getFsrNumVal3()) || (this
						.getFsrNumVal3() != null
						&& castOther.getFsrNumVal3() != null && this
						.getFsrNumVal3().equals(castOther.getFsrNumVal3())))
				&& ((this.getFsrTxtValue() == castOther.getFsrTxtValue()) || (this
						.getFsrTxtValue() != null
						&& castOther.getFsrTxtValue() != null && this
						.getFsrTxtValue().equals(castOther.getFsrTxtValue())))
				&& ((this.getFsrDateValue() == castOther.getFsrDateValue()) || (this
						.getFsrDateValue() != null
						&& castOther.getFsrDateValue() != null && this
						.getFsrDateValue().equals(castOther.getFsrDateValue())))
				&& ((this.getFsrDecValue() == castOther.getFsrDecValue()) || (this
						.getFsrDecValue() != null
						&& castOther.getFsrDecValue() != null && this
						.getFsrDecValue().equals(castOther.getFsrDecValue())))
				&& ((this.getFsrOperator() == castOther.getFsrOperator()) || (this
						.getFsrOperator() != null
						&& castOther.getFsrOperator() != null && this
						.getFsrOperator().equals(castOther.getFsrOperator())))
				&& ((this.getFsrOrder() == castOther.getFsrOrder()) || (this
						.getFsrOrder() != null
						&& castOther.getFsrOrder() != null && this
						.getFsrOrder().equals(castOther.getFsrOrder())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFltId() == null ? 0 : this.getFltId().hashCode());
		result = 37 * result
				+ (getRowId() == null ? 0 : this.getRowId().hashCode());
		result = 37 * result
				+ (getColId() == null ? 0 : this.getColId().hashCode());
		result = 37
				* result
				+ (getFsrNumVal1() == null ? 0 : this.getFsrNumVal1()
						.hashCode());
		result = 37
				* result
				+ (getFsrNumVal2() == null ? 0 : this.getFsrNumVal2()
						.hashCode());
		result = 37
				* result
				+ (getFsrNumVal3() == null ? 0 : this.getFsrNumVal3()
						.hashCode());
		result = 37
				* result
				+ (getFsrTxtValue() == null ? 0 : this.getFsrTxtValue()
						.hashCode());
		result = 37
				* result
				+ (getFsrDateValue() == null ? 0 : this.getFsrDateValue()
						.hashCode());
		result = 37
				* result
				+ (getFsrDecValue() == null ? 0 : this.getFsrDecValue()
						.hashCode());
		result = 37
				* result
				+ (getFsrOperator() == null ? 0 : this.getFsrOperator()
						.hashCode());
		result = 37 * result
				+ (getFsrOrder() == null ? 0 : this.getFsrOrder().hashCode());
		return result;
	}

}
