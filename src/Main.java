import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final String CLASS_TO_LOAD = "org.ph.javaee.training5.ClassB";

    public static void main(String[] args){
        int usrIn = chooseException();
        runException(usrIn);
    }

    public static int chooseException(){
        Scanner scan = new Scanner(System.in);

        // choose what exception to see
        boolean valid = true;
        int usrIn = 0;
        do {
            valid = true;
            System.out.println("Enter exception number (0 for list of exceptions): ");
            try {
                usrIn = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not valid input.");
                valid = false;
            } finally {
                scan.nextLine();
            }
        } while (!valid);
        return usrIn;
    }

    public static void runException(int usrIn){
        if(usrIn == 0) {
            // print the options and their numbers
            System.out.println("1) ArithmeticException");
            System.out.println("2) ArithmeticException (fixed)");
            System.out.println("3) ArrayIndexOutOfBoundsException");
            System.out.println("4) ArrayIndexOutOfBoundsException (fixed)");
            System.out.println("5) ClassNotFoundException");
            System.out.println("6) ClassNotFoundException (fixed)");
            System.out.println("7) FileNotFoundException");
            System.out.println("8) FileNotFoundException (fixed)");
            System.out.println("9) IOException");
            System.out.println("10) InterruptedException");
            System.out.println("11) NoSuchFieldException");
            System.out.println("12) NoSuchMethodException");
            System.out.println("13) NullPointerException");
            System.out.println("14) NullPointerException (fixed)");
            System.out.println("15) NumberFormatException");
            System.out.println("16) NumberFormatException (fixed)");
            System.out.println("17) RuntimeException");
            System.out.println("18) StringIndexOutOfBoundsException");
            System.out.println("19) StringIndexOutOfBoundsException (fixed)");

        }else if(usrIn == 1){
            System.out.println("\nYou chose: 1) ArithmeticException");
            System.out.println("Outputs: ");
            int x = 9 / 0; // cannot divide by zero

        }else if(usrIn == 2){
            System.out.println("\nYou chose: 2) ArithmeticException (fixed)");
            System.out.println("Outputs: ");
            try {
                int c = 9 / 0;  // cannot divide by zero
            }
            catch(ArithmeticException e) {
                System.out.println (e);
            }

        }else if(usrIn == 3){
            System.out.println("\nYou chose: 3) ArrayIndexOutOfBoundsException");
            System.out.println("Outputs: ");
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of size 5

        }else if(usrIn == 4){
            System.out.println("\nYou chose: 4) ArrayIndexOutOfBoundsException (fixed)");
            System.out.println("Outputs: ");
            try{
                int a[] = new int[5];
                a[6] = 9; // accessing 7th element in an array of size 5
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println (e);
            }

        }else if(usrIn == 5){
            System.out.println("\nYou chose: 5) ClassNotFoundException");
            System.out.println("Something like:\n\nClass<?> newClass = Class.forName(CLASS_TO_LOAD);\n\nwill cause an error without a catch");
            System.out.println("because it is a checked exception.");

        }else if(usrIn == 6){
            System.out.println("\nYou chose: 6) ClassNotFoundException (fixed)");
            System.out.println("Outputs: ");
            try {
                Class<?> newClass = Class.forName(CLASS_TO_LOAD);
                System.out.println("Class " + newClass + " found successfully!");
            } catch (ClassNotFoundException e){
                System.out.println(e);
            }

        }else if(usrIn == 7){
            System.out.println("\nYou chose: 7) FileNotFoundException");
            System.out.println("This is a checked exception so it will not run unless you catch it.");
            System.out.println("An example of this would be: ");
            System.out.println("Scanner inFile = null;\ninFile = new Scanner(new File(\"dne.txt\"));");

        }else if(usrIn == 8){
            System.out.println("\nYou chose: 8) FileNotFoundException (fixed)");
            Scanner inFile = null;
            try {
                inFile = new Scanner(new File("dne.txt"));
            } catch (FileNotFoundException e){
                System.out.println("The file was not found");
            }

        }else if(usrIn == 9){
            System.out.println("\nYou chose: 9) IOException");
            System.out.println("IOException is a common exception that is used whenever there is an");
            System.out.println("exception in the input or output (IO), includes many other exceptions:");
            System.out.println("ChangedCharSetException, CharacterCodingException, CharConversionException, \nClosedChannelException, EOFException, FileLockInterruptionException, \nFileNotFoundException, FilerException, FileSystemException, \nHttpRetryException, IIOException, InterruptedByTimeoutException, \nInterruptedIOException, InvalidPropertiesFormatException, JMXProviderException, \nJMXServerErrorException, MalformedURLException, ObjectStreamException, \nProtocolException, RemoteException, SaslException, SocketException, \nSSLException, SyncFailedException, UnknownHostException, UnknownServiceException, \nUnsupportedDataTypeException, UnsupportedEncodingException, UserPrincipalNotFoundException, \nUTFDataFormatException, ZipException");

        }else if(usrIn == 10){
            System.out.println("\nyou chose: 10) InterruptedException");
            System.out.println("This would be an infinite loop that you somehow enabled or forgot to fix.");
            System.out.println("There are many ways to fix this, including catching and throwing the exception. \nMore detailed information at https://dzone.com/articles/how-to-handle-the-interruptedexception.");

        }else if(usrIn == 11){
            System.out.println("\nYou chose: 11) NoSuchFieldException");
            System.out.println("This exception is thrown when you try to access a field \nin a method and nothing is provided/ found. ");

        }else if(usrIn == 12){
            System.out.println("\nYou chose: 12) NoSuchMethodException");
            System.out.println("This is thrown when you attempt to call a method that does not exist or cannot be found. \nThis is a checked exception and the code will not run without a catch or a direct fix.");

        }else if(usrIn == 13){
            System.out.println("\nYou chose: 13) NullPointerException");
            System.out.println("This exception is raised when referring to the members of a null object.");
            System.out.println("Outputs: ");
            String a = null; //null value
            System.out.println(a.charAt(0));

        }else if(usrIn == 14){
            System.out.println("\nYou chose: 14) NullPointerException (fixed)");
            System.out.println("This exception is raised when referring to the members of a null object.");
            System.out.println("Outputs: ");
            try {
                String a = null; //null value
                System.out.println(a.charAt(0));
            } catch(NullPointerException e) {
                System.out.println("NullPointerException..");
            }

        }else if(usrIn == 15){
            System.out.println("\nYou chose: 15) NumberFormatException");
            System.out.println("This exception is raised when a method could not convert a string into a numeric format.");
            System.out.println("Outputs: ");
            int num = Integer.parseInt("hello");
            System.out.println(num);

        }else if(usrIn == 16){
            System.out.println("\nYou chose: 16) NumberFormatException (fixed)");
            try {
                int num = Integer.parseInt ("hello");
                System.out.println(num);
            } catch(NumberFormatException e) {
                System.out.println(e);
            }

        }else if(usrIn == 17){
            System.out.println("\nYou chose: 17) RuntimeException");
            System.out.println("This represents any exception which occurs during runtime. These include: \n");
            System.out.println("AnnotationTypeMismatchException, ArithmeticException, ArrayStoreException, \nBufferOverflowException, BufferUnderflowException, CannotRedoException, \nCannotUndoException, ClassCastException, CMMException, \nConcurrentModificationException, DataBindingException, DOMException, \nEmptyStackException, EnumConstantNotPresentException, EventException, \nFileSystemAlreadyExistsException, FileSystemNotFoundException, IllegalArgumentException, \nIllegalMonitorStateException, IllegalPathStateException, IllegalStateException, \nIllformedLocaleException, ImagingOpException, IncompleteAnnotationException, \nIndexOutOfBoundsException, JMRuntimeException, LSException, \nMalformedParameterizedTypeException, MirroredTypesException, MissingResourceException, \nNegativeArraySizeException, NoSuchElementException, NoSuchMechanismException, \nNullPointerException, ProfileDataException, ProviderException, \nProviderNotFoundException, RasterFormatException, RejectedExecutionException, \nSecurityException, SystemException, TypeConstraintException, \nTypeNotPresentException, UndeclaredThrowableException, UnknownEntityException, \nUnmodifiableSetException, UnsupportedOperationException, WebServiceException, \nWrongMethodTypeException");

        }else if(usrIn == 18){
            System.out.println("\nYou chose: 18) StringIndexOutOfBoundsException");
            System.out.println("It is thrown by String class methods to indicate that an index is either \nnegative than the size of the string");
            System.out.println("Outputs: ");
            String a = "A very long string I guess?"; // length is 27
            char c = a.charAt(29); // accessing 30th element
            System.out.println(c);

        }else if(usrIn == 19){
            System.out.println("\nYou chose: 19) StringIndexOutOfBoundsException (fixed)");
            System.out.println("It is thrown by String class methods to indicate that an index is either \nnegative than the size of the string");
            System.out.println("Outputs: ");
            try {
                String a = "This is like chipping "; // length is 22
                char c = a.charAt(24); // accessing 25th element
                System.out.println(c);
            }
            catch(StringIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        }
        goAgain();
    }

    public static void goAgain(){
        Scanner scan = new Scanner(System.in);

        boolean keepGoing = false;
        do{
            System.out.println("Would you like to run again? (y/n): ");
            String usrIn = scan.nextLine();
            keepGoing = false;
            if (usrIn.equals("y") || usrIn.equals("Y")){
                runException(chooseException());
            }else if (usrIn.equals("n") || usrIn.equals("N")) {
                keepGoing = false;
                System.out.println("Bye!");
            }else{
                System.out.println("Not valid.");
                keepGoing = true;
            }
        } while (keepGoing);
    }
}
