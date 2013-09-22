package test.me.tspace.finance;

import java.util.List;
import java.util.Map;

import me.tspace.finance.category.service.ICategoryService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class CategoryTest extends AbstractTestCase {
	
	@Autowired
	ICategoryService categoryService;

	@Test
	public void testSys(){
		System.out.println("aaa");
	}
	
	@Test
	public void testGetIncome(){
		 @SuppressWarnings("rawtypes")
		List<Map>categorys = categoryService.getIncomeCategory();
		 for(Map maps :categorys){
			 for(Object o:maps.keySet()){
				 System.out.println(o+":"+maps.get(o));
			 }
		 }
	}
	
}
