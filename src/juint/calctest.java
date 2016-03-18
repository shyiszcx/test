package juint;
import org.junit.Test;
import cn.tju.st.Calc;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class calctest {
	private String type;
	private int a;
	private int b;
	private int c;
	
	public calctest(String type, int a, int b, int c){
		this.type = type;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Parameters
	public static Collection prepareData(){
		Object[][] object = {
				{"等边",1,1,1},
				{"等腰",2,2,3},{"其他",2,3,4},{"等腰",2,3,3}};
		return Arrays.asList(object);
	}
	@Test
	public void TestTypeOfTriangle() 
	{
		Calc calc = new Calc (); 
		assertEquals (type, calc.triangle(a,b,c)); 

	}

}
