/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.salaboy.api;

import java.util.HashMap;
import java.util.Map;
import org.example.ws_ht.api.wsdl.TaskOperations;

/**
 *
 * @author salaboy
 * This class will contain a Map with all the human task clients registered for an UI.
 * Allowing multi client configurations
 */
public class HumanTaskClientRegistry {
    private Map<String, HumanTaskActionClientWrapper> actionClients = new HashMap<String, HumanTaskActionClientWrapper>();
    private Map<String, TaskOperations> queryClients = new HashMap<String, TaskOperations>();
    private static HumanTaskClientRegistry registry;
    public static HumanTaskClientRegistry getInstance(){
        if(registry == null){
            registry = new HumanTaskClientRegistry();
        }
        return registry;
    }
    
    private HumanTaskClientRegistry() {
       
    }

    public void addActionClient(String name, HumanTaskActionClientWrapper client){
        this.actionClients.put(name, client);
    }
    
    public void addQueryClient(String name, TaskOperations client){
        this.queryClients.put(name, client);
    }
   
    public TaskOperations getQueryClient(String name){
        return this.queryClients.get(name);
    }

    public HumanTaskActionClientWrapper getActionClient(String name){
        return this.actionClients.get(name);
    }
    
    
    
}
