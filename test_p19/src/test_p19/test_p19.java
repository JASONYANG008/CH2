package test_p19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p19 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Ո�����������᣿");
		System.out.println("Ոݔ��Y��N");
			
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		char sex = str.charAt(0);
			
	if(sex == 'Y' || sex == 'y')
		{System.out.println("������������");
		}
	else if(sex == 'N' || sex == 'n')
		{System.out.println("����Ů������");
		}
	else
	  {
		System.out.println("Ոݔ��Y����NŶ��");
	  }
    }
}
