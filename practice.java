

class A{
	int a=100,b=200;
	void m1(){
		System.out.println("Hi"+(a+b));
}
void m2(){}
}
		


class B extends A {
int a=1000;
int c=300;
int d=400;
void m3(int a){
	System.out.println("hi "+(a+b));
	System.out.println("hi this"+(this.a+b));
	System.out.println("hi super"+(super.a+b));
}
void m4(){}

}
class Demo{
	public static void main(String[] args) {
A a=new A();
a.m1();
a.m2();
B b=new B();
b.m1();
b.m2();
b.m3(10);
b.m4();
  }
}