package exercises;

public class Box 
{
	int height;
	int width;
	int depth;
	
	public Box(int height, int width, int depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public void setHeight (int height)
	{
		this.height = height;
	}
	public void setWidth (int width)
	{
		this.width = width;
	}
	public void setDepth (int depth)
	{
		this.depth = depth;
	}
	public int getHeight()
	{
		return this.height;
	}
	public int getWidth()
	{
		return this.width;
	}
	public int getDepth()
	{
		return this.depth;
	}
	
	public String toString()
	{
		return "Height: " + getHeight() + " , Width: " + getWidth() + ", Depth: " + getDepth();
	}
	
	public Boolean fit(Box box)
	{
		String fits = String.valueOf(getHeight() < box.height && getWidth() < box.width && getDepth() < box.depth);
		System.out.println(fits);
		return (getHeight() < box.height && getWidth() < box.width && getDepth() < box.depth);
				
	}
}
