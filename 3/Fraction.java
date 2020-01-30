import java.io.*;
import java.util.*;

public class Fraction {
	
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int denom=Integer.parseInt(args[1]);

		int position=1;
		boolean flag=true;
		Map<Integer,Integer> arr=new HashMap<Integer,Integer>();
		Map<Integer,Integer> nums=new HashMap<Integer,Integer>();
		String str_output="";
		
		str_output+=num+"/"+denom+"="+(num/denom);
		num=num%denom;
		if(num==0) flag=false;
		else {
			str_output+=".";
		}
		while(flag) {
			num*=10;
			if(num%denom==0) {
				str_output+=(num/denom);
				flag=false;
			}
			else {
				if(arr.containsKey(num%denom)&&nums.get(arr.get(num%denom))==num/denom) {
					flag=false;
					int start=arr.get(num%denom);
					int len=str_output.length();
					str_output+="\n";
					for(int i=0;i<len-position+start;i++)
						str_output+=" ";
					for(int i=start;i<position;i++)
						str_output+="^";
				}
				else {
					str_output+=(num/denom);
					nums.put(position, num/denom);
					num=num%denom;
					arr.put(num,position);
					position+=1;
				}
			}
		}
		System.out.println(str_output);
	}
}
