public class HelloJNI {  // Save as HelloJNI.java
   static {
	try {
      		System.loadLibrary("hello"); // Load native library hello.dll (Windows) or libhello.so (Unixes)
	} catch (java.lang.UnsatisfiedLinkError e) {
		System.out.println("UnsatisfiedLinkError: ");
		System.out.println(e.getMessage());
	}                                 

   }
 
   // Declare an instance native method sayHello() which receives no parameter and returns void
   private native void sayHello();
 
   // Test Driver
   public static void main(String[] args) throws InterruptedException {
      while(true) {
		try {
      			new HelloJNI().sayHello();  // Create an instance and invoke the native method
		} catch (java.lang.UnsatisfiedLinkError e) {
			System.out.println("failed to say hello");
			System.out.println(e.getMessage());
		}
		Thread.sleep(1000);
 	}
   }
}
