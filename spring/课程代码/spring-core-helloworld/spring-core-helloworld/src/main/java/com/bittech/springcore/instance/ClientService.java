package com.bittech.springcore.instance;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
public class ClientService {
    
    private static ClientService clientService = new ClientService();
    
    private ClientService() {
    }
    
    public static ClientService getInstance() {
        return clientService;
    }
}
