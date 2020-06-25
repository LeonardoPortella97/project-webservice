package br.mackenzie.db;

import java.util.List;

import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import br.mackenzie.api.Work;

@RegisterRowMapper(WorkMapper.class)
public interface WorkDao {

	@SqlQuery("select * from work")
	public List<Work> findAllWorks();

	@SqlQuery("select * from work")
	List<Work> getAllWorks();

	@SqlUpdate("insert into work (name, date, timeWorked)values (:name, :date, :timeworked")
	public void insertWork(@BindBean Work work);

	@SqlQuery("select * from product where id = :id")
	public Work findById(int id);
}
