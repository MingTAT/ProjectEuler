package easy;

public class multiof5_3 {
	public static void main(String[] args){
		int test = 1000;
		System.out.println(multi(1000));
	}
	
	public static int multi(int n){
		int count = 0;
		for(int i = 0; i < 1000; i++){
			if((i % 3) == 0 && (i % 5) == 0){
				count =  (count + i);
			}else if(i % 3 == 0) count = count + i;
			else if(i % 5 == 0) count = count + i;
			
		}
		return count;
		
	}
}
