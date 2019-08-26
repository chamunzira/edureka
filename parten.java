
public class parten {
	
	    public static void main(String[] args) {
	    	practice obj = new practice();
	    	obj.part();
	    	
	    }
}

class practice{
	public void part() {
		String[] strArray = new String[]{"A", "V", "E", "B","M","A","K"};
		int length = strArray.length;
        for(int i = 0; i< length; i++) {
            for(int j = length-1 ; j >=  i; --j) {
                System.out.print(strArray[j]);
            }
                
           System.out.println();
        }
	}
}