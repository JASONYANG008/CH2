package test_p32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p32 
{
	public static void main(String[] arges) throws IOException
	{
		System.out.println("Ո��Ҫ�ڵڎ״νY��ޒȦ�أ�(1~10)");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		int res = Integer.parseInt(br.readLine());
		
		for(int i= 1;i<= 10;i++ )
		{
			System.out.println("��"+i+"��̎�� ");
			if(i == res)
				break;
		}
		
	}
}
