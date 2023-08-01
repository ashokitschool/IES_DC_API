package in.ashokit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.IncomeEntity;

public interface IncomeRepo extends JpaRepository<IncomeEntity, Integer>{

}
