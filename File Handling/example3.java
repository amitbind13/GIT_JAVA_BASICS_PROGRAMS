import java.io.File;
class getname
{
	public static void main(String args[])
	{
		File f1=new File("IMG_20190614_193640.jpg");
		File f2=new File("download.jpeg");
		System.out.println("Can read file :"+f1.getName());
		System.out.println("Can read file :"+f2.getName());
	}
}
