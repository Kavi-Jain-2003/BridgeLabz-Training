public class StringConcatPerformance {

    public static void main(String[] args) {

        int n = 100000; // number of concatenations

        // -------- Using String --------
        long startString = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a"; // creates new object every time
        }
        long endString = System.nanoTime();
        long strTime = endString - startString;

        // -------- Using StringBuilder --------
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // -------- Using StringBuffer --------
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuf.append("a");
        }
        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // -------- Results --------
        System.out.println("--- String Concatenation Performance ---");
        System.out.println("Operations Count: " + n);

        System.out.println("String        : " + strTime + " ns");
        System.out.println("StringBuilder : " + builderTime + " ns");
        System.out.println("StringBuffer  : " + bufferTime + " ns");
        if (strTime < bufferTime && strTime < builderTime) {
            System.out.println(" string takes less time in concatenation");
        } else if (builderTime < strTime && builderTime < bufferTime) {
            System.out.println(" stringbuilder takes less time in concatenation");
        } else {
            System.out.println(" stringbuffer takes less time in concatenation");
        }
    }
}
