#include<stdio.h>
void main()
{
 int n,bv,dv=0,base=1,rem;
  scanf("%d",&n);
  bv=n;
    while(n > 0)
    {
      rem = n % 10;
     dv = dv + rem * base;
     n = n / 10;
     base = base * 2;
    }
  printf("%d",dv);

}