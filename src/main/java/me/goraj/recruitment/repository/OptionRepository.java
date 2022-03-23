package me.goraj.recruitment.repository;

import me.goraj.recruitment.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {

    @Query(value = "SELECT id, kolumna1, kolumna2, kolumna3, kolumna4 FROM tabela_testowa WHERE kolumna1 IN " +
            "(SELECT DISTINCT(kolumna1) FROM tabela_testowa GROUP BY kolumna1 HAVING COUNT(kolumna1) > 1)", nativeQuery = true)
    List<Option> findDistinctByColumnDistinct();

    @Query(value = "SELECT id, kolumna1, kolumna2, kolumna3, kolumna4 FROM tabela_testowa WHERE kolumna1 NOT IN " +
            "(SELECT DISTINCT(kolumna1) FROM tabela_testowa GROUP BY kolumna1 HAVING COUNT(kolumna1) > 1)", nativeQuery = true)
    List<Option> findDistinctByColumnNotDistinct();
}