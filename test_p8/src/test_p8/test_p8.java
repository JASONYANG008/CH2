package test_p8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p8
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("Ոݔ������");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
			System.out.println("ݔ�����1");
			System.out.println("�x�����1");
			
			System.out.println("�Y��̎��");
}
}