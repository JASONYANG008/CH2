package test_p19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p19 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請問你是男生嗎？");
		System.out.println("請輸入Y或N");
			
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		char sex = str.charAt(0);
			
	if(sex == 'Y' || sex == 'y')
		{System.out.println("你是男生啊！");
		}
	else if(sex == 'N' || sex == 'n')
		{System.out.println("你是女生啊！");
		}
	else
	  {
		System.out.println("請輸入Y或者N哦！");
	  }
    }
}
