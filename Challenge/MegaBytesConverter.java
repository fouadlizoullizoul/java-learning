public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    // write code here
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int megabytes=kiloBytes / 1024;
        int remainingkilobytes = kiloBytes % 1024; 
            if(kiloBytes < 0){
                System.out.println("Invalid Value");
            }else{
                System.out.println(kiloBytes + " KB = " + megabytes + " MB " + "and " +  remainingkilobytes + " KB");
            }
    }
}