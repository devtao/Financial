package test.me.tspace.finance;

import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


@ContextConfiguration(locations = "classpath:config/spring/spring-common.xml")   
@RunWith(SpringJUnit4ClassRunner.class)   
@Transactional  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true) 
public class AbstractTestCase extends AbstractTransactionalJUnit4SpringContextTests {
	
	@BeforeClass
    public  static void beforeClass(){
		String dir = System.getProperty("user.dir");
		String uri =dir+"/WebContent/WEB-INF/classes/config/others/log4j.conf"; 
		PropertyConfigurator.configure(uri); 
    }
	
}
