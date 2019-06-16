package persistence;

import java.util.List;

import business.Product;



public interface ProductDAO {
	 void put(Product p) throws  DAOException;
	 void patch(Product p) throws  DAOException;
	 Product get(String desc) throws DAOException;
	 List<Product> getAll() throws DAOException;
}
