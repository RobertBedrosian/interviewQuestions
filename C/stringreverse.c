/** This program reverses a C-style String**/



#include <stdio.h>
#include <stdlib.h>
void reversestring(char *str);
int main ()
{
	char a[] = "hello my name is robert";
	printf("This program will reverse the words: hello my name is robert\n");

	reversestring(a);
	printf("%s\n", a);
	
}
void reversestring(char *str)
{
	char *end = str;
	char tmp;
	if (str)
	{
		while (*end)
		{
			++end;

		}
		--end;
		while (str < end)
		{
			tmp = *str;
			*str++=*end;
			*end--= tmp;
		}
	}
}
