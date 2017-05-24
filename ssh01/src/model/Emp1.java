package model;

import java.util.Date;

/**
 * Emp1 entity. @author MyEclipse Persistence Tools
 */

public class Emp1 implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer empno;
	private Dept1 dept1;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Double sal;
	private Double comm;

	// Constructors

	/** default constructor */
	public Emp1() {
	}

	/** minimal constructor */
	public Emp1(Integer empno) {
		this.empno = empno;
	}

	/** full constructor */
	public Emp1(Integer empno, Dept1 dept1, String ename, String job, Integer mgr, Date hiredate, Double sal, Double comm) {
		this.empno = empno;
		this.dept1 = dept1;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
	}

	// Property accessors

	public Integer getEmpno() {
		return this.empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public Dept1 getDept1() {
		return this.dept1;
	}

	public void setDept1(Dept1 dept1) {
		this.dept1 = dept1;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return this.mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSal() {
		return this.sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return this.comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

}