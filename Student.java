import java.util.HashSet;
import java.util.Set;

public class Student {

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.hashCode() == obj.hashCode()) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		sb.append(name);
		char[] studInfo = sb.toString().toCharArray();
		long hashCode = 0;
		for (int i = 0; i < studInfo.length; i++) {
			hashCode = hashCode * 31 + studInfo[i];
		}
		return (int) (hashCode & 0x7FFFFFFF);
	}

	private String name;
	private int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("a", 1);
		Student stu2 = new Student("a", 1);
		// Student stu3=new Student("b",2);
		Set<Student> set = new HashSet<Student>();
		set.add(stu1);
		set.add(stu2);
		// set.add(stu3);
		System.out.println(stu1.hashCode());
		System.out.println(set.size());
		for (Student stu : set) {
			System.out.println(stu.toString());
		}

	}

	public Student(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
