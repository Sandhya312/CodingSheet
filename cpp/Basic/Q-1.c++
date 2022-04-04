//Write a program where the user is asked to enter two
//integers (divisor and dividend) and the quotient and the
//remainder of their division is computed.(Both divisor and
//dividend should be integers.)

#include<bits/stdc++.h>

using namespace std;

int main(){
   int divisor, dividend,quotient,remainder;
   cout<<"Enter the value of divisor:: ";
   cin>>divisor;
   cout<<"Enter the value of dividend:: ";
   cin>>dividend;
   quotient = dividend/divisor;
   remainder = dividend%divisor;
   cout<<"The value of quotient is::"<<quotient;
   cout<<endl<<"The value of remainder is::" <<remainder;

   
   
	return 0;
	
}