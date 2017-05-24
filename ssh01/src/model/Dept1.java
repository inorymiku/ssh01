package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept1 entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("rawtypes")
public class Dept1 implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer deptno;
	private String dname;
	private String loc;
	private Set emp1s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dept1() {
	}

	/** minimal constructor */
	public Dept1(Integer deptno) {
		this.deptno = deptno;
	}

	/** full constructor */
	public Dept1(Integer deptno, String dname, String loc, Set emp1s) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.emp1s = emp1s;
	}

	// Property accessors

	public Integer getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set getEmp1s() {
		return this.emp1s;
	}

	public void setEmp1s(Set emp1s) {
		this.emp1s = emp1s;
	}

}