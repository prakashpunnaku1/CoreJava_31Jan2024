class Calculator{
	double pi=3.14;
	int add(int num1,int num2){
		return num1+num2;
	}
	int sub(int num1,int num2){
		return num1-num2;
	}
}

class AdvCalculator extends Calculator{
	int mult(int num1,int num2){
		return num1*num2;
	}
}

class SuperCalculator extends AdvCalculator{
	double power(int num1,int num2){
		int mul=mult(num1,num2);
		System.out.println(":power:mul:"+mul);
		
		int sum=add(num1,num2);
		System.out.println(":power:sum:"+sum);
		
		return Math.pow(num1, num2);
			
	}
}	

class InheritanceTest4{
	public static void main(String[] args){
		SuperCalculator obj=new SuperCalculator();
		double num=obj.power(7,4);
		System.out.println(":num:"+num);
				double piVal=obj.pi;
		System.out.println(":piVal:"+piVal);
	}
}