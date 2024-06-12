package stringbuilder_and_stringbuffer;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("java");
		for (int i = 0; i <10000; i++) {
			sb.append("program");
		}
		System.out.println("time taken by StringBuffer : "+(System.currentTimeMillis()-time)+" ms.");
		
		time=System.currentTimeMillis();
		StringBuilder sbr=new StringBuilder("java");
		for (int i = 0; i <10000; i++) {
			sbr.append("program");
		}
		System.out.println("time taken by StringBuilder : "+(System.currentTimeMillis()-time)+" ms.");
	}

}
