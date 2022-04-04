//Write a Program to Check Whether Number is Even or Odd
#include<bits/stdc++.h>
using namespace std;

int main(){
	int num;
	cout<<"Enter the value of num\n";
	cin>>num;
	if(num == 1 || num == 0){
		return 0;
	}
	else if(num%2 == 0){
		cout<<"Even";
	}else{
		cout<<"Odd";
	}
	
	return 0;
}



