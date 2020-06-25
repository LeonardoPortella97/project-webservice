package br.mackenzie.db;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import br.mackenzie.api.Work;

public class WorkMapper implements RowMapper<Work> {

	@Override
	public Work map(ResultSet rs, StatementContext ctx) throws SQLException {
		return new Work(
				rs.getInt("id"),
				rs.getString("name"),
				rs.getDate("date"),
				rs.getDouble("workedTime")
	);
}

}
