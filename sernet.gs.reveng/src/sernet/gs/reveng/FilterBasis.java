package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * FilterBasis generated by hbm2java
 */
public class FilterBasis implements java.io.Serializable {

	private FilterBasisId id;
	private FilterName filterName;
	private FilterSuchenFelder filterSuchenFelder;
	private FilterSuchenSeite1 filterSuchenSeite1;
	private Integer fsrNumVal1;
	private Integer fsrNumVal2;
	private Integer fsrNumVal3;
	private String fsrTxtValue;

	public FilterBasis() {
	}

	public FilterBasis(FilterBasisId id, FilterName filterName,
			FilterSuchenFelder filterSuchenFelder,
			FilterSuchenSeite1 filterSuchenSeite1) {
		this.id = id;
		this.filterName = filterName;
		this.filterSuchenFelder = filterSuchenFelder;
		this.filterSuchenSeite1 = filterSuchenSeite1;
	}

	public FilterBasis(FilterBasisId id, FilterName filterName,
			FilterSuchenFelder filterSuchenFelder,
			FilterSuchenSeite1 filterSuchenSeite1, Integer fsrNumVal1,
			Integer fsrNumVal2, Integer fsrNumVal3, String fsrTxtValue) {
		this.id = id;
		this.filterName = filterName;
		this.filterSuchenFelder = filterSuchenFelder;
		this.filterSuchenSeite1 = filterSuchenSeite1;
		this.fsrNumVal1 = fsrNumVal1;
		this.fsrNumVal2 = fsrNumVal2;
		this.fsrNumVal3 = fsrNumVal3;
		this.fsrTxtValue = fsrTxtValue;
	}

	public FilterBasisId getId() {
		return this.id;
	}

	public void setId(FilterBasisId id) {
		this.id = id;
	}

	public FilterName getFilterName() {
		return this.filterName;
	}

	public void setFilterName(FilterName filterName) {
		this.filterName = filterName;
	}

	public FilterSuchenFelder getFilterSuchenFelder() {
		return this.filterSuchenFelder;
	}

	public void setFilterSuchenFelder(FilterSuchenFelder filterSuchenFelder) {
		this.filterSuchenFelder = filterSuchenFelder;
	}

	public FilterSuchenSeite1 getFilterSuchenSeite1() {
		return this.filterSuchenSeite1;
	}

	public void setFilterSuchenSeite1(FilterSuchenSeite1 filterSuchenSeite1) {
		this.filterSuchenSeite1 = filterSuchenSeite1;
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

}
