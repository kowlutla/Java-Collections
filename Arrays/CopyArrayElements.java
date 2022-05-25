
public class CopyArrayElements {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,7,4};
		int[] array2=array.clone();
		System.out.println("Array1: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\nCopied array: ");
		for(int i=0;i<array2.length;i++)
		{
			System.out.print(array2[i]+" ");
		}
		String s="kowlutla is good student";
		byte[]bytearray=s.getBytes();
		System.out.println("\nBytes of String: ");
		for(int i=0;i<bytearray.length;i++)
		{
			System.out.print(bytearray[i]+" ");
		}
	}

}
