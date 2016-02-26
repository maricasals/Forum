/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.test;

import forum.service.LoggerServiceConsoleImpl;
import forum.service.SecurityService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import forum.spring.SpringConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class SpringTest {
    
//    @Autowired
//    @Qualifier("a")
//    private Object o;
    
    @Autowired
    private LoggerServiceConsoleImpl logger1;
    
    @Autowired
    private LoggerServiceConsoleImpl logger2;
    
    @PersistenceContext
    private EntityManager em;
    
    @Autowired
    @Qualifier("security_mock")
    private SecurityService securityServiceConsole;
    
    @Autowired
    @Qualifier("security_jpa")
    private SecurityService securityServiceImpl;
    
    @Test
    public void doNadaOK(){
        
        securityServiceImpl.chech();
        
    }
    
    @Test
    public void doNadajpaOK(){
        
        securityServiceConsole.chech();
    }
    
//    @Test
    public void testEquals(){
        Assert.assertTrue(logger1==logger2);
    }
}
