package persistence;

import java.util.List;

import business.Client;


public interface ClientDAO {

	 void put(Client c) throws  DAOException;
	 void patch(Client c) throws  DAOException;
	 Client get(String cpf) throws DAOException;
	 List<Client> getAll() throws DAOException;
}
