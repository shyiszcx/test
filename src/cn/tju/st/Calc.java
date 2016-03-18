package cn.tju.st;
import org.junit.Test;
import static org.junit.Assert.*;

public class Calc {
	public String triangle (int a, int b,int c)
	{
	    int d=a-b;
	    int e=b-c;
	    int f=c-a;
	    String str = null;
		if(d*e*f==0)
			{
			str="等腰";
		   if((a==b)&&(b==c))
			str="等边";
		    }
		else
			str="其他";
		return str;
		
	}
}
