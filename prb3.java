package Assess_Nov20;
import java.util.*;

class Funct extends Thread{
	List<Integer> l = new ArrayList<>(Arrays.asList(0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1));
	public void run() {
		Random rn=new Random();
		int x=rn.nextInt(l.size());
		int y=rn.nextInt(l.size());
		if(x==y)
			y=rn.nextInt(l.size());
		System.out.println("Two fishes meeting are at the positions : "+x+" "+y);
		if(l.get(x)==0 && l.get(y)==0) {
			l.remove(x);
			l.remove(y);
			System.out.println("Two MALE fishes met each other");
			System.out.println(l);
			System.out.println("Total Number of fish in pool: "+l.size());
			System.out.println();
		}
		else if(l.get(x)==1 && l.get(y)==1) {
			int num = new Random().nextBoolean()?x:y;
			l.remove(num);
			System.out.println("Two FEMALE fishes met each other");
			System.out.println(l);
			System.out.println("Total Number of fish in pool: "+l.size());
			System.out.println();
		}
		else if((l.get(x)==0 && l.get(y)==1) || (l.get(x)==1 && l.get(y)==0)) {
			int n1=rn.nextInt(2);
			int n2=rn.nextInt(2);
			l.add(n1);
			l.add(n2);
			System.out.println("MALE and FEMALE met each other");
			System.out.println(l);
			System.out.println("Total Number of fish in pool: "+l.size());
			System.out.println();
		}
		else if(l.size()==0) {
			System.out.println("No fish is left in the Pool");
			System.exit(0);
		}
	}	
  }
public class prb3{
	public static void main(String[] args) {
		Funct t1=new Funct();
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {}
		Funct t2=new Funct();
		t2.start();
		try {
			t2.join();
		}catch(Exception e) {}
		Funct t3=new Funct();
		t3.start();
		try {
			t3.join();
		}catch(Exception e) {}
		Funct t4=new Funct();
		t4.start();
		try {
			t4.join();
		}catch(Exception e) {}
		Funct t5=new Funct();
		t5.start();
		try {
			t5.join();
		}catch(Exception e) {}
	}
}

