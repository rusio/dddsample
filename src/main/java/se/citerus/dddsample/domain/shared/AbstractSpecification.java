package se.citerus.dddsample.domain.shared;

/**
 * Abstract base implementation of composite {@link Specification} with default
 * implementations for {@code and}, {@code or} and {@code not}.
 */
public abstract class AbstractSpecification<T> implements Specification<T> {

  /**
   * {@inheritDoc}
   */
  public abstract boolean isSatisfiedBy(T t);

}
