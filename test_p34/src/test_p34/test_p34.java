package test_p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Ҫ���^�ڎ״ε�̎���أ�");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=10;i++)
		{
			if(num == i)
			continue;
			
			System.out.println("��"+i+"�ε�̎��");
		}
	}

}
