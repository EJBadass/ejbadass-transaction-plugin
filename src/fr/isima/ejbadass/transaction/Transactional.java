package fr.isima.ejbadass.transaction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import fr.isima.ejbadass.annotation.Behaviour;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Behaviour(interceptor=TransactionInterceptor.class)
public @interface Transactional {
	TransactionType value();
}
