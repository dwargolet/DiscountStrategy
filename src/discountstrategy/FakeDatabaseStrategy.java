/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategy;

/**
 *
 * @author dworgolet
 */
public interface FakeDatabaseStrategy {
     public abstract CustomerInformation findCustomer(String customerID);
     public abstract ProductInformation findProduct(String productID);
     public abstract void addCustomerToDataBase(CustomerInformation Customer);
     public abstract void addProductToDataBase(ProductInformation product);
}
