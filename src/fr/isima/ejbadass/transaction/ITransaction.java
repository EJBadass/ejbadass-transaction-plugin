package fr.isima.ejbadass.transaction;

import fr.isima.ejbadass.plugable.IInterceptor;

public interface ITransaction {
	void begin();
	void commit();
	void rollback();
	void awake();
	void sleep();
	void setCaller(IInterceptor t);
	boolean isCaller(IInterceptor t);
}
