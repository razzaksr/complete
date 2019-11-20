package academy.erp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAcademy extends JpaRepository<Academy, Integer>
{
	@Query("from Academy where name = :name")
	public List<Academy> findAllByName(String name);
	@Query("from Academy where course = :course")
	public List<Academy> findAllByCourse(String course);
}
