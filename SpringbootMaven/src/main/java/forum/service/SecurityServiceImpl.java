/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service("security_jpa")
public class SecurityServiceImpl implements SecurityService{
    
    @Autowired
    @Qualifier("log_jpa")
    private LoggerService loggerService;
    
    @Override
    public void chech(){
        loggerService.log("SecurityServiceImpl chequéé");
    }

    @Override
    public void log(String message) {
    }
    
}
