#include <iostream>

using namespace std;

class myClass
{
  public:
	myClass(int a)
	{
		cout<<a;
	}
	
	~myClass()
	{
		cout<<"Destroy/n";
	}
};

int main(int argc, char **argv)
{
   cout<<"Hello world!\n";
   myClass* myCls = new myClass(3);
   myClass myClss(4);
   delete myCls;
   return 0;
}

