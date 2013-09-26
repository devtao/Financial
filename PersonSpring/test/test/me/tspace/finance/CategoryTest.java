package test.me.tspace.finance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.tspace.finance.category.dao.MoneyCategoryMapper;
import me.tspace.finance.category.pojo.MoneyCategory;
import me.tspace.finance.category.service.ICategoryService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class CategoryTest extends AbstractTestCase {
	@Autowired
	ICategoryService categoryService;
	@Autowired
	MoneyCategoryMapper categoryMapper;

	
	
	@Test
	public void testSys(){
		System.out.println("aaa");
	}
	
	@Test
	public void testGetIncome(){
		List<HashMap> categorys = categoryMapper.selectCategoryByType("收入");
		 @SuppressWarnings("rawtypes")
		List<HashMap>categoryss = categoryService.getIncomeCategory();
		 for(@SuppressWarnings("rawtypes") HashMap maps :categorys){
				 System.out.println("#################### ID"+maps.get("id")+"  name:  "+maps.get("name"));
		 }
	}
	
}
