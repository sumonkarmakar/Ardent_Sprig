package a;

import org.springframework.jdbc.core.JdbcTemplate;

class Table {

	JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void create() {
		jt.execute("create table test99(id number primary key,name varchar2(22))");

	}

}
