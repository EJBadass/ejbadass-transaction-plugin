package fr.isima.ejbadass.transaction;

import fr.isima.ejbadass.plugable.IInterceptor;

public interface ITransactionManager {
	public Transaction getTransaction(IInterceptor inter, boolean isRequired);
	public void close();	
}