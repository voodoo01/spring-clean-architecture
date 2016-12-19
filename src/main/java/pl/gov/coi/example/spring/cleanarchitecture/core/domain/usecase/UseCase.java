package pl.gov.coi.example.spring.cleanarchitecture.core.domain.usecase;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 16.12.16
 */
public interface UseCase<I extends Request, O extends Response> {

  void execute(I request, O response);

}
