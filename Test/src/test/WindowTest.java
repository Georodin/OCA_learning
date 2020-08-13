package test;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;


// https://github.com/twall/jna#readme
//    you need 2 jars : jna-3.5.1.jar and platform-3.5.1.jar

public class WindowTest {

	/*public static void main(String[] args) {
		HWND hwnd = User32.INSTANCE.FindWindow(null, ""); // window title
		if (hwnd == null) {
			System.out.println("Excel is not running");
		}
		else{
			User32.INSTANCE.ShowWindow(hwnd, 9 );        // SW_RESTORE
			User32.INSTANCE.SetForegroundWindow(hwnd);   // bring to front
		}
	}*/
	   public interface User32 extends StdCallLibrary {
		      User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class,
		               W32APIOptions.DEFAULT_OPTIONS);

		      HWND FindWindow(String lpClassName, String lpWindowName);

		      int GetWindowRect(HWND handle, int[] rect);
		   }

		   public static int[] getRect(String windowName) throws WindowNotFoundException,
		            GetWindowRectException {
		      HWND hwnd = User32.INSTANCE.FindWindow(null, windowName);
		      if (hwnd == null) {
		         throw new WindowNotFoundException("", windowName);
		      }

		      int[] rect = {0, 0, 0, 0};
		      int result = User32.INSTANCE.GetWindowRect(hwnd, rect);
		      if (result == 0) {
		         throw new GetWindowRectException(windowName);
		      }
		      return rect;
		   }

		   @SuppressWarnings("serial")
		   public static class WindowNotFoundException extends Exception {
		      public WindowNotFoundException(String className, String windowName) {
		         super(String.format("Window null for className: %s; windowName: %s", 
		                  className, windowName));
		      }
		   }

		   @SuppressWarnings("serial")
		   public static class GetWindowRectException extends Exception {
		      public GetWindowRectException(String windowName) {
		         super("Window Rect not found for " + windowName);
		      }
		   }

		   public static void main(String[] args) {
		      String windowName = "CC Launcher 3.0";
		      int[] rect;
		      try {
		         rect = GetWindowRect.getRect(windowName);
		         System.out.printf("The corner locations for the window \"%s\" are %s", 
		                  windowName, Arrays.toString(rect));
		      } catch (GetWindowRect.WindowNotFoundException e) {
		         e.printStackTrace();
		      } catch (GetWindowRect.GetWindowRectException e) {
		         e.printStackTrace();
		      }      
		   }
		}
}

