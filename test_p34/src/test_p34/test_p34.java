package test_p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("要跳過第幾次的處理呢？");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=10;i++)
		{
			if(num == i)
			continue;
			
			System.out.println("第"+i+"次的處理");
		}
	}

}
