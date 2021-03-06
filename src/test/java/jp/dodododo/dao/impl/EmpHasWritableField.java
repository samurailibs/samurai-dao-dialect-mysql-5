package jp.dodododo.dao.impl;

import static jp.dodododo.dao.commons.Bool.*;
import jp.dodododo.dao.annotation.Column;
import jp.dodododo.dao.annotation.Property;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class EmpHasWritableField {
	private String EMPNO;

	@Property(writable = TRUE)
	private String ENAME;

	private String JOB;

	private String MGR;

	private String HIREDATE;

	private String SAL;

	private String COMM;

	private String DEPTNO;

	@Property(writable = TRUE)
	private String TSTAMP;

	public EmpHasWritableField(@Column("EMPNO") String EMPNO) {
		this.EMPNO = EMPNO;
	}

	public EmpHasWritableField(int EMPNO, String ENAME) {
	}

	public String getCOMM() {
		return COMM;
	}

	public String getDEPTNO() {
		return DEPTNO;
	}

	public String getEMPNO() {
		return EMPNO;
	}

	public String getENAME() {
		return ENAME;
	}

	public String getHIREDATE() {
		return HIREDATE;
	}

	public String getJOB() {
		return JOB;
	}

	public String getMGR() {
		return MGR;
	}

	public String getSAL() {
		return SAL;
	}

	public String getTSTAMP() {
		return TSTAMP;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
