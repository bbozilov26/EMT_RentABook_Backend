package mk.ukim.finki.rentabook.repository;

import mk.ukim.finki.rentabook.models.metamodels.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
