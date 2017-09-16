package StringandStringBuffer;

class ImmutableClass {
	int i;
	public ImmutableClass(int i)
	{
		this.i=i;
		
	}
	public ImmutableClass modify(int j)
	{
		
		if(this.i==j)
		{
			return this;
		}
		else 
		{
			
			return(new ImmutableClass(j));
		}
		
	}
	public static void main(String[] args) {
		ImmutableClass t1=new ImmutableClass(10);
		ImmutableClass t2=t1.modify(100);
		ImmutableClass t3=t1.modify(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());

		
		
		
		
	}

}
