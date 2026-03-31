public class CompareStringBufferWithStringBuilder {
    public static void main(String[] args) {

        int n = 1_000_000;
        long startTime, endTime;

        // StringBuilder performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;
        System.out.println("StringBuilder time: " + builderTime + " ns");

        // StringBuffer performance
        startTime = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }
        endTime = System.nanoTime();
        long bufferTime = endTime - startTime;
        System.out.println("StringBuffer time: " + bufferTime + " ns");

        // Comparison result
        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster than StringBuffer");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder");
        }
    }
}
