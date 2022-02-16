package day18;
class Member{
	String name;
	
	void setName(String n)
	{
		System.out.println("this = "+ this);
		name = n;
	}
}
public class classEx002 {
	public static void main(String[] args) {
		Member hgd = new Member();
		System.out.println("hgd = "+hgd);
		
		hgd.setName("ȫ�浿");
		
		System.out.println(hgd.name);
	}
}
