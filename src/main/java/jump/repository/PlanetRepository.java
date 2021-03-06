package jump.repository;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.reactive.RxJavaCrudRepository;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import jump.domain.Planet;

@JdbcRepository(dialect = Dialect.H2)
public interface PlanetRepository extends RxJavaCrudRepository<Planet, Long> {

  Maybe<Planet> findByName(String name);

  Single<Planet> save(Planet planet);

  Flowable<Planet> findAll();
}
