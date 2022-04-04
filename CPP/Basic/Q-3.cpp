//Write a Program to Swap Two Numbers
#include<iostream>

using namespace std;

int main(){
	int a,b;
	cout<<"Enter the value of a and b";
	cin>>a>>b;
	cout<<"Before swapping, the value of a and b are ::"<<endl;
	cout<<"a="<<a<<endl<<"b="<<b<<endl;
	cout<<"After swapping, the value of a and b are :: "<<endl;
	a=a+b;
	b=a-b;// b=(a+b)-b =a
	a=a-b;// a= (a+b) -(a)=b
	cout<<"a="<<a<<endl<<"b="<<b;
	
	return 0;
}