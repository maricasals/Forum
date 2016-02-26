/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service("log_jpa")
public class LoggerServiceJpaImpl implements LoggerService{
    
    @Override
    public void log(String msg){
        System.out.println("Logger_ImplA");
    }
}
