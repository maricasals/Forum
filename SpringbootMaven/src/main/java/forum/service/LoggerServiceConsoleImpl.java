/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import java.util.Date;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service("log_console")
@Scope("prototype")
public class LoggerServiceConsoleImpl implements LoggerService{
    
    @Override
    public void log(String msg){
        System.out.println("[Logger_Console" + new Date()+ " ]+ " + msg);
    }
}
