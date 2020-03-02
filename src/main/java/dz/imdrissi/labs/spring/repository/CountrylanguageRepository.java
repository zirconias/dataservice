package dz.imdrissi.labs.spring.repository;

import dz.imdrissi.labs.spring.model.CountryLanguage;
import dz.imdrissi.labs.spring.model.CountryLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountrylanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId>, JpaSpecificationExecutor<CountryLanguage> {

}