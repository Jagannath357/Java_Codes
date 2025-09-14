class Student{
	public static void main(String s[]){
		if(s.length != 9){
			System.out.println("Error : You should provide sic, name, branch and marks of six different Subjects :");
		}
		else{
			String sic = s[0];
			String name = s[1];
			String branch = s[2];
			
			float a = Float.parseFloat(s[3]);
			float b = Float.parseFloat(s[4]);
			float c = Float.parseFloat(s[5]);
			float d = Float.parseFloat(s[6]);
			float e = Float.parseFloat(s[7]);
			float f = Float.parseFloat(s[8]);
			
			float avg = (a+b+c+d+e+f)/4;
			System.out.println("\nStudent details :");
			System.out.println("SIC : "+sic);
			System.out.println("Name : "+name);
			System.out.println("Branch : "+branch);
			System.out.println("Average : "+avg+"\n");
		}
	}
}