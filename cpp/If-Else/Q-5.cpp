//Write a Program which accepts coefficients of a quadratic equation from the user and displays the roots (both real and complex 
//roots depending upon the discriminant).
#include<bits/stdc++.h>
#include<cmath>

using namespace std;

int main(){
     float a,b,c,x1,x2,RealPart,ImgPart,D;
     cout<<"Enter the value of a,b & c:: "<<endl;
     cin>>a>>b>>c;
     D=b*b - (4*a*c);
     cout<<"The value of discriminant is::"<<D<<endl;
     if (D>0){
     	cout<<"The roots are ::"<<endl;
     	x1 = (-b + sqrt(D))/(2*a);
     	x2 = (-b - sqrt(D))/(2*a);
     	cout<<"The roots are :: "<<x1<<" and "<<x2;

	 }else if(D<0){
	    RealPart =  (-b)/(2*a);
	    ImgPart = (sqrt(-D))/(2*a);
	    cout<<"The roots are :: "<<endl<<"x1 = "<<RealPart<<" + "<< ImgPart<<"i "<<endl
		                               <<"x2 = "<<RealPart<<" - "<< ImgPart<<"i ";	 	
	 }else if(D==0){
	 	x1 = (-b)/(2*a);
	 	cout<<"The root is :: "<<x1<<endl;
	 	
	 }
    
      
      
	return 0;
	
}