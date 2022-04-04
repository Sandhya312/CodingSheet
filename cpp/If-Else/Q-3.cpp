// Write a Program to Find Largest Number Among Three Numbers entered by users

#include<iostream>

using namespace std ;

int main(){
	int a ,b ,c;
	cout<<"Enter the value of a ,b,c ";
	cin>>a>>b>>c;
	
	if(a>b && a>c){
		cout<<a;
	}else if(b>a && b>c){
			cout<<b<<" is the largest number";
	}else if(c>a && c>b){
			cout<<c<<" is the largest number";
	}else {
		cout<<"All numbers are equal";
	}
	
	
	return 0;
}